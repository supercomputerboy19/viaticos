/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;


import java.util.List;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.dao.ComisionDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

/**
 *
 * @author root
 */
public class ComisionImplDAO extends SqlMapDaoTemplate implements ComisionDAO {
    
    public ComisionImplDAO(DaoManager daoManager) {
        super(daoManager);
    }
    
    public Integer insertComision(Comision domain) throws DAOException {
		
    	Integer id = null;
    	
    	try {
    		
			id = (Integer) getSqlMapExecutor().insert("Comision.insertComision",domain);
    		
		} catch (DataAccessException e) {
			throw new DAOException(e.getMessage(),e);
	    } catch (Exception e) {
		    throw new UnexpectedException(e.getMessage(), e);
        }	
		return id;
    }

    public void updateComision(Comision domain) throws DAOException {
        
        try {
		
            getSqlMapExecutor().update("Comision.updateComision",domain);
		
		} catch (DataAccessException e) {
				
	            throw new DAOException(e.getMessage(),e);
	    		
		} catch (Exception e) {
				
		    throw new UnexpectedException(e.getMessage(), e);
            
        }
        
    }

    @SuppressWarnings("unchecked")
	public List<Comision> getComision(Comision domain) throws DAOException {
        
        List<Comision> listComisiones = null;
        
        try {
		
            listComisiones = (List<Comision>)getSqlMapExecutor().queryForList("Comision.getComisiones", domain);
		
        } catch (DataAccessException e) {
			
            throw new DAOException(e.getMessage(),e);
    		
		} catch (Exception e) {
			
	    throw new UnexpectedException(e.getMessage(), e);
            
        }
        
        return listComisiones;
    }
    
    public Comision findByID(Comision domain) throws DAOException {
    
    	Comision comision = null;
        
        try {
		
            comision = (Comision)getSqlMapExecutor().queryForList("Comision.findById", domain);
		
        } catch (DataAccessException e) {
			
            throw new DAOException(e.getMessage(),e);
    		
		} catch (Exception e) {
			
			throw new UnexpectedException(e.getMessage(), e);
            
        }
        
        return comision;
    	
    }
}
