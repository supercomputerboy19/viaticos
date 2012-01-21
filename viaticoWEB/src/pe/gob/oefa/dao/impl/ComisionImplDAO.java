/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.oefa.dao.impl;


import java.io.IOException;
import java.util.List;

import org.springframework.dao.DataAccessException;

import pe.gob.oefa.be.Comision;
import pe.gob.oefa.dao.ComisionDAO;
import pe.gob.oefa.exception.DAOException;
import pe.gob.oefa.exception.UnexpectedException;
import pe.gob.oefa.utiles.Utiles;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 *
 * @author root
 */
public class ComisionImplDAO implements ComisionDAO {

	SqlMapClient	sqlMap;

	public ComisionImplDAO() {
		try {
			sqlMap		= Utiles.getSqlMap();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Integer insertComision(Comision domain) throws DAOException {

		Integer id = null;

		try {
			id = (Integer) sqlMap.insert("Comision.insertComision",domain);
			//id = (Integer) getSqlMapExecutor().insert("Comision.insertComision",domain);
		} catch (DataAccessException e) {
			throw new DAOException(e.getMessage(),e);
		} catch (Exception e) {
			throw new UnexpectedException(e.getMessage(), e);
		}	
		return id;
	}

	public void updateComision(Comision domain) throws DAOException {

		try {
			sqlMap.update("Comision.updateComision",domain);
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
			listComisiones = (List<Comision>)sqlMap.queryForObject("Comision.getComisiones", domain);
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
			comision = (Comision)sqlMap.queryForObject("Comision.findById", domain);
		} catch (DataAccessException e) {
			throw new DAOException(e.getMessage(),e);
		} catch (Exception e) {
			throw new UnexpectedException(e.getMessage(), e);
		}
		return comision;

	}
}
