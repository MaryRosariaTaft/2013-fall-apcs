import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	CoinGame a, b;
	a = new CoinGame();
	b = new CoinGame();
	a.play(10);
	b.play(100);
	System.out.println("Game 1: " + a.returnWinner());
	System.out.println("Game 2: " + b.returnWinner());
     }
}
