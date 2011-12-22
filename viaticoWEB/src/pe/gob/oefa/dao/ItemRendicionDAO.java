/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;
 
import com.ibatis.dao.client.Dao;

import pe.gob.oefa.be.ItemRendicion;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface ItemRendicionDAO extends Dao {
    
    public abstract void insertItemRendicion(ItemRendicion domain) throws DAOException;
    public abstract void removeItemRendicion(ItemRendicion domain) throws DAOException;
    
}
