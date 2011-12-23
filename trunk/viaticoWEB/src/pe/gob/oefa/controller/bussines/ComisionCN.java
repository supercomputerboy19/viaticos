package pe.gob.oefa.controller.bussines;

import java.util.List;

import com.ibatis.dao.client.DaoException;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.be.EstadoComision;
import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.dao.ComisionDAO;
import pe.gob.oefa.dao.DeclaracionJuradaDAO;
import pe.gob.oefa.dao.EstadoComisionDAO;
import pe.gob.oefa.dao.ItemRendicionDAO;
import pe.gob.oefa.dao.ParametroDAO;
import pe.gob.oefa.exception.DAOException;

public class ComisionCN {

	ComisionDAO comisionDAO = null;
	DeclaracionJuradaDAO declaracionJuradaDAO = null;
	EstadoComisionDAO estadoComisionDAO = null;
	ItemRendicionDAO itemRendicionDAO = null;
	ParametroDAO  parametroDAO = null;
	
	Comision registrarComision(Comision domain) throws Exception {
		
		try {
			
			Integer id = comisionDAO.insertComision(domain);
			
			if(id != null) {
			
				EstadoComision estadoComision = new EstadoComision();
				estadoComision.setComentario(domain.getComentarioEstado());
				estadoComision.setComisionId(id);
				estadoComision.setEstadoId(domain.getEstadoId());
				estadoComision.setFechaEstado(domain.getFechaGestion());
				estadoComision.setUsuarioId(domain.getUsuarioId());
				estadoComision.setViaticoId(null);
				
				estadoComisionDAO.insertEstadoComision(estadoComision);
				
				domain.setComisionId(id);
			}
		}
		catch(DaoException daoException) {
			
		}
		return domain;
	}
	
	public List<Parametro> getParametrosByTabla(Parametro domain) throws Exception {
		return parametroDAO.getParametrosByTabla(domain);
	}
}
