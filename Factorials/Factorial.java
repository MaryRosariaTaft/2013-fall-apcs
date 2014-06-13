import java.io.*;
import java.util.*;

public class Factorial {

    public int fact(int n) {
	if (n == 0)
	    return 1;
	else
	    return n * fact(n - 1);
    }

    public int fact2(int n) {
	if (n == 0)
	    return 1;
	int t = 1;
	while (n > 0) {
	    t = t * n;
	    n = n - 1;
	}
	return t;
    }

    public int gcd(int a, int b) {
	int x;
	if (a > b)
	    x = b;
	else
	    x = a;
	while (a % x != 0 || b % x != 0)
	    x = x - 1;
	return x;
    }

    public int gcd2(int a, int b) {
	while (b != 0) {
	    int r = a;
	    a = b;
	    b = r%b;
	}
	return a;
    }

    public boolean isPrime(int n) {
	if (n < 2)
	    return true;
	int r = 2; 
	while (r < n && gcd2(n, r) == 1) {
	    r = r + 1;
	    if (r == n)
		return true;
	}
	return false;
    }

}
