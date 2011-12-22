/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;


import java.util.List;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.dao.ParametroDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;

import com.ibatis.dao.client.DaoManager;
import com.ibatis.dao.client.template.SqlMapDaoTemplate;

/**
 *
 * @author root
 */
public class ParametroImplDAO extends SqlMapDaoTemplate implements ParametroDAO {
    
    public ParametroImplDAO(DaoManager daoManager) {
        super(daoManager);
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Parametro> getParametrosByTabla(Parametro domain) throws DAOException {
        
        List<Parametro> listParametro = null;
        
        try {
		
            listParametro = (List<Parametro>)getSqlMapExecutor().queryForList("Parametro.getParametroByTabla", domain);
		
        } catch (DataAccessException e) {
			
            throw new DAOException(e.getMessage(),e);
    		
		} catch (Exception e) {
			
	    throw new UnexpectedException(e.getMessage(), e);
            
        }
        
        return listParametro;
    }
    
}
