import java.io.*;
import java.util.*;

public class Sorter {

    private ArrayList[] buckets = new ArrayList[10];
    private int[] nums;
    private int arrayLength, numDigits;
    private int currentDigit = 0;

    public Sorter(int l, int d) {
	arrayLength = l;
	numDigits = d;
	nums = new int[l];
	for(int i=0; i<buckets.length; i++)
	    buckets[i] = new ArrayList<Integer>();
	Random r = new Random();
	int power = (int)(Math.pow(10,d));
	for(int i=0; i<l; i++)
	    nums[i] = r.nextInt(power);
    }

    public void rsort(int[] a) { //radix
	while (currentDigit < numDigits) {
	    for(int i=0; i<a.length; i++) {
		int sortDigit = (a[i]/(int)(Math.pow(10,currentDigit)))%10;
		buckets[sortDigit].add(a[i]);
	    }
	    int index = 0;		
	    for(int i=0; i<buckets.length; i++) {
		for(int j=0; j<buckets[i].size(); j++) {
		    a[index] = (Integer)(buckets[i].get(j));
		    index++;
		}
		buckets[i].clear();
	    }
	    currentDigit++;
	}
	currentDigit = 0;
    }

    public void bsort(int[] a) { //bubble
	int len=a.length,comparisons=0,swaps=0,localswaps=0;
	while (len>0) {
	    for (int i=a.length-len;i<a.length-1;i++) {
		if (a[i]>a[i+1]) {
		    int temp=a[i];
		    a[i]=a[i+1];
		    a[i+1]=temp;
		    swaps++;
		    localswaps++;
		}
		comparisons++;
		if (localswaps==0)
		    len=0;
		localswaps=0;
	    }
	    len--;
	}
	System.out.println("Bubble sort:");
	System.out.println("Number of comparisons: "+comparisons);
	System.out.println("Number of swaps: "+swaps);
	System.out.println();
    }

    public void ssort(int[] a) { //selection
	int len = a.length,swaps=0,comparisons=0;
	while (len>0) {
	    int firstindex=a.length-len;
	    int swapindex=a.length-1;
	    for(int i=firstindex;i<a.length;i++) {
		if (a[i]<a[swapindex]) {
		    swapindex=i;
		    swaps++;
		}
		comparisons++;
	    }
	    int temp=a[firstindex];
	    a[firstindex]=a[swapindex];
	    a[swapindex]=temp;
	    len--;
	}
	System.out.println("Selection sort:");
	System.out.println("Number of comparisons: "+comparisons);
	System.out.println("Number of swaps: "+swaps);
	System.out.println();
    }

    public void isort(int[] a) { //insertion
	int swaps=0,comparisons=0;
	for (int i=1; i<a.length; i++) {
	    int insertindex=i;
	    while(insertindex!=0&&a[insertindex-1]>a[insertindex]) {
		int temp=a[insertindex];
		a[insertindex]=a[insertindex-1];
		a[insertindex-1]=temp;
		comparisons++;
		swaps++;
		insertindex--;
	    }
	}
	System.out.println("Insertion sort:");
	System.out.println("Number of comparisons: "+comparisons);
	System.out.println("Number of swaps: "+swaps);
	System.out.println();
    }

    public int[] getNums() {
	return nums;
    }

    public String toString() {
	return Arrays.toString(nums);
    } 

}
