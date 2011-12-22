/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;
 
import com.ibatis.dao.client.Dao;

import pe.gob.oefa.be.DeclaracionJurada;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface DeclaracionJuradaDAO extends Dao {
    
    public abstract void insertDeclaracionJurada(DeclaracionJurada domain) throws DAOException;
    public abstract void updateDeclaracionJurada(DeclaracionJurada domain) throws DAOException;
    
}
