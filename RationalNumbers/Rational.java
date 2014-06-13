import java.io.*;
import java.util.*;

public class Rational {
    private int a, b;
    private double d;

    public Rational(int x, int y) {
	a = x;
	if (y != 0)
	    b = y;
	else {
	    System.out.println("Your denominator cannot equal 0.  Set another value, or it will automatically be changed to 1.");
	    b = 1;
	}
             d = (double)(x)/(double)(y);
    }

    public void setNumerator(int x) {
	a = x;
    }

    public void setDenominator(int y) {
	if (y != 0)
	    b = y;
	else {
	    System.out.println("Your denominator cannot equal 0.  Set another value, or it will automatically be changed to 1.");
	    b = 1;
	}
    }

    public int gcd(int a, int b) {
	if (b == 0)
	    return a;
	else
	    return gcd(b,a%b);
    }

    public void reduce() {
	int gcf = gcd(a,b);
	a = a / gcf;
	b = b / gcf;
    }

    public boolean equals(Rational other) {
	return this.d == other.d;
    }

    public Rational mult(Rational other) {
	int x = this.a * other.a,
	      y = this.b * other.b;
	Rational r = new Rational(x,y);
	//	r.reduce();
	return r;
    }

    public int compareTo(Rational other) {
	if (this.d > other.d)
	    return 1;
	else if (this.d < other.d)
	    return -1;
	else
	    return 0;
    }

    public String getFraction() {
	return "" + a + "/" + b;
    }

    public String getFraction(Rational r) {
	return "" + r.a + "/" + r.b;
    }

}
