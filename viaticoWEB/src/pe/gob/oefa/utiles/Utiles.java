package pe.gob.oefa.utiles;

import java.io.IOException;
import java.io.Reader;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class Utiles{
	@SuppressWarnings("deprecation")
	public static Object getBean(String beanName){
		FacesContext facesContext = FacesContext.getCurrentInstance();
		Object temporal = facesContext.getApplication().createValueBinding("#{" + beanName + "}").getValue(facesContext);
		return temporal;
	}
	
	public static Map<String,Object> getSession(){
		FacesContext context = FacesContext.getCurrentInstance();
		return context.getExternalContext().getSessionMap();
	}
	
	public static SqlMapClient getSqlMap() throws IOException{
		String			resource	= "pe/gob/oefa/dao/map/SqlMapConfig.xml";
		Reader			reader		= Resources.getResourceAsReader(resource);
		SqlMapClient	sqlMap		= SqlMapClientBuilder.buildSqlMapClient(reader);
		return sqlMap;
	}
}