package pe.gob.oefa.be;

import java.io.Serializable;

public class Comisionado implements Serializable{
	
	private static final long serialVersionUID = 2346713062978579349L;
	
	private String c_c_grupo;
	private String c_c_codigo; 
	private String c_t_nombre; 
	private String c_t_apellido_paterno;
	private String c_t_apellido_materno;
	private String c_t_nombre_completo;
	private String c_c_situacion_trab; 
	private String c_t_email_inst; 
	private String d_nacimiento; 
	private String c_c_area; 
	private String c_c_puesto; 
	private String c_t_area; 
	private String c_t_puesto; 
	private String c_dni; 
	private String c_sexo;
	
	public String getC_sexo() {
		return c_sexo;
	}
	public void setC_sexo(String c_sexo) {
		this.c_sexo = c_sexo;
	}
	public String getC_c_grupo() {
		return c_c_grupo;
	}
	public void setC_c_grupo(String c_c_grupo) {
		this.c_c_grupo = c_c_grupo;
	}
	public String getC_c_codigo() {
		return c_c_codigo;
	}
	public void setC_c_codigo(String c_c_codigo) {
		this.c_c_codigo = c_c_codigo;
	}
	public String getC_t_nombre() {
		return c_t_nombre;
	}
	public void setC_t_nombre(String c_t_nombre) {
		this.c_t_nombre = c_t_nombre;
	}
	public String getC_t_apellido_paterno() {
		return c_t_apellido_paterno;
	}
	public void setC_t_apellido_paterno(String c_t_apellido_paterno) {
		this.c_t_apellido_paterno = c_t_apellido_paterno;
	}
	public String getC_t_apellido_materno() {
		return c_t_apellido_materno;
	}
	public void setC_t_apellido_materno(String c_t_apellido_materno) {
		this.c_t_apellido_materno = c_t_apellido_materno;
	}
	public String getC_t_nombre_completo() {
		return c_t_nombre_completo;
	}
	public void setC_t_nombre_completo(String c_t_nombre_completo) {
		this.c_t_nombre_completo = c_t_nombre_completo;
	}
	public String getC_c_situacion_trab() {
		return c_c_situacion_trab;
	}
	public void setC_c_situacion_trab(String c_c_situacion_trab) {
		this.c_c_situacion_trab = c_c_situacion_trab;
	}
	public String getC_t_email_inst() {
		return c_t_email_inst;
	}
	public void setC_t_email_inst(String c_t_email_inst) {
		this.c_t_email_inst = c_t_email_inst;
	}
	public String getD_nacimiento() {
		return d_nacimiento;
	}
	public void setD_nacimiento(String d_nacimiento) {
		this.d_nacimiento = d_nacimiento;
	}
	public String getC_c_area() {
		return c_c_area;
	}
	public void setC_c_area(String c_c_area) {
		this.c_c_area = c_c_area;
	}
	public String getC_c_puesto() {
		return c_c_puesto;
	}
	public void setC_c_puesto(String c_c_puesto) {
		this.c_c_puesto = c_c_puesto;
	}
	public String getC_t_area() {
		return c_t_area;
	}
	public void setC_t_area(String c_t_area) {
		this.c_t_area = c_t_area;
	}
	public String getC_t_puesto() {
		return c_t_puesto;
	}
	public void setC_t_puesto(String c_t_puesto) {
		this.c_t_puesto = c_t_puesto;
	}
	public String getC_dni() {
		return c_dni;
	}
	public void setC_dni(String c_dni) {
		this.c_dni = c_dni;
	}
}
