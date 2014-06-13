import java.io.*;
import java.util.*;

public class Turtle {

    private String name;
    private int age;
    private int speed;

    public Turtle() {
	name = "Shelly";
	age = 14;
	speed = 120;
    }

    public Turtle(String newName) {
	name = newName;
	age = 75;
	speed = 35;
    }

    public Turtle(String newName, int newAge, int newSpeed) {
	name = newName;
	age = newAge;
	speed = newSpeed;
    }

    public void speedUp(int n) {
	speed = speed + n;
    }

    public void slowDown(int n) {
	speed = speed - n;
    }

    public void getOlder() {
	age = age + 1;
    }

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }

    public int getSpeed() {
	return speed;
    }

}
