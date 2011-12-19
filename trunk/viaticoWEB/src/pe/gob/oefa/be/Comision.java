/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.be;

import java.util.Date;

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

public class Comision {    
    
    private Date fechaSalida;
    private String fechaSalidaRangoInicial;
    private String fechaSalidaRangoFinal;
    private Date fechaRetorno;
    private String objetivo;
    private Date fechaGestion;
    private String destino;
    private String viaAerea;
    private String viaTerrestre;
    private String tuua;
    private String pasajeTerrestre;
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

    public String getPasajeTerrestre() {
        return pasajeTerrestre;
    }

    public void setPasajeTerrestre(String pasajeTerrestre) {
        this.pasajeTerrestre = pasajeTerrestre;
    }

    public String getTipoActividadId() {
        return tipoActividadId;
    }

    public void setTipoActividadId(String tipoActividadId) {
        this.tipoActividadId = tipoActividadId;
    }

    public String getTuua() {
        return tuua;
    }

    public void setTuua(String tuua) {
        this.tuua = tuua;
    }

    public String getViaAerea() {
        return viaAerea;
    }

    public void setViaAerea(String viaAerea) {
        this.viaAerea = viaAerea;
    }

    public String getViaTerrestre() {
        return viaTerrestre;
    }

    public void setViaTerrestre(String viaTerrestre) {
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
