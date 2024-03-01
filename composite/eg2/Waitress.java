package patterns.composite.eg2;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
  /**
   * The waitress has a copy of all the menus.
   */
  ArrayList<MenuComponent> allMenus = new ArrayList<>();

  public Waitress(ArrayList<MenuComponent> allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    for (MenuComponent menu : allMenus) {
      menu.print();
    }
  }

  public void printVegetarianMenu() {
    // Print all vegan menu items
    for (MenuComponent menuComponent : allMenus) {
      // Get the next menu
      try {
        // Iterate through the menu
        for (int i = 0; i < menuComponent.getSize(); i++) {
          if (menuComponent.getChild(i).isVegetarian()) {
            // This only makes sense for Menu Items (the leaf nodes)
            menuComponent.getChild(i).print();
          }
        }
      } catch (UnsupportedOperationException e) {
        // The container nodes will have a problem!
        e.printStackTrace();
      }
    }
  }
}


