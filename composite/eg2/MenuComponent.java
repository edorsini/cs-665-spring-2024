package patterns.composite.eg2;

public abstract class MenuComponent {
  /**
   * Makes sense for Menu (composite)
   */
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  /**
   * Makes sense for Menu (composite)
   */
  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  /**
   * Makes sense for Menu (composite)
   */
  public MenuComponent getChild(int i) {
    throw new UnsupportedOperationException();
  }

  /**
   * Makes sense for MenuItem (leaf)
   */
  public String getName() {
    throw new UnsupportedOperationException();
  }

  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  public int getSize() {
    throw new UnsupportedOperationException();
  }

  public void print() {
    throw new UnsupportedOperationException();
  }

}

