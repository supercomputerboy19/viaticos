package pe.gob.oefa.controller.menu;

import javax.el.MethodExpression;

import org.apache.el.MethodExpressionImpl;
import org.primefaces.model.MenuModel;
import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;

public class MenuBean {
	private MenuModel model;

	public MenuBean() {  
		model = new DefaultMenuModel();  
		//Primer submenu
		Submenu submenu = new Submenu();  
		submenu.setLabel("Comision de Servicios");
		
		MenuItem item = new MenuItem();
		item.setValue("Requerimiento de comision");
		//item.setUrl("#{BuscarComision.mostrar}");
		MethodExpression actionExpression = new MethodExpressionImpl("#{BuscarComision.mostrar}", null, null, null, null, null);
		item.setActionExpression(actionExpression);
		submenu.getChildren().add(item);
		
		MenuItem item1 = new MenuItem();
		item1.setValue("Registrar Comisión");
		//item1.setUrl("#{IngresoComision.mostrar}");
		actionExpression = new MethodExpressionImpl("#{IngresoComision.mostrar}", null, null, null, null, null);
		item.setActionExpression(actionExpression);
		submenu.getChildren().add(item1);
		
		model.addSubmenu(submenu);  

		//Segundo submenu  
		submenu = new Submenu();  
		submenu.setLabel("Generacion de Planilla de viaticos");  

		item = new MenuItem();  
		item.setValue("Calculo de viaticos");  
		item.setUrl("#");  
		submenu.getChildren().add(item);  

		//"Rendición de gastos"
		model.addSubmenu(submenu);

		//Tercero submenu
		submenu = new Submenu();  
		submenu.setLabel("Rendicion de Gastos");  

		item = new MenuItem();  
		item.setValue("Declaracion Jurada");  
		item.setUrl("#");  
		submenu.getChildren().add(item);
		item = new MenuItem();  
		item.setValue("Rendición de comisión");  
		item.setUrl("#");
		submenu.getChildren().add(item);
		model.addSubmenu(submenu);
		//Salir
		MenuItem menuItemSalir = new MenuItem();
		menuItemSalir.setValue("Salir");
		menuItemSalir.setUrl("");
		model.addMenuItem(menuItemSalir);
	}

	public MenuModel getModel() {  
		return model;  
	}	
}
