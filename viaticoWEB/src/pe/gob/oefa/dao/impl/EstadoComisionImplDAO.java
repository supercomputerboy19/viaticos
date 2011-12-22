package pe.gob.oefa.dao.impl;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.EstadoComision;
import pe.gob.oefa.dao.EstadoComisionDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

public class EstadoComisionImplDAO extends SqlMapDaoTemplate implements EstadoComisionDAO {
	
	 public EstadoComisionImplDAO(DaoManager daoManager) {
	        super(daoManager);
	    }

	@Override
	public void insertEstadoComision(EstadoComision domain) throws DAOException {
	    
		try {
			
            getSqlMapExecutor().insert("EstadoComision.insertEstadoComision",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }	
		
	}
}
