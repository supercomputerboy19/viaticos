package pe.gob.oefa.controller.faces;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.controller.bussines.ComisionCN;
import pe.gob.oefa.utiles.CONSTANTE;

public class BuscarComision  implements Serializable {

	private static final long serialVersionUID = 8744156318728041544L;
	
	private String apePaterno;
	private String apeMaterno;
	private Date fInicio;
	private Date fFin;
	private String numComision;
	private String tituloVentana;
	private List<Comision> comisiones;
	
	public String getNumComision() {
		return numComision;
	}

	public String getTituloVentana() {
		return tituloVentana;
	}

	public void setTituloVentana(String tituloVentana) {
		this.tituloVentana = tituloVentana;
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

	public List<Comision> getComisiones() {
		ComisionCN comisionCN = ComisionCN.getComisionCN();
		List<Comision> comisiones = comisionCN.getComisiones(numComision,apePaterno,apeMaterno,fInicio,fFin);
		System.out.println("Buscar Comision "+comisiones.size());
		return comisiones;
	}

	public void setComisiones(List<Comision> comisiones) {
		this.comisiones = comisiones;
	}

	public String mostrar(){
	
		return CONSTANTE.SUCCESS;
	}
	
	public String buscar(){
		
		return CONSTANTE.SUCCESS;
	}
	
	public String requerimiento(){
		tituloVentana = CONSTANTE.TITULO_REQUERIMIENTO; 
		return CONSTANTE.SUCCESS;
	}
	
	public String nuevoRequerimiento(){
		
		return CONSTANTE.SUCCESS;
	}
	
	public String rendicion(){
		tituloVentana = CONSTANTE.TITULO_RENDICION;
		return CONSTANTE.SUCCESS;
	}
	public String 	calculoViatico(){
		tituloVentana = CONSTANTE.TITULO_CALCULOVIATICO;
		return CONSTANTE.SUCCESS;
	}
}