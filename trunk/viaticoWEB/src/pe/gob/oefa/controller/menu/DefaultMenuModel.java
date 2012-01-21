package pe.gob.oefa.controller.menu;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.MenuModel;

public class DefaultMenuModel implements MenuModel
 {

	List<MenuItem> listMenuItem = new ArrayList<MenuItem>();
	List<Submenu> listSubMenu = new ArrayList<Submenu>();
	
	@Override
	public void addMenuItem(MenuItem menuItem) {
		listMenuItem.add(menuItem);
	}

	@Override
	public void addSubmenu(Submenu subMenu) {
		listSubMenu.add(subMenu);
	}

	@Override
	public List<MenuItem> getMenuItems() {
		return listMenuItem;
	}

	@Override
	public List<Submenu> getSubmenus() {
		return listSubMenu;
	}
}
