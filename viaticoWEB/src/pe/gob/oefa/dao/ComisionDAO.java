/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;
 
import java.util.List;
import pe.gob.oefa.be.Comision;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface ComisionDAO {
    
	public abstract Comision findByID(Comision domain) throws DAOException;
    public abstract Integer insertComision(Comision domain) throws DAOException;
    public abstract void updateComision(Comision domain) throws DAOException;
    public abstract List<Comision> getComision(Comision domain) throws DAOException;
    
}
