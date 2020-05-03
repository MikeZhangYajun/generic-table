package cst8284.genericTable;
/*
 * ZHANG Yajun
 * 040958689
 */

import java.util.List;

public class Table {

	public static <E extends Comparable<E>> void outputTable(List<E> arList) {
		System.out.print("\t\t");
		for (E header : arList)
			System.out.printf("%-16s", header);
		for (E row : arList) {
			System.out.print("\n" + row + (row.toString().length() < 8 ? "\t\t" : "\t"));
			for (E column : arList)
				System.out.printf("%-16s", compareResults(column, row));
		}
		System.out.println("\n");
	}

	public static <E extends Comparable<E>> String compareResults(E obj1, E obj2) {
		return obj1.compareTo(obj2) == 0 ? "=" : obj1.compareTo(obj2) > 0 ? ">" : "<";
	}
}
