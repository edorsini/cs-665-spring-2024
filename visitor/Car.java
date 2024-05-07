package patterns.visitor;

interface Car {
  int getSpeed();

  String goFast();

  void accept(CarVisitor carVisitor); // <-- Needed for the Visitor Pattern
}

