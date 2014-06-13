import java.io.*;
import java.util.*;
import java.text.*;

public class CoinGame {
    private BankAccount account1, account2;
    private Coin coin1, coin2;
    private double pot = 0.0;

    public CoinGame() {
	account1 = new BankAccount("player1", 1);
	account2 = new BankAccount("player2", 2);
	account1.deposit(1000.0);
	account2.deposit(1000.0);
	coin1 = new Coin();
	coin2 = new Coin();
	pot = 0.0;
    }

    public void turn() {
	double temp = Math.random() * 100,
	    bal1 = account1.getBalance(),
	    bal2 = account2.getBalance();
	if (temp < bal1 && temp < bal2) {
	    account1.withdraw(temp);
	    account2.withdraw(temp);
	    pot = pot + 2*temp; 
	} else {
	    double w; 
	    if (bal1 > bal2)
		w = bal2;
	    else
		w = bal1;
	    account1.withdraw(w);
	    account2.withdraw(w);
	    pot = pot + 2*w;
	}
	coin1.flip();
	coin2.flip();
	if (coin1.getFace().equals(coin2.getFace())) {
	    if (coin1.getFace().equals("heads")) {
		account1.deposit(pot);
	    } else {
		account2.deposit(pot);
	    }
	    pot = 0.0;
	}
    }


    public void play(int n) {
	while (n > 0) {
	    turn();
	    double bal1 = account1.getBalance(),
		bal2 = account2.getBalance();
	    if (bal1 == 0 || bal2 == 0 || n == 1) {
		if (bal1 == 0 || bal2 > bal1)
		    account2.deposit(pot);
		else
		    account1.deposit(pot);
		pot = 0.0;
		n = 0;
	    }
	    n = n - 1;
	}
    }

    public String returnWinner() {
	double bal1 = account1.getBalance();
	double bal2 = account2.getBalance();
	DecimalFormat df = new DecimalFormat("#.##");
	if (bal1 > bal2)
	    return "Player 1 wins with $" + df.format(bal1) + " against Player 2's $" + df.format(bal2) + ".";
	else
	    return "Player 2 is wins with $" + df.format(bal2) + " against Player 1's $" + df.format(bal1) + ".";
    }

}
