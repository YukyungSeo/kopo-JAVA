package kr.ac.kopo.day09.abs02;

abstract class Printer {

	private String model;

	public Printer() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Printer(String model) {
		this.setModel(model);
	}

	public abstract void print();
}
