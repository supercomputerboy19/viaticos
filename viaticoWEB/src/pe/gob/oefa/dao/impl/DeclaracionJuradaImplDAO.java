/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;

import org.springframework.dao.DataAccessException;


import pe.gob.oefa.be.DeclaracionJurada;

import pe.gob.oefa.dao.DeclaracionJuradaDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

/**
 *
 * @author root
 */
public class DeclaracionJuradaImplDAO extends SqlMapDaoTemplate implements DeclaracionJuradaDAO {
    
    public DeclaracionJuradaImplDAO(DaoManager daoManager) {
        super(daoManager);
    }
    
    public void insertDeclaracionJurada(DeclaracionJurada domain) throws DAOException {
		
        try {
		
            getSqlMapExecutor().insert("DeclaracionJurada.insertDeclaracionJurada",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }	
		
    }

    public void updateDeclaracionJurada(DeclaracionJurada domain) throws DAOException {
        
        try {
		
            getSqlMapExecutor().update("DeclaracionJurada.updateDeclaracionJurada",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }
        
    }

}
