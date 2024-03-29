package pe.gob.oefa.controller.bussines;

import java.util.Date;
import java.util.List;

import com.ibatis.dao.client.DaoException;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.be.EstadoComision;
import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.dao.ComisionDAO;
import pe.gob.oefa.dao.ComisionadoDAO;
import pe.gob.oefa.dao.DeclaracionJuradaDAO;
import pe.gob.oefa.dao.EstadoComisionDAO;
import pe.gob.oefa.dao.ItemRendicionDAO;
import pe.gob.oefa.dao.ParametroDAO;
import pe.gob.oefa.dao.impl.ComisionImplDAO;
import pe.gob.oefa.dao.impl.ComisionadoImplDAO;
import pe.gob.oefa.dao.impl.DeclaracionJuradaImplDAO;
import pe.gob.oefa.dao.impl.EstadoComisionImplDAO;
import pe.gob.oefa.dao.impl.ItemRendicionImplDAO;
import pe.gob.oefa.dao.impl.ParametroImplDAO;
import pe.gob.oefa.exception.DAOException;

public class ComisionCN {

	ComisionDAO	comisionDAO = null;
	DeclaracionJuradaDAO declaracionJuradaDAO = null;
	EstadoComisionDAO estadoComisionDAO = null;
	ItemRendicionDAO itemRendicionDAO = null;
	ParametroDAO  parametroDAO = null;
	ComisionadoDAO comisionadoDAO = null;
	
	private static ComisionCN comisionCN = null;
	
	private ComisionCN(){
		comisionDAO = new ComisionImplDAO();
		declaracionJuradaDAO = new DeclaracionJuradaImplDAO(null);
		estadoComisionDAO = new EstadoComisionImplDAO();
		itemRendicionDAO = new ItemRendicionImplDAO(null);
		parametroDAO = new ParametroImplDAO();
		comisionadoDAO = new ComisionadoImplDAO();
	}
	
	public static synchronized ComisionCN getComisionCN() {
		
		if(comisionCN == null) {
			comisionCN = new ComisionCN();
		}
		
		return comisionCN;
	}
	
	public Comision registrarComision(Comision domain) throws Exception {
		
		try {
			
			Integer id = comisionDAO.insertComision(domain);
			
			if(id != null) {
			
				EstadoComision estadoComision = new EstadoComision();
				estadoComision.setComentario(domain.getComentarioEstado());
				estadoComision.setComisionId(id);
				estadoComision.setEstadoId(domain.getEstadoId());
				estadoComision.setFechaEstado(new Date());
				estadoComision.setUsuarioId(domain.getUsuarioId());
				
				estadoComisionDAO.insertEstadoComision(estadoComision);
				
				domain.setComisionId(id);
			}
		}
		catch(DaoException daoException) {
			
		}
		return domain;
	}
	
	public List<Parametro> getParametrosByTabla(Parametro domain) throws Exception {
		parametroDAO = new ParametroImplDAO();
		return parametroDAO.getParametrosByTabla(domain);
	}
	
	public Parametro getParametroById(String id){
		try{
			parametroDAO = new ParametroImplDAO();
			Parametro parametro =  parametroDAO.getParametroById(id);
			return parametro;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Comisionado getComisionadoByCodigo(String codigo){
		comisionadoDAO = new ComisionadoImplDAO();
		Comisionado comisionado;
		try {
			comisionado = comisionadoDAO.findByCodigo(codigo);
		} catch (DAOException e) {
			comisionado = null;
			e.printStackTrace();
		}
		return comisionado;
	}

	public List<Comision> getComisiones(String numComision,String apePaterno, String apeMaterno,
			Date fInicio, Date fFin) {
		List<Comision> listComision;
		try {
			listComision = comisionDAO.buscarComision(numComision, apePaterno, apeMaterno, fInicio, fFin);
			
		} catch (Exception e) {
			listComision = null;
			e.printStackTrace();
		}
		return listComision;
	}

	public List<Comisionado> getComisionados(Comisionado comisionado) {
		try{
			List<Comisionado> listComisionado = comisionadoDAO.buscarComisionados(comisionado);
			return listComisionado;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
