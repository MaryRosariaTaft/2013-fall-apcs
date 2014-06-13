import java.io.*;
import java.util.*;

public class ArrayMethods {

    // Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements. (http://codingbat.com/prob/p146449)

    public int[] middleWay(int[] a, int[] b) {
	int[] c = {a[1], b[1]};
	return c;
    }

    // Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.  (http://codingbat.com/prob/p101230)

    public int[] makeEnds(int[] nums) {
	int[] c = {nums[0], nums[nums.length - 1]};
	return c;
    }

    // Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works. The syntax to make a new int array is: new int[desired_length].  (http://codingbat.com/prob/p180920)

    public int[] fizzArray(int n) {
	int[] c = new int[n];
	for(n-=1; n>0; n--)
	    c[n] = n;
	return c;
    }

    // Given an array of ints, return true if every element is a 1 or a 4.  (http://codingbat.com/prob/p186672)

    public boolean only14(int[] nums) {
	for(int i=nums.length-1; i>=0; i--) {
	    if (nums[i] != 1 && nums[i] != 4)
		return false;
	}
	return true;
    }

    // Returns an array of size n where a_0=n, a_1=n-1, etc.
    public int[] revFill(int n) {
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = n - i;
        return a;
    }

    // Return an array betweeen min & max, with n random ints
    public int[] makeRandom(int n, int min, int max) {
        int[] a = new int[n];
        while (n>0) {
            Random r = new Random();
            a[n-1] = r.nextInt(max-min) + min;
            n--;
        }
        return a;
    }

    //  Return the sum of the numbers in the array, returning 0 for an empty array; however, since the number 13 is very unlucky, it and numbers that come immediately after it (13) do not count.  (http://codingbat.com/prob/p127384)
    public int sum13(int[] nums) {
  	int i = 0;
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != 13)
	   i += nums[n];
            else
                n++;
	}
	return i;
    }

    // Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.  (http://codingbat.com/prob/p159979)
    public boolean modThree(int[] nums) {
	int[] temp = new int[3];
	for(int l = 2; l < nums.length; l++) {
	    if ((nums[l-2] % 2 == 0 &&
	          nums[l-1] % 2 == 0 &&
	          nums[l] % 2 == 0) ||
	         (nums[l-2] % 2 != 0 &&
	          nums[l-1] % 2 != 0 &&
	          nums[l] % 2 != 0))
		return true;
	}
	return false;
    }

}
