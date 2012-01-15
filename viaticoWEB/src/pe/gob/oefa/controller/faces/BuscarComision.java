package pe.gob.oefa.controller.faces;

import java.io.Serializable;

public class BuscarComision  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8744156318728041544L;

	public String mostrar(){
		System.out.println("Buscar Comision");
		return "mostrar";
	}
}