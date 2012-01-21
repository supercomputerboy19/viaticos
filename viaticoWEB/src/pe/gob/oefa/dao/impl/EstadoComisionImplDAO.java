package pe.gob.oefa.dao.impl;

import java.io.IOException;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.EstadoComision;
import pe.gob.oefa.dao.EstadoComisionDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;
import pe.gob.oefa.utiles.Utiles;

import com.ibatis.sqlmap.client.SqlMapClient;

public class EstadoComisionImplDAO implements EstadoComisionDAO {

	SqlMapClient	sqlMap;
	
	public EstadoComisionImplDAO(){
		try {
			sqlMap		= Utiles.getSqlMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void insertEstadoComision(EstadoComision domain) throws DAOException {
	    
		try {
			sqlMap.insert("EstadoComision.insertEstadoComision",domain);
		} catch (DataAccessException e) {
		        throw new DAOException(e.getMessage(),e);
	    } catch (Exception e) {
		    throw new UnexpectedException(e.getMessage(), e);
        }
		
	}
}
