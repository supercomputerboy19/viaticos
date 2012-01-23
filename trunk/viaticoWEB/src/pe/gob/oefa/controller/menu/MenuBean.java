package pe.gob.oefa.controller.menu;

import java.io.Serializable;

import javax.el.MethodExpression;
import javax.faces.component.UIComponent;
import javax.faces.el.MethodBinding;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import org.apache.el.MethodExpressionImpl;
import org.primefaces.model.MenuModel;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;

import com.sun.faces.application.ActionListenerImpl;
import com.sun.faces.application.MethodBindingMethodExpressionAdapter;

public class MenuBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3917387642621365705L;
	private MenuModel model;

	public MenuBean() {  
		model = new DefaultMenuModel();  
		//Primer submenu
		Submenu subMenu = new Submenu();  
		subMenu.setLabel("Comision de Servicios");
		
			MenuItem item = new MenuItem();
			item.setValue("Requerimiento de comision");
			item.setUrl("buscarComision.xhtml");
			//MethodExpression methodExpression = new MethodExpressionImpl("#{BuscarComision.mostrar}", null, null, null, null, null);
			//item.setActionExpression(methodExpression);
			item.setAjax(false);
		subMenu.getChildren().add(item);
			
			MenuItem item1 = new MenuItem();
			item1.setValue("Registrar Comisión");
			item1.setUrl("ingresoComision.xhtml");
			//methodExpression = new MethodExpressionImpl("#{IngresoComision.mostrar}", null, null, null, null, null);
			//item.setActionExpression(methodExpression);
			item.setAjax(false);
		subMenu.getChildren().add(item1);
		
		model.addSubmenu(subMenu);  

		//Segundo submenu  
		subMenu = new Submenu();  
		subMenu.setLabel("Generacion de Planilla de viaticos");  

			item = new MenuItem();  
			item.setValue("Calculo de viaticos");  
			item.setUrl("#");  
			subMenu.getChildren().add(item);  

		//"Rendición de gastos"
		model.addSubmenu(subMenu);

		//Tercero submenu
		subMenu = new Submenu();  
		subMenu.setLabel("Rendicion de Gastos");  

			item = new MenuItem();  
			item.setValue("Declaracion Jurada");  
			item.setUrl("#");  
			subMenu.getChildren().add(item);
			item = new MenuItem();  
			item.setValue("Rendición de comisión");  
			item.setUrl("#");
			subMenu.getChildren().add(item);
			
		model.addSubmenu(subMenu);
			
		//Salir
		MenuItem menuItemSalir = new MenuItem();
		menuItemSalir.setValue("Salir");
		menuItemSalir.setUrl("");
		model.addMenuItem(menuItemSalir);
		
		//MethodBinding methodBinding = new MethodBindingMethodExpressionAdapter(methodExpression);
		//item.setAction(methodBinding);
	}

	public MenuModel getModel() {  
		return model;  
	}	
}
