package pe.gob.oefa.controller.faces;

import java.io.Serializable;

public class MenuPrincipal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String mostrarIngresarComision(){
		System.out.println("Ingresar Comision");
		return "mostrar";
	}
	
	public String mostrarBuscarComision(){
		System.out.println("Buscar Comision");
		return "mostrar";
	}
}
