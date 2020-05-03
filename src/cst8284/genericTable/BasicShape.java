package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */

public abstract class BasicShape implements Comparable<BasicShape> {

	private double width;

	protected BasicShape(double width) {
		setWidth(width);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return (getClass().getSimpleName());
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public int compareTo(BasicShape obj) {
		double result = getArea() - obj.getArea();
		return Math.abs(result) < 1e-8 ? 0 : result > 0 ? 1 : -1;
	}

}
