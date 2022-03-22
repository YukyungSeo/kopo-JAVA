package kr.ac.kopo.day09.homework0321;

class Shape {

	private double area; // 얘의 접근제한자는 어떤것이 좋을까?

	public Shape() {
	}

	public Shape(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void printArea() {
		System.out.printf("Shape의 면적은 %.2f입니다.\n", this.area);
	}
}
