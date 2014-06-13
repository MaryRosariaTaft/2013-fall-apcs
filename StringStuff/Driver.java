import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	StringStuff s1;
	s1 = new StringStuff();

	String n = "mary taft";

	System.out.println("Input: " + n);
	System.out.println("Capitalize: " + s1.capitalize(n));
	System.out.println("Bondify: " + s1.bondify(n));

	System.out.println();

	String temp, temp1, temp2, temp3;
	temp = "out";
	temp1 = "rug";
	temp2 = "plot";
	temp3 = "schlepp";

	System.out.println("Pig Latin:");
	System.out.println(temp + "-->" + s1.piglatinify(temp));
	System.out.println(temp1 + "-->" + s1.piglatinify(temp1));
	System.out.println(temp2 + "-->" + s1.piglatinify(temp2));
	System.out.println(temp3 + "-->" + s1.piglatinify(temp3));


    }

}
