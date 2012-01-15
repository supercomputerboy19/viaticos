/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;
 
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import pe.gob.oefa.be.Parametro;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface ParametroDAO {
    
    public abstract List<Parametro> getParametrosByTabla(Parametro domain) throws DAOException;
    
    public Parametro getParametroById(String id) throws IOException, SQLException; 
}