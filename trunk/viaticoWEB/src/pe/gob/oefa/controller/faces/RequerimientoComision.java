package pe.gob.oefa.controller.faces;

import java.io.Serializable;
import java.util.Map;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.controller.bussines.ComisionCN;
import pe.gob.oefa.utiles.CONSTANTE;
import pe.gob.oefa.utiles.Utiles;

public class RequerimientoComision implements Serializable {
	private Comision comision;
	private Comisionado comisionado;
	
	public Comision getComision() {
		if(comision==null){
			comision = new Comision();
		}
		return comision;
	}


	public void setComision(Comision comision) {
		this.comision = comision;
	}


	public Comisionado getComisionado() {
		if(comisionado==null){
			comisionado = new Comisionado();
		}
		System.out.println(comisionado.getC_c_codigo());
		return comisionado;
	}


	public void setComisionado(Comisionado comisionado) {
		this.comisionado = comisionado;
	}

	private static final long serialVersionUID = -3662028712521578121L;
	

	public RequerimientoComision(){
		
	}
	
	
	public String buscar(){
		System.out.println("buscar");
		return CONSTANTE.SUCCESS;
	}
	
	public String mostrar(){
		Comisionado comisionadoSession = (Comisionado)Utiles.getBean(CONSTANTE.COMISIONADO);
		this.comisionado = comisionadoSession;
		System.out.println("mostrar");
//		try{
//			Map<String, Object> mapSession = Utiles.getSession();
//			Comisionado comisionado = (Comisionado) mapSession.get(CONSTANTE.COMISIONADO);
//			if(comisionado!=null){
//				nombres = comisionado.getC_t_nombre();
//				apellidos = comisionado.getC_t_apellido_paterno() + " " + comisionado.getC_t_apellido_materno();
//				dni = comisionado.getC_dni();
//				sexo = comisionado.getC_sexo();
//				cargo = comisionado.getC_c_puesto();
//				condicionLaboral = comisionado.getC_c_situacion_trab();
//				dependencia = comisionado.getC_c_area();
//			}
//			if(comision==null){
//				comision = new Comision();
//			}
			return CONSTANTE.SUCCESS;
//		}catch(Exception e){
//			e.printStackTrace();
//			return null;
//		}
	}
	
	public String registrar(){
		try{
			Map<String, Object> mapSession = Utiles.getSession();
			Comisionado comisionado = (Comisionado) mapSession.get(CONSTANTE.COMISIONADO);
			
//			comision.setCcCodigo(comisionado.getC_c_codigo());
//			
//			comision.setDestino(destino);
//			comision.setFechaSalida(fechaSalida);
//			comision.setFechaRetorno(fechaRetorno);
//			comision.setFechaGestion(fechaGestion);
//			comision.setObjetivo(objetivo);
//			comision.setAsignacionDiaria(asignacionDiaria);
//			comision.setFechaSalida(fechaSalida);
//			
//			comision.setViaAerea(comision.getViaAerea());
//			comision.setViaTerrestre(comision.getViaTerrestre());
//			comision.setTuua(comision.getTuua());
//			comision.setPasajeTerrestre(comision.getPasajeTerrestre());
			
			ComisionCN.getComisionCN().registrarComision(comision);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return CONSTANTE.SUCCESS;
	}
}