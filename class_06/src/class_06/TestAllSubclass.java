package class_06;

public class TestAllSubclass {

	public static void main(String[] args) {
		Square s = new Square(2.0);
		s.setColor("Red");
		s.setFilled(true);
		System.out.println("Color: " + s.getColor());
		System.out.println("Filled: " + s.isFilled());
		System.out.println("Area: " + s.getArea());
		System.out.println("Perimeter: " + s.getPerimeter());
		System.out.println("Side: " + s.getSide());
		System.out.println("Date created: " + s.getDateCreated());
		System.out.println(s.getDateCreated());
		
		
		Rectangle r = new Rectangle(3.0, 2.2);
		r.setColor("Red");
		r.setFilled(true);
		System.out.println("Color: " + r.getColor());
		System.out.println("Filled: " + r.isFilled());
		System.out.println("Area: " + r.getArea());
		System.out.println("Perimeter: " + r.getPerimeter());
		System.out.println("Width: " + r.getWidth());
		System.out.println("Height: " + r.getHeight());
		System.out.println("Date created: " + s.getDateCreated());
		
		Circle c = new Circle(4.0);
		c.setColor("Pink");
		c.setFilled(true);
		System.out.println("Color: " + c.getColor());
		System.out.println("Filled: " + c.isFilled());
		System.out.println("Area: " + c.getArea());
		System.out.println("Perimeter: " + c.getPerimeter());
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Diameter: " + c.getDiameter());
		System.out.println("Date created: " + s.getDateCreated());
    }

	}

