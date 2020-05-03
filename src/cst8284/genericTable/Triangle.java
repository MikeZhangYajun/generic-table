package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */

public class Triangle extends BasicShape {

	public Triangle() {
		this(1.0);
	}

	protected Triangle(double width) {
		super(width);
	}

	public Triangle(Triangle triangle) {
		this(triangle.getWidth());
	}

	@Override
	public double getArea() {
		return Math.sqrt(3) / 4 * getWidth() * getWidth();
	}

	@Override
	public double getPerimeter() {
		return 3 * getWidth();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Triangle) ? getWidth() == ((Triangle) obj).getWidth() : false;
	}

}
