import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Factorial f;
	f = new Factorial();

	int i, j, k, l, m, n;
	i = 0;
	j = 1;
	k = 2;
	l = 3;
	m = 4;
	n = 5;

	System.out.println("Factorials: in each pair of numbers,");
	System.out.println("the first test uses a method with if statements, and");
	System.out.println("the second test uses a method with a while loop.");
	System.out.println();

	System.out.println(i + "-->" + f.fact(i));
	System.out.println(i + "-->" + f.fact2(i));
	System.out.println();

	System.out.println(j + "-->" + f.fact(j));
	System.out.println(j + "-->" + f.fact2(j));
	System.out.println();

	System.out.println(k + "-->" + f.fact(k));
	System.out.println(k + "-->" + f.fact2(k));
	System.out.println();

	System.out.println(l + "-->" + f.fact(l));
	System.out.println(l + "-->" + f.fact2(l));
	System.out.println();

	System.out.println(m + "-->" + f.fact(m));
	System.out.println(m + "-->" + f.fact2(m));
	System.out.println();

	System.out.println(n + "-->" + f.fact(n));
	System.out.println(n + "-->" + f.fact2(n));
	System.out.println();

	System.out.println("Greatest common denominator tests");
	System.out.println();

	System.out.println("Using an inefficient method:");
	System.out.println("GCD of 8 and 12: " + f.gcd(8, 12));
	System.out.println("GCD of 13 and 23: " + f.gcd(13, 23));
	System.out.println("GCD of 1500450271 and 1024243321: " + f.gcd(1500450271, 1024243321));
	System.out.println();

	System.out.println("Using Euclid's method:");
	System.out.println("GCD of 8 and 12: " + f.gcd2(8, 12));
	System.out.println("GCD of 13 and 23: " + f.gcd2(13, 23));
	System.out.println("GCD of 1500450271 and 1024243321: " + f.gcd(1500450271, 1024243321));
	System.out.println();

	System.out.println("Prime number tests");
	System.out.println();

	System.out.println("12: " + f.isPrime(12));
	System.out.println("23: " + f.isPrime(23));
	System.out.println("1024243321: " + f.isPrime(1024243321));

	/*I tried doing this:
	   f.gcd2(2074722246773485207821695222107608587480996474721117292752992589912196684750549658310084416732550077, 7212610147295474909544523785043492409969382148186765460082500085393519556525921455588705423020751421
	   but Java couldn't handle it.
	   A shame.
	*/

    }

}
