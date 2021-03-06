package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */


import java.util.List;
import java.util.Arrays;

public class GenericTableLauncher {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<String> strings = Arrays.asList("Larry", "Moe", "Curly");
		List<BasicShape> objs = Arrays.asList(new Circle(5.64189583547756), new Square(4.0),
				new Triangle(6.078685485127), new Square(5.0));
		Table.outputTable(ints);
		Table.outputTable(strings);
		Table.outputTable(objs);
	}

}