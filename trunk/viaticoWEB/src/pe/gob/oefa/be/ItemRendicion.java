package pe.gob.oefa.be;

import java.io.Serializable;
import java.util.Date;

public class ItemRendicion  implements Serializable {

	/**
	 * DESCRIPCIONITEM	VARCHAR2(20)	Y			
VIATICOID	VARCHAR2(20)	Y			
FECHA	DATE	Y			
NUMDOCUMENTO	VARCHAR2(20)	Y			
PROOVEDOR	VARCHAR2(20)	Y			
CONCEPTO	VARCHAR2(20)	Y			
MONTO	NUMBER(5,4)	Y			
ITEMID	NUMBER(4)	N			
COMISIONID	NUMBER(10)	N			
TIPODOCID	VARCHAR2(8)	Y			
	 */
	private static final long serialVersionUID = 1L;
	private String descripcionItem;
	private String viaticoId;
	private Date fecha;
	private String numDocumento;
	private String proovedor;
	private String concepto;
	private Double monto;
	private Integer itemId;
	private Integer comisionId;
	private String tipoDocId;
	
	public String getDescripcionItem() {
		return descripcionItem;
	}
	public void setDescripcionItem(String descripcionItem) {
		this.descripcionItem = descripcionItem;
	}
	public String getViaticoId() {
		return viaticoId;
	}
	public void setViaticoId(String viaticoId) {
		this.viaticoId = viaticoId;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getNumDocumento() {
		return numDocumento;
	}
	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	public String getProovedor() {
		return proovedor;
	}
	public void setProovedor(String proovedor) {
		this.proovedor = proovedor;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getComisionId() {
		return comisionId;
	}
	public void setComisionId(Integer comisionId) {
		this.comisionId = comisionId;
	}
	public String getTipoDocId() {
		return tipoDocId;
	}
	public void setTipoDocId(String tipoDocId) {
		this.tipoDocId = tipoDocId;
	}
	
	@Override
    public String toString() {
	    
        String cadena = "descripcionItem = " + descripcionItem +"\n" +
                        "viaticoId = " + viaticoId +"\n" +
                        "fecha = " + fecha +"\n" +
                        "numDocumento = " + numDocumento +"\n" +
                        "proovedor = " + proovedor +"\n" +
                        "concepto = " + concepto +"\n" +
                        "monto = " + monto +"\n" +
                        "itemId = " + itemId +"\n" +
                        "comisionId = " + comisionId +"\n" +
                        "tipoDocId = " + tipoDocId +"\n" +
                         "---------------------------------------------";
        
        return cadena;
	}
}
