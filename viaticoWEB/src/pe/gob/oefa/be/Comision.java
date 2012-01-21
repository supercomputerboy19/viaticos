/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.be;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author root
 */

   /*
  <selectKey resultClass="int" type="pre" property="comisionId">
            SELECT COMISIONSEQUENCE.NEXTVAL AS VALUE FROM DUAL
        </selectkey>
 * 
    FECHASALIDA        NOT NULL DATE         
FECHARETORNO       NOT NULL DATE         
OBJETIVO           NOT NULL VARCHAR2(40) 
FECHAGESTION       NOT NULL DATE         
DESTINO                     VARCHAR2(30) 
VIAAEREA                    CHAR(1)      
VIATERRESTRE                CHAR(1)      
TUUA                        CHAR(1)      
PASAJETERRESTRE             CHAR(1)      
ASIGNACIONDIARIA            VARCHAR2(6)  
COMISIONID         NOT NULL NUMBER(10)   
ASIGNACIONDIARIAID          VARCHAR2(20) 
FECHAAUTORIZACION           DATE         
COMENTARIOESTADO            VARCHAR2(20) 
NUMCERTPRESUPU              VARCHAR2(10) 
NUMSIAF                     VARCHAR2(10) 
MONTOTUUA                   NUMBER(5,4)  
MONTOVIATERRESTRE           NUMBER(5,4)  
MONTOVIAAEREA               NUMBER(5,4)  
MONTOHOSPEDAJE              NUMBER(5,4)  
NUMCOMPROBANTEPAGO          VARCHAR2(10) 
NUMRECIBOING                VARCHAR2(10) 
C_C_CODIGO         NOT NULL VARCHAR2(30) 
ESTADOID                    VARCHAR2(8)  
TIPOACTIVIDADID             VARCHAR2(8) 
   */ 

public class Comision implements Serializable {    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date fechaSalida;
    private String fechaSalidaRangoInicial;
    private String fechaSalidaRangoFinal;
    private Date fechaRetorno;
    private String objetivo;
    private Date fechaGestion;
    private String destino;
    private Boolean viaAerea;
    private Boolean viaTerrestre;
    private Boolean tuua;
    private Boolean pasajeTerrestre;
    private String asignacionDiaria;
    private Integer comisionId;
    private String asigancionDiariaId;
    private Date fechaAutorizacion;
    private String comentarioEstado;
    private String numcertpresupu;
    private String numSIAF;
    private Double montoTUUA;
    private Double montoViaTerrestre;
    private Double montoViaAerea;
    private Double montoHospedaje;
    private String numComprobantePago;
    private String numReciboIng;
    private String ccCodigo;
    private String estadoId;
    private String tipoActividadId;
    private String usuarioId;
    private DeclaracionJurada declaracionJurada;
    private List<ItemRendicion> items;
    
    public String getUsuarioId() {
 		return usuarioId;
 	}

 	public void setUsuarioId(String usuarioId) {
 		this.usuarioId = usuarioId;
 	}
    public DeclaracionJurada getDeclaracionJurada() {
		return declaracionJurada;
	}

	public void setDeclaracionJurada(DeclaracionJurada declaracionJurada) {
		this.declaracionJurada = declaracionJurada;
	}

	public List<ItemRendicion> getItems() {
		return items;
	}

	public void setItems(List<ItemRendicion> items) {
		this.items = items;
	}

	public void setFechaSalidaRangoInicial(String fechaSalidaRangoInicial) {
		this.fechaSalidaRangoInicial = fechaSalidaRangoInicial;
	}

	public String getFechaSalidaRangoFinal() {
        return fechaSalidaRangoFinal;
    }

    public void setFechaSalidaRangoFinal(String fechaSalidaRangoFinal) {
        this.fechaSalidaRangoFinal = fechaSalidaRangoFinal;
    }

    public String getFechaSalidaRangoInicial() {
        return fechaSalidaRangoInicial;
    }

    public void setFechaSalidaRangoIncial(String fechaSalidaRangoInicial) {
        this.fechaSalidaRangoInicial = fechaSalidaRangoInicial;
    }
    
    public String getAsigancionDiariaId() {
        return asigancionDiariaId;
    }

    public void setAsigancionDiariaId(String asigancionDiariaId) {
        this.asigancionDiariaId = asigancionDiariaId;
    }

    public String getAsignacionDiaria() {
        return asignacionDiaria;
    }

    public void setAsignacionDiaria(String asignacionDiaria) {
        this.asignacionDiaria = asignacionDiaria;
    }

    public String getCcCodigo() {
        return ccCodigo;
    }

    public void setCcCodigo(String ccCodigo) {
        this.ccCodigo = ccCodigo;
    }

    public String getComentarioEstado() {
        return comentarioEstado;
    }

    public void setComentarioEstado(String comentarioEstado) {
        this.comentarioEstado = comentarioEstado;
    }

    public Integer getComisionId() {
        return comisionId;
    }

    public void setComisionId(Integer comisionId) {
        this.comisionId = comisionId;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(String estadoId) {
        this.estadoId = estadoId;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public Date getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(Date fechaGestion) {
        this.fechaGestion = fechaGestion;
    }

    public Date getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(Date fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getMontoHospedaje() {
        return montoHospedaje;
    }

    public void setMontoHospedaje(Double montoHospedaje) {
        this.montoHospedaje = montoHospedaje;
    }

    public Double getMontoTUUA() {
        return montoTUUA;
    }

    public void setMontoTUUA(Double montoTUUA) {
        this.montoTUUA = montoTUUA;
    }

    public Double getMontoViaAerea() {
        return montoViaAerea;
    }

    public void setMontoViaAerea(Double montoViaAerea) {
        this.montoViaAerea = montoViaAerea;
    }

    public Double getMontoViaTerrestre() {
        return montoViaTerrestre;
    }

    public void setMontoViaTerrestre(Double montoViaTerrestre) {
        this.montoViaTerrestre = montoViaTerrestre;
    }

    public String getNumComprobantePago() {
        return numComprobantePago;
    }

    public void setNumComprobantePago(String numComprobantePago) {
        this.numComprobantePago = numComprobantePago;
    }

    public String getNumReciboIng() {
        return numReciboIng;
    }

    public void setNumReciboIng(String numReciboIng) {
        this.numReciboIng = numReciboIng;
    }

    public String getNumSIAF() {
        return numSIAF;
    }

    public void setNumSIAF(String numSIAF) {
        this.numSIAF = numSIAF;
    }

    public String getNumcertpresupu() {
        return numcertpresupu;
    }

    public void setNumcertpresupu(String numcertpresupu) {
        this.numcertpresupu = numcertpresupu;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Boolean getPasajeTerrestre() {
        return pasajeTerrestre;
    }

    public void setPasajeTerrestre(Boolean pasajeTerrestre) {
        this.pasajeTerrestre = pasajeTerrestre;
    }

    public String getTipoActividadId() {
        return tipoActividadId;
    }

    public void setTipoActividadId(String tipoActividadId) {
        this.tipoActividadId = tipoActividadId;
    }

    public Boolean getTuua() {
        return tuua;
    }

    public void setTuua(Boolean tuua) {
        this.tuua = tuua;
    }

    public Boolean getViaAerea() {
        return viaAerea;
    }

    public void setViaAerea(Boolean viaAerea) {
        this.viaAerea = viaAerea;
    }

    public Boolean getViaTerrestre() {
        return viaTerrestre;
    }

    public void setViaTerrestre(Boolean viaTerrestre) {
        this.viaTerrestre = viaTerrestre;
    }
    
    @Override
    public String toString() {
    
        String cadena = "fechaSalida = " + fechaSalida +"\n" +
                        "fechaRetorno = " + fechaRetorno +"\n" +
                        "objetivo = " + objetivo +"\n" +
                        "fechaGestion = " + fechaGestion +"\n" +
                        "destino = " + destino +"\n" +
                        "viaAerea = " + viaAerea +"\n" +
                        "viaTerrestre = " + viaTerrestre +"\n" +
                        "tuua = " + tuua +"\n" +
                        "pasajeTerrestre = " + pasajeTerrestre +"\n" +
                        "asignacionDiaria = " + asignacionDiaria +"\n" +
                        "comisionId = " + comisionId +"\n" +
                        "asigancionDiariaId = " + asigancionDiariaId +"\n" +
                        "fechaAutorizacion = " + fechaAutorizacion +"\n" +
                        "comentarioEstado = " + comentarioEstado +"\n" +
                        "numcertpresupu = " + numcertpresupu +"\n" +
                        "numSIAF = " + numSIAF +"\n" +
                        "montoTUUA = " + montoTUUA +"\n" +
                        "montoViaTerrestre = " + montoViaTerrestre +"\n" +
                        "montoViaAerea = " + montoViaAerea +"\n" +
                        "montoHospedaje = " + montoHospedaje +"\n" +
                        "numComprobantePago = " + numComprobantePago +"\n" +
                        "numReciboIng = " + numReciboIng +"\n" +
                        "ccCodigo = " + ccCodigo +"\n" +
                        "estadoId = " + estadoId +"\n" +
                        "tipoActividadId = " + tipoActividadId  +"\n" +
                         "---------------------------------------------";
        
        return cadena;
    }
}
