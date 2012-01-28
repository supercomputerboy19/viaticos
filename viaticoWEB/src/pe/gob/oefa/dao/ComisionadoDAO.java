/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao;

import java.util.List;

import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.exception.DAOException;

/**
 *
 * @author root
 */
public interface ComisionadoDAO {
    
	public abstract Comisionado findByCodigo(String c_c_codigo) throws DAOException;

	public abstract List<Comisionado> buscarComisionados(Comisionado domain);
	
}
