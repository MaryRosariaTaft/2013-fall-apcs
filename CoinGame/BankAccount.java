import java.io.*;
import java.util.*;

public class BankAccount {
    private String name;
    private int acctnum;
    private double balance, rate;

    public BankAccount(String n, int act) {
	name = n;
	acctnum = act;
    }

    public void deposit(double amt) {
	if (amt > 0)
	    balance = balance + amt;
    }

    public void withdraw(double amt) {
	if (amt <= balance)
	    balance = balance - amt;
    }

    public void giveTo(BankAccount other, double amt) {
	if (amt <= other.balance) {
	    this.withdraw(amt);
	    other.deposit(amt);
	}
    }

    public void takeFrom(BankAccount other, double amt) {
	if (amt <= this.balance) {
	    other.withdraw(amt);
	    this.deposit(amt);
	}
    }

    public double getBalance() {
	return balance;
    }

}
