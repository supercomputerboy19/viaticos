package pe.gob.oefa.controller.faces;

import java.io.Serializable;
import java.util.Map;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.utiles.CONSTANTE;
import pe.gob.oefa.utiles.Utiles;

public class IngresoComision implements Serializable {
	
	private String nombres;
	private String apellidos;
	private String dni;
	private String sexo;
	private String cargo;
	private String dependencia;
	private String condicionLaboral;
	private Comision comision;
	
	private static final long serialVersionUID = -3662028712521578121L;
	
	
	public IngresoComision(){
		
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
	
	public String mostrar(){
		try{
			Map<String, Object> mapSession = Utiles.getSession();
			Comisionado comisionado = (Comisionado) mapSession.get(CONSTANTE.COMISIONADO);
			
			nombres = comisionado.getC_t_nombre();
			apellidos = comisionado.getC_t_apellido_paterno() + " " + comisionado.getC_t_apellido_materno();
			dni = comisionado.getC_dni();
			sexo = comisionado.getC_sexo();
			cargo = comisionado.getC_c_puesto();
			condicionLaboral = comisionado.getC_c_situacion_trab();
			dependencia = comisionado.getC_c_area();
			
			if(comision==null){
				comision = new Comision();
			}
			
			System.out.println("Fin Ingresar Comision");
			return CONSTANTE.SUCCESS;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public String registrar(){
		
		return CONSTANTE.SUCCESS;
	}

}