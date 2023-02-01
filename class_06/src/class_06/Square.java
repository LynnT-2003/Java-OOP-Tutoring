package class_06;

public class Square extends GeometricObject{
	private double side;
	
	public Square() {
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square(double side, String color, boolean filled) {
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}
	
	public double getPerimeter() {
		return side*4;
	}
}
