package pe.gob.oefa.dao;

import pe.gob.oefa.be.EstadoComision;
import pe.gob.oefa.exception.DAOException;

public interface EstadoComisionDAO {

	public abstract void insertEstadoComision(EstadoComision domain) throws DAOException;
	
}
