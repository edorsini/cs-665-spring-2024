package patterns.template.slides;

abstract class AbstractDrink {
  final void templateMethod() {
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
    hook();
  }

  abstract void primitiveOperation1();

  abstract void primitiveOperation2();

  void concreteOperation() {
    // implementation here...
  }

  /**
   * A concrete method that may do nothing by default.
   * Subclasses may override but they do not have to.
   */
  void hook() {
  }
}

