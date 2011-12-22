/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;
 
import com.ibatis.dao.client.Dao;
import java.util.List;
import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface ParametroDAO extends Dao {
    
    public abstract List<Parametro> getParametrosByTabla(Parametro domain) throws DAOException;
    
}
