package patterns.decorator;

public  class Foglight extends FeatureDecorator{
	// IS relationship because Foglight extends Car
	// AND and HAS-A RELATIONSHIP because FeatureDecorator HAS-A Car

	
	public Foglight(Car car) {
		this.car = car;
	}

	@Override
	public double getCost() {
		return 1500 + car.getCost();
	}

	@Override
	public String getDescription() {
		return car.getDescription() + ", " + "includes foglights";
	}

}
