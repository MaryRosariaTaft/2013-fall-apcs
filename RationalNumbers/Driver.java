import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	
	Rational r = new Rational(1,2),
	    s = new Rational(1,3),
	    t = new Rational(2,3);

	System.out.println("Don't try to set a denominator to zero.  For example, trying to make the fraction \"1/0\" will make this will happen:");
	Rational u = new Rational(1,0);
	System.out.println("So, the fraction value ended up being: " + u.getFraction());
	u.setDenominator(9);
	System.out.println("Changed denominator to 9.\nNew fraction: " + u.getFraction());
	u.setNumerator(3);
	System.out.println("Changed numerator to 3.\nNew fraction: " + u.getFraction());
	System.out.print("Reduced 3/9 to ");
	u.reduce();
	System.out.println(u.getFraction() + ".");

	System.out.println();

	System.out.println("Does 1/2 equal 1/2? " + r.equals(r));
	System.out.println("Does 1/2 equal 1/3? " + r.equals(s));
	System.out.println("Does 1/2 equal 2/3? " + r.equals(t));

	System.out.println();

	System.out.println(r.mult(r) + ", 1/2 * 1/2, has a value of " + r.getFraction(r.mult(r)));
	System.out.println(r.mult(s) + ", 1/2 * 1/3, has a value of " + r.getFraction(r.mult(s)));
	System.out.print(r.mult(t) + ", 1/2 * 2/3, has a value of " + r.getFraction(r.mult(t)));
	Rational temp = r.mult(t);
	temp.reduce();
	System.out.println(" or " + temp.getFraction());

	System.out.println();

	System.out.println("If 1/2 is greater than the input, the return value will be 1; if it is less, the return value will be -1; if it is equal, the return value wil be 0.");
	System.out.println("Input: 1/2 --> returns " + r.compareTo(r));
	System.out.println("Input: 1/3 --> returns " + r.compareTo(s));
	System.out.println("Input: 2/3 --> returns " + r.compareTo(t));

    }

}
