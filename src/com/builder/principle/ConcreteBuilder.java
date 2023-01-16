package com.builder.principle;

public class ConcreteBuilder implements Builder {
	
	Car car = null;

	public ConcreteBuilder() {
		car = new Car();
	}
	
	@Override
	public void buildHead() {
		car.setHead("Car Head constrution completed");
	}

	@Override
	public void buildBody() {
		car.setBody("Car Body constrution completed");
	}

	@Override
	public void buildWheel() {
		car.setWheel("Car Wheel constrution completed");
		
	}

	@Override
	public Car buildPart() {
		return car;
	}
	
	

}
