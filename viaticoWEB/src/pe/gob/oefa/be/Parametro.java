package pe.gob.oefa.be;

import java.io.Serializable;

public class Parametro implements Serializable {

	/**
	 * PARAMETROID	VARCHAR2(8)	N			
DESCRIPCION	VARCHAR2(20)	Y			
VALOR1	VARCHAR2(20)	Y			
VALOR2	VARCHAR2(20)	Y			
VALOR3	VARCHAR2(20)	Y			
TABLAID	VARCHAR2(4)	Y			
	 */
	private static final long serialVersionUID = 1L;
	
	private String parametroId;
	private String descripcion;
	private String valor1;
	private String valor2;
	private String valor3;
	private String tablaId;
	
	public String getParametroId() {
		return parametroId;
	}
	public void setParametroId(String parametroId) {
		this.parametroId = parametroId;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getValor1() {
		return valor1;
	}
	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}
	public String getValor2() {
		return valor2;
	}
	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}
	public String getValor3() {
		return valor3;
	}
	public void setValor3(String valor3) {
		this.valor3 = valor3;
	}
	public String getTablaId() {
		return tablaId;
	}
	public void setTablaId(String tablaId) {
		this.tablaId = tablaId;
	}

}
