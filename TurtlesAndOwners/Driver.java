import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Turtle t0,t1,t2;
	t0 = new Turtle();
	t1 = new Turtle("Cornelius");
	t2 = new Turtle("Zippy",33,75);

	System.out.println("For the following three tests: the first test uses the constructor with no parameters,\nthe second test uses the constructor with two parameters,\nand the third test uses the constructor with three parameters. \n");

	System.out.println(t0.getName());
	System.out.println("Age: " + t0.getAge());
	System.out.println("Speed: "+ t0.getSpeed() + "\n");

	System.out.println(t1.getName());
	System.out.println("Age: " + t1.getAge());
	System.out.println("Speed: "+ t1.getSpeed() + "\n");

	System.out.println(t2.getName());
	System.out.println("Age: " + t2.getAge());
	System.out.println("Speed: "+ t2.getSpeed() + "\n");

	System.out.println("The following test uses the getOlder() method (increasing age by 5) and the speedUp() method (increasing speed by 5) on Shelly. \n");
	t0.getOlder();
	t0.speedUp(5);
	System.out.println("New age: " + t0.getAge());
	System.out.println("New speed: " + t0.getSpeed() + "\n");

	System.out.println("The following test uses the slowDown() method (decreasing speed by 5) on Shelly, to get her speed back to its original value. \n");
	t0.slowDown(5);
	System.out.println("New speed: " + t0.getSpeed() + "\n");


	Person p;
	Turtle t;
	p = new Person("David");
	t = new Turtle("Goliath",50,25);
	p.setTurtle(t);

	System.out.println("The following  test uses the Person class associate a person with a turtle.  It then uses the Turtle class to determine that person's turtle's statistics.");
	System.out.println("Person's name: " + p.getPersonName());
	System.out.println("Turtle's name: " + p.getPet().getName());
	System.out.println("Turtle's age: " + p.getPet().getAge());
	System.out.println("Turtle's speed: " + p.getPet().getSpeed() + "\n");

	System.out.println("Now, this test uses a method written in the Person class itself to determine the person's turtle's speed.");
	System.out.println("Turtle's speed: " + p.getTurtleSpeed());
	
    }
}
