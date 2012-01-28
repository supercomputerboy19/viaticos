package pe.gob.oefa.dao.impl;

import java.util.List;

import pe.gob.oefa.be.Comisionado;
import pe.gob.oefa.dao.ComisionadoDAO;
import pe.gob.oefa.utiles.Utiles;
import com.ibatis.sqlmap.client.SqlMapClient;

public class ComisionadoImplDAO implements ComisionadoDAO {

	public Comisionado findByCodigo(String c_c_codigo){
		try{
			String codigo = c_c_codigo.toUpperCase();
			SqlMapClient	sqlMap		= Utiles.getSqlMap();
			Comisionado		comisionado	= (Comisionado)sqlMap.queryForObject("Comisionado.getComisionadoByCodigo", codigo);
			return comisionado;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Comisionado> buscarComisionados(Comisionado domain) {
		List<Comisionado> listComisiones;
		try{
			SqlMapClient	sqlMap		= Utiles.getSqlMap();
			listComisiones = (List<Comisionado>)sqlMap.queryForList("Comisionado.buscarComisionado", domain);
			return listComisiones;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
