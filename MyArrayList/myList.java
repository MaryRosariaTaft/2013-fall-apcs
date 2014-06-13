import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems = 0;
    }

    public boolean isFull() {
	return (numItems >= data.length);
    }

    public void grow() {
	if (isFull()) {
	    System.out.println("Increasing array size from "+data.length+" to "+data.length*3/2+".");
	    int[] tmpArray = new int[data.length*3/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i] = data[i];
	    data = tmpArray;
	}
    }

    public int size() {
	return numItems;
    }

    public void set(int pos, int d) {
	if (pos > numItems) {
	    data[numItems] = d;
	    System.out.println("Index exceeded array size.  Value (d) added to end of array.");
	}
	else
	    data[pos] = d;
    }

    public int get(int pos){
	if (pos >= data.length)
	    return -1;
	return data[pos];
    }

    public void add(int d) {
        grow();
        data[numItems] = d;
        numItems++;
    }

    public void add(int pos, int d) {
	grow();
        if (pos < numItems) {
	    for (int i = numItems; i >= pos; i--)
		set(i, data[i-1]);
	}
	set(pos, d);
	numItems++;
    }

    public void remove(int pos) {
        grow();
	for (int i = pos; i < numItems; i++)
	    set(i, data[i+1]);
	numItems--;
    }

    /* less efficient--but still functional--remove method

    public void remove1(int pos){
	int[] temp = new int[data.length-1];
	for (int i=0; i<temp.length; i++) {
	    if (i<pos)
		temp[i] = data[i];
	    else
		temp[i] = data[i+1];
	}
	data = temp;
	numItems--;
    }

    */

    private int foundIndex;
    public int find(int n) {
	foundIndex = 0;
	for (int i = 0; i < numItems; i++) {
	    foundIndex++;
	    if (data[i] == n)
		return data[i];
	}
	return 0;
    }

    public void fRemove(int n) {
	int temp = find(n);
	if (temp == 0)
	    System.out.println("Error: Out of Bounds");
	else
	    remove(foundIndex);
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" -- Data Set Size: "+size();
	return s;
    }
	
}
