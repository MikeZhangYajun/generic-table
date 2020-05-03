package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */

public class Square extends BasicShape {

	public Square() {
		this(1.0);
	}

	public Square(double width) {
		super(width);
	}

	public Square(Square square) {
		this(square.getWidth());
	}

	@Override
	public double getArea() {
		return getWidth() * getWidth();
	}

	@Override
	public double getPerimeter() {
		return 4 * getWidth();
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Square) ? getWidth() == ((Square) obj).getWidth() : false;
	}
}
