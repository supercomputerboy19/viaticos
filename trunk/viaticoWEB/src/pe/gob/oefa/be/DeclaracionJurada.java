package pe.gob.oefa.be;

import java.io.Serializable;
import java.util.Date;

public class DeclaracionJurada  implements Serializable {

	/**
	 * ITEMID	NUMBER(4)	N			
FECHA	DATE	Y			
DESCRIPCIONGASTO	VARCHAR2(20)	Y			
MONTO	NUMBER(5,4)	Y			
COMISIONID	NUMBER(10)	N			
	 */
	private static final long serialVersionUID = 1L;
	private Integer itemId;
	private String descripcionGasto;
	private Date fecha;
	private Double monto;
	private Integer comisionId;
	
	public String getDescripcionGasto() {
		return descripcionGasto;
	}
	public void setDescripcionGasto(String descripcionGasto) {
		this.descripcionGasto = descripcionGasto;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Integer getComisionId() {
		return comisionId;
	}
	public void setComisionId(Integer comisionId) {
		this.comisionId = comisionId;
	}
	
	@Override
    public String toString() {
	    
        String cadena = "itemId = " + itemId +"\n" +
                        "descripcionGasto = " + descripcionGasto +"\n" +
                        "fecha = " + fecha +"\n" +
                        "monto = " + monto +"\n" +
                        "comisionId = " + comisionId +"\n" +
                         "---------------------------------------------";
        
        return cadena;
	}
}
