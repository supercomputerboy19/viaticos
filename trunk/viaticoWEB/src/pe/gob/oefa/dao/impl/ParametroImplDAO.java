/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.dao.ParametroDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.utiles.Utiles;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 *
 * @author root
 */
public class ParametroImplDAO implements ParametroDAO {
    
    /*public ParametroImplDAO(DaoManager daoManager) {
        super(daoManager);
    }*/

	public List<Parametro> getParametrosByTabla(Parametro domain) throws DAOException {
        
        List<Parametro> listParametro = null;
        
        /*try {
		
            listParametro = (List<Parametro>)getSqlMapExecutor().queryForList("Parametro.getParametroByTabla", domain);
		
        } catch (DataAccessException e) {
			
            throw new DAOException(e.getMessage(),e);
    		
		} catch (Exception e) {
			
	    throw new UnexpectedException(e.getMessage(), e);
            
        }*/
        
        return listParametro;
    }
    
	public Parametro getParametroById(String id) throws IOException, SQLException {
		//String			resource	= "pe/gob/oefa/dao/map/SqlMapConfig.xml";
		//Reader			reader		= Resources.getResourceAsReader(resource);
		//SqlMapClient	sqlMap		= SqlMapClientBuilder.buildSqlMapClient(reader);
		SqlMapClient	sqlMap		= Utiles.getSqlMap();
		Parametro		parametro	= (Parametro)sqlMap.queryForObject("getParametro", id);

		return parametro;
	}
}
