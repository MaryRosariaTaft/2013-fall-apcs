import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	double t1, t2;

	Sorter r = new Sorter(100,5), s = new Sorter(100,5), t = new Sorter(100,5), u=new Sorter(100,5), v=new Sorter(100,5);

	System.out.println("Array's Sort Method");
	System.out.println();
	System.out.println("Original array:\n"+r);
	System.out.println();
	t1 = System.currentTimeMillis();
	Arrays.sort(r.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+r);
	System.out.println();
	System.out.println("Time required with Array's sort method: "+(t2-t1));
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();

	System.out.println("Radix Sort");
	System.out.println();
	System.out.println("Original array:\n"+s);
	System.out.println();
	t1 = System.currentTimeMillis();
	s.rsort(s.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+s);
	System.out.println();
	System.out.println("\nTime required with radix sort: "+(t2-t1));
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();

	System.out.println("Bubble Sort");
	System.out.println();
	System.out.println("Original array:\n"+t);
	System.out.println();
	t1 = System.currentTimeMillis();
	t.bsort(t.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+t);
	System.out.println();
	System.out.println("\nTime required with bubble sort: "+(t2-t1));
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();

	System.out.println("Selection Sort");
	System.out.println();
	System.out.println("Original array:\n"+u);
	System.out.println();
	t1 = System.currentTimeMillis();
	u.ssort(u.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+u);
	System.out.println();
	System.out.println("\nTime required with selection sort: "+(t2-t1));
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();

	System.out.println("Insertion Sort");
	System.out.println();
	System.out.println("Original array:\n"+v);
	System.out.println();
	t1 = System.currentTimeMillis();
	v.isort(v.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+v);
	System.out.println();
	System.out.println("\nTime required with insertion sort: "+(t2-t1));
	System.out.println();
	System.out.println("--------------------------");
	System.out.println();

    }

}
