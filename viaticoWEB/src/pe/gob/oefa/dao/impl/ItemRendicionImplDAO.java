/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.ItemRendicion;

import pe.gob.oefa.dao.ItemRendicionDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

/**
 *
 * @author root
 */
public class ItemRendicionImplDAO extends SqlMapDaoTemplate implements ItemRendicionDAO {
    
    public ItemRendicionImplDAO(DaoManager daoManager) {
        super(daoManager);
    }
    
    public void insertItemRendicion(ItemRendicion domain) throws DAOException {
		
        try {
		
            getSqlMapExecutor().insert("ItemRendicion.insertItemRendicion",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }	
		
    }

    public void removeItemRendicion(ItemRendicion domain) throws DAOException {
        
        try {
		
            getSqlMapExecutor().update("ItemRendicion.removeItemRendicion",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }
        
    }

}
