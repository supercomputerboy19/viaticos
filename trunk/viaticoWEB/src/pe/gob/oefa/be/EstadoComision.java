package pe.gob.oefa.be;

import java.io.Serializable;
import java.util.Date;


/*
 * VIATICOID	VARCHAR2(20)	N			
USUARIOID	VARCHAR2(20)	N			
FECHAESTADO	DATE	Y			
COMENTARIO	VARCHAR2(20)	Y			
COMISIONID	NUMBER(10)	Y			
ESTADOID	VARCHAR2(8)	Y			
 * */

public class EstadoComision  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String usuarioId;
	private Date fechaEstado;
	private String comentario;
	private Integer comisionId;
	private String estadoId;
	
	public String getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Date getFechaEstado() {
		return fechaEstado;
	}
	public void setFechaEstado(Date fechaEstado) {
		this.fechaEstado = fechaEstado;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Integer getComisionId() {
		return comisionId;
	}
	public void setComisionId(Integer comisionId) {
		this.comisionId = comisionId;
	}
	public String getEstadoId() {
		return estadoId;
	}
	public void setEstadoId(String estadoId) {
		this.estadoId = estadoId;
	}	
	
	@Override
    public String toString() {
	    
        String cadena = "usuarioId = " + usuarioId +"\n" +
                        "fechaEstado = " + fechaEstado +"\n" +
                        "comentario = " + comentario +"\n" +
                        "comisionId = " + comisionId +"\n" +
                        "estadoId = " + estadoId +"\n" +
                         "---------------------------------------------";
        
        return cadena;
	}
}
