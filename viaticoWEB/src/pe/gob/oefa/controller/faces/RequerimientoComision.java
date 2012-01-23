package pe.gob.oefa.controller.faces;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.controller.bussines.ComisionCN;
import pe.gob.oefa.utiles.CONSTANTE;
import pe.gob.oefa.utiles.Utiles;

public class RequerimientoComision implements Serializable {
	private Comision comision;
	
	private static final long serialVersionUID = -3662028712521578121L;
	
	private String nombres;
	private String apellidos;
	private String dni;
	private String sexo;
	private String cargo;
	private String dependencia;
	private String condicionLaboral;
	private Date fechaSalida;
	private Date fechaRetorno;
	private String destino;
	private String objetivo;
	private Date fechaGestion;
	private String asignacionDiaria;
	
	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Date getFechaRetorno() {
		return fechaRetorno;
	}

	public void setFechaRetorno(Date fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public Date getFechaGestion() {
		return fechaGestion;
	}

	public void setFechaGestion(Date fechaGestion) {
		this.fechaGestion = fechaGestion;
	}
	
	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	public String getCondicionLaboral() {
		return condicionLaboral;
	}

	public void setCondicionLaboral(String condicionLaboral) {
		this.condicionLaboral = condicionLaboral;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Comision getComision() {
		return comision;
	}

	public void setComision(Comision comision) {
		this.comision = comision;
	}

	public RequerimientoComision(){
		
	}
	
	
	public String buscar(){
		
		
		
		return CONSTANTE.SUCCESS;
	}
	
	public String mostrar(){
		try{
			Map<String, Object> mapSession = Utiles.getSession();
			Comisionado comisionado = (Comisionado) mapSession.get(CONSTANTE.COMISIONADO);
			if(comisionado!=null){
				nombres = comisionado.getC_t_nombre();
				apellidos = comisionado.getC_t_apellido_paterno() + " " + comisionado.getC_t_apellido_materno();
				dni = comisionado.getC_dni();
				sexo = comisionado.getC_sexo();
				cargo = comisionado.getC_c_puesto();
				condicionLaboral = comisionado.getC_c_situacion_trab();
				dependencia = comisionado.getC_c_area();
			}
			if(comision==null){
				comision = new Comision();
			}
			return CONSTANTE.SUCCESS;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public String registrar(){
		try{
			Map<String, Object> mapSession = Utiles.getSession();
			Comisionado comisionado = (Comisionado) mapSession.get(CONSTANTE.COMISIONADO);
			
			comision.setCcCodigo(comisionado.getC_c_codigo());
			
			comision.setDestino(destino);
			comision.setFechaSalida(fechaSalida);
			comision.setFechaRetorno(fechaRetorno);
			comision.setFechaGestion(fechaGestion);
			comision.setObjetivo(objetivo);
			comision.setAsignacionDiaria(asignacionDiaria);
			comision.setFechaSalida(fechaSalida);
			
			comision.setViaAerea(comision.getViaAerea());
			comision.setViaTerrestre(comision.getViaTerrestre());
			comision.setTuua(comision.getTuua());
			comision.setPasajeTerrestre(comision.getPasajeTerrestre());
			
			ComisionCN.getComisionCN().registrarComision(comision);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return CONSTANTE.SUCCESS;
	}
}