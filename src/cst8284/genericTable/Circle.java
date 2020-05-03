package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */

public class Circle extends BasicShape {

	public Circle() {
		this(1.0);
	}

	public Circle(double width) {
		super(width);

	}

	public Circle(Circle circle) {
		this(circle.getWidth());
	}

	@Override
	public double getArea() {
		return Math.PI / 4 * getWidth() * getWidth();
	}

	@Override
	public double getPerimeter() {
		return Math.PI * getWidth();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Circle) ? getWidth() == ((Circle) obj).getWidth() : false;
	}

}
