package kr.ac.kopo.day12;

class Car {

	private String name;
	private String carNumber;

	public Car() {
		super();
	}

	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + "]";
	}

}