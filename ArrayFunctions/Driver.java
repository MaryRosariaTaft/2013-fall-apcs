import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayStuff as = new ArrayStuff(),
	    nas = new ArrayStuff("example from the site");
	System.out.println("All methods using " + as + "(a random array)\n");
	System.out.println("First instance of the value at index 18: " +as.find(as.get(18)));
	System.out.println("Location of index -5: " + as.find(-5));
	System.out.println("Higest value: " + as.get(as.findMaxIndex()));
	System.out.println("Mean: " + as.mean());
	System.out.println("Variance: " + as.variance());
	System.out.println("Standard Deviation: " + as.stddev());
	System.out.println();
	System.out.println("Homework methods using " + nas + " (the array from mathisfun.com)\n");
	System.out.println("Mean: " + nas.mean());
	System.out.println("Variance: " + nas.variance());
	System.out.println("Standard Deviation: " + nas.stddev());
    }

}
