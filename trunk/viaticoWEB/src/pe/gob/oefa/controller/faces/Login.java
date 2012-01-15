package pe.gob.oefa.controller.faces;

import java.io.Serializable;
import java.util.Map;

import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.controller.bussines.ComisionCN;
import pe.gob.oefa.utiles.CONSTANTE;
import pe.gob.oefa.utiles.Utiles;

public class Login implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usr;
    private String pass;
    private String cadRpta;
    private ComisionCN oComisionCN;
    
    public Login(){
    	oComisionCN = new ComisionCN();
    }
    
	public String validaSesion(){
		try{
			Parametro parametro = null;
			Login login = (Login)Utiles.getBean("Login");
			
			if(login.getUsr()==null){
				cadRpta = "Error al iniciar sesión";
				return "fail";
			}else if(login.getUsr()!=null){
				if(login.getUsr().equalsIgnoreCase("COMISIONADO1")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_COMISIONADO);
				}else if(login.getUsr().equalsIgnoreCase("ASIST_ADM")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_ASIST_ADM);
				}else if(login.getUsr().equalsIgnoreCase("SEG_GEN")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_SEG_GEN);
				}else if(login.getUsr().equalsIgnoreCase("LOGIST")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_LOGIST);
				}else if(login.getUsr().equalsIgnoreCase("TESORERIA")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_TESORERIA);
				}else if(login.getUsr().equalsIgnoreCase("CONTA")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_CONTA);
				}else if(login.getUsr().equalsIgnoreCase("OPP")){
					parametro = oComisionCN.getParametroById(CONSTANTE.PERFIL_OPP);
				}else if(login.getUsr().equalsIgnoreCase("")){
					cadRpta = CONSTANTE.MENSAJE_LOGIN_NO_USUARIO;
					return "fail";
				}else{
					cadRpta = CONSTANTE.MENSAJE_LOGIN;
					return "fail";
				}
			}
			
			Comisionado comisionado = oComisionCN.getComisionadoByCodigo(login.getUsr());
			
			Map<String,Object> mapSession = Utiles.getSession();
			mapSession.put("user", login.getUsr());
			mapSession.put("perfilId", parametro.getParametroId());
			mapSession.put(CONSTANTE.COMISIONADO, comisionado);
			
			
			return "success";
		}catch (Exception e) {
			e.printStackTrace();
			cadRpta = CONSTANTE.MENSAJE_LOGIN_ERROR;
			return "fail";
		}
	}

	public String getUsr() {
		return usr;
	}

	public void setUsr(String usr) {
		this.usr = usr;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCadRpta() {
		return cadRpta;
	}

	public void setCadRpta(String cadRpta) {
		this.cadRpta = cadRpta;
	}
}