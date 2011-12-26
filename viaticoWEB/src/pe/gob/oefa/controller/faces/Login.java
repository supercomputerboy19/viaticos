package pe.gob.oefa.controller.faces;


import java.io.Serializable;

public class Login implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String usr;
    private String pass;
    private String cadRpta;

    //private String recuperarContra;
    //private String rptaRecupera;
    public Login(){
    	
    }
    
	public String validaSesion(){
		
		return "test";
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