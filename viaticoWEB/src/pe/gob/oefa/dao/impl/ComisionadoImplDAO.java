package pe.gob.oefa.dao.impl;

import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.dao.ComisionadoDAO;
import pe.gob.oefa.utiles.Utiles;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ComisionadoImplDAO implements ComisionadoDAO {

	public Comisionado findByCodigo(String c_c_codigo){
		try{
			String codigo = c_c_codigo.toUpperCase();
			SqlMapClient	sqlMap		= Utiles.getSqlMap();
			Comisionado		comisionado	= (Comisionado)sqlMap.queryForObject("getComisionadoByCodigo", codigo);
			return comisionado;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
