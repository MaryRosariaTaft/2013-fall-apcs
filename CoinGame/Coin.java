import java.io.*;
import java.util.*;

public class Coin {
    
    private String face = "heads", name;
    private int numflips = 0, numheads = 0, numtails = 0;
    private double fairness, value;

    public Coin() {
	name = "Quarter";
	value = .25;
	fairness = 0.5;
    }

    public Coin(String n) {
	name = n;
	if (n.equals("Penny")) value = .01;
	if (n.equals("Nickel")) value = .05;
	if (n.equals("Dime")) value = .10;
	if (n.equals("Quarter")) value = .25;
	fairness = 0.5;
    }

    public Coin(double v) {
	value = v;
	if (v == 0.01) name = "Penny";
	if (v == 0.05) name = "Nickel";
	if (v == 0.10) name = "Dime";
	if (v == 0.25) name = "Quarter";
	fairness = 0.5;
    }

    public Coin(String n, double v) {
	name = n;
	value = v;
	fairness = 0.5;
    }

    public Coin(String n, double v, double f) {
	name = n;
	value = v;
	fairness = f;
    }

    public void flip() {
	numflips = numflips + 1;
	if (fairness > Math.random()) {
	    face = "heads";
	    numheads = numheads + 1;
	} else {
	    face = "tails";
	    numtails = numtails + 1;
	}
    }

    public String getName() {
	return name;
    }

    public double getValue() {
	return value;
    }

    public String getFace() {
	return face;
    }

    public int getFlips() {
	return numflips;
    }

    public int getHeads() {
	return numheads;
    }

    public int getTails() {
	return numtails;
    }

    public void resetCount() {
	numflips = 0;
	numheads = 0;
	numtails = 0;
    }

}
