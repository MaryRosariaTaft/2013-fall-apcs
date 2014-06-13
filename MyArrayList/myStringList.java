import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
	data = new String[5];
	numItems = 0;
    }

    public String makeRandomStrings() {
	Random r = new Random();
	String test;
	if (r.nextInt(100)%2 == 0)
	    test = "even";
	else
	    test = "odd";
	return test;
    }

    public boolean isFull() {
	return (numItems >= data.length);
    }

    public void grow() {
	if (isFull()) {
	    System.out.println("Increasing array size from "+data.length+" to "+data.length*3/2+".");
	    String[] tmpArray = new String[data.length*3/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i] = data[i];
	    data = tmpArray;
	}
    }

    public int size() {
	return numItems;
    }

    public void set(int pos, String s) {
	if (pos > numItems) {
	    data[numItems] = s;
	    System.out.println("Index exceeded array size.  Value (s) added to end of array.");
	}
	else
	    data[pos] = s;
    }

    public String get(int pos){
	if (pos >= data.length)
	    return "null";
	return data[pos];
    }

    public void add(String s) {
        grow();
        data[numItems] = s;
        numItems++;
    }

    public void add(int pos, String s) {
	grow();
        if (pos < numItems) {
	    for (int i = numItems; i >= pos; i--)
		set(i, data[i-1]);
	}
	set(pos, s);
	numItems++;
    }

    public void remove(int pos) {
        grow();
	for (int i = pos; i < numItems; i++)
	    set(i, data[i+1]);
	numItems--;
    }


    private int foundIndex;
    public String find(String s) {
	foundIndex = 0;
	for (int i = 0; i < numItems; i++) {
	    foundIndex ++;
	    if (data[i].equals(s))
		return data[i];
	}
	return "null";
    }

    public void fRemove(String s) {
	String temp = find(s);
	if (temp.equals("null"))
	    System.out.println("Error: Out of Bounds");
	else
	    remove(foundIndex);
    }
    

    public String toString() {
	String s = Arrays.toString(data)+" -- Data Set Size: "+size();
	return s;
    }
	
}
