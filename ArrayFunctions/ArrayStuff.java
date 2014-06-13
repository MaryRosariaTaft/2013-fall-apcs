import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private double[] d;
    private Random r;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
	d = new double[a.length];
    }

    public ArrayStuff(String description) {
	a = new int[] {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
	d = new double[a.length];
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }
    
    public int findMaxIndex() {
	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]>a[maxi])
		maxi=i;
	}
	return maxi;
    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    public double mean() {
	double t = 0;
	for (int i=0;i<a.length;i++)
	    t+=a[i];
	return t/a.length;
    }

    public double variance() {
	double mean = mean(), sum = 0;
	for (int i=0;i<a.length;i++)
	    sum += (a[i]-mean)*(a[i]-mean);
	return sum/a.length;
    }

    public double stddev() {
	return Math.sqrt(variance());
    }

    public int freq(int n) {
	int count = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n) {
		count=count+1;
	    }
	}
	return count;
    }

    public void mode() {
	//Plan: Make a new array (or something other type of list)
	//which contains all the values of the desired array, without
	//repeats.  (For example, if the array is {2,2,8,4,8,1},
	//the new array would be {2,8,4,1}.)  Then, check the frequencies
	//of the values in the latter list in the former list, and
	//compare those frequencies.  (Dictionaries would be really nice.)
    }

}
