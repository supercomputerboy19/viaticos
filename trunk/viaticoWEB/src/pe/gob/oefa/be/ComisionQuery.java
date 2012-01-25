package pe.gob.oefa.be;

import java.util.Date;

public class ComisionQuery {
	String numComision;
	String apePaterno;
	String apeMaterno; 
	String nombre;
	Date fInicio;
	Date fFin;
	public ComisionQuery(String numComision2, String apePaterno2,
			String apeMaterno2, Date fInicio2, Date fFin2) {
		numComision = numComision2;
		apePaterno = apePaterno2;
		apeMaterno = apeMaterno2;
		fInicio = fInicio2;
		fFin = fFin2;		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumComision() {
		return numComision;
	}
	public void setNumComision(String numComision) {
		this.numComision = numComision;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public Date getfInicio() {
		return fInicio;
	}
	public void setfInicio(Date fInicio) {
		this.fInicio = fInicio;
	}
	public Date getfFin() {
		return fFin;
	}
	public void setfFin(Date fFin) {
		this.fFin = fFin;
	}
}
