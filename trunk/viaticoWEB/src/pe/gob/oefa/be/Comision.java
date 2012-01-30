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
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Date fechaSalida;
	private Date horaSalida;
    private String fechaSalidaRangoInicial;
    private String fechaSalidaRangoFinal;
    private Date fechaRetorno;
    private Date horaRetorno;
    private String objetivo;
    private Date fechaGestion;
    private String destino;
    private Boolean viaAerea;
    private Boolean viaTerrestre;
    private Boolean viaNinguno;
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
    private String otrosGastos;
    //Datos para la Solicitud de seguro
    private String lm;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccionTipoZona;
    private String direccionZona;
    private String direccionTipoVia;
    private String direccionVia;
    private String direccionNumero;
    private String direccionInterior;
    private String direccionManzana;
    private String direccionLote;
    private String direccionTelefono;
    private String beneficiarioNombre;
    private String beneficiarioDNI;
    private String observacionesSeguro;
    private String pasaporte;
    private String afp;
    private String remuneracion;
    private String seguroAccidentes;
    private String seguroTrabajoPension;
    private String seguroTrabajoSalud;
    
    private DeclaracionJurada declaracionJurada;
    private List<ItemRendicion> items;
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

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
    
    public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraRetorno() {
		return horaRetorno;
	}

	public void setHoraRetorno(Date horaRetorno) {
		this.horaRetorno = horaRetorno;
	}

	public Boolean getViaNinguno() {
		return viaNinguno;
	}

	public void setViaNinguno(Boolean viaNinguno) {
		this.viaNinguno = viaNinguno;
	}

	public String getOtrosGastos() {
		return otrosGastos;
	}

	public void setOtrosGastos(String otrosGastos) {
		this.otrosGastos = otrosGastos;
	}

	public String getLm() {
		return lm;
	}

	public void setLm(String lm) {
		this.lm = lm;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDireccionTipoZona() {
		return direccionTipoZona;
	}

	public void setDireccionTipoZona(String direccionTipoZona) {
		this.direccionTipoZona = direccionTipoZona;
	}

	public String getDireccionZona() {
		return direccionZona;
	}

	public void setDireccionZona(String direccionZona) {
		this.direccionZona = direccionZona;
	}

	public String getDireccionTipoVia() {
		return direccionTipoVia;
	}

	public void setDireccionTipoVia(String direccionTipoVia) {
		this.direccionTipoVia = direccionTipoVia;
	}

	public String getDireccionVia() {
		return direccionVia;
	}

	public void setDireccionVia(String direccionVia) {
		this.direccionVia = direccionVia;
	}

	public String getDireccionNumero() {
		return direccionNumero;
	}

	public void setDireccionNumero(String direccionNumero) {
		this.direccionNumero = direccionNumero;
	}

	public String getDireccionInterior() {
		return direccionInterior;
	}

	public void setDireccionInterior(String direccionInterior) {
		this.direccionInterior = direccionInterior;
	}

	public String getDireccionManzana() {
		return direccionManzana;
	}

	public void setDireccionManzana(String direccionManzana) {
		this.direccionManzana = direccionManzana;
	}

	public String getDireccionLote() {
		return direccionLote;
	}

	public void setDireccionLote(String direccionLote) {
		this.direccionLote = direccionLote;
	}

	public String getDireccionTelefono() {
		return direccionTelefono;
	}

	public void setDireccionTelefono(String direccionTelefono) {
		this.direccionTelefono = direccionTelefono;
	}

	public String getBeneficiarioNombre() {
		return beneficiarioNombre;
	}

	public void setBeneficiarioNombre(String beneficiarioNombre) {
		this.beneficiarioNombre = beneficiarioNombre;
	}

	public String getBeneficiarioDNI() {
		return beneficiarioDNI;
	}

	public void setBeneficiarioDNI(String beneficiarioDNI) {
		this.beneficiarioDNI = beneficiarioDNI;
	}

	public String getObservacionesSeguro() {
		return observacionesSeguro;
	}

	public void setObservacionesSeguro(String observacionesSeguro) {
		this.observacionesSeguro = observacionesSeguro;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getRemuneracion() {
		return remuneracion;
	}

	public void setRemuneracion(String remuneracion) {
		this.remuneracion = remuneracion;
	}

	public String getSeguroAccidentes() {
		return seguroAccidentes;
	}

	public void setSeguroAccidentes(String seguroAccidentes) {
		this.seguroAccidentes = seguroAccidentes;
	}

	public String getSeguroTrabajoPension() {
		return seguroTrabajoPension;
	}

	public void setSeguroTrabajoPension(String seguroTrabajoPension) {
		this.seguroTrabajoPension = seguroTrabajoPension;
	}

	public String getSeguroTrabajoSalud() {
		return seguroTrabajoSalud;
	}

	public void setSeguroTrabajoSalud(String seguroTrabajoSalud) {
		this.seguroTrabajoSalud = seguroTrabajoSalud;
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
