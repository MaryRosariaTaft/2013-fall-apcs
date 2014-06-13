
public class Driver {

    public static void main(String[] args) {

	System.out.println("Integer List");

	myList L = new myList();

	System.out.println(L);
	for (int i = 0; i < 5; i++)
	    L.add((i+1)*5);
	System.out.println(L);

	for (int i = 0; i < 7; i++)
	    L.add((i+1)*5);
	System.out.println(L);
	System.out.println();

	L.remove(1);
	System.out.println("Removed value at index 1.");
	System.out.println(L);
	System.out.println();

	L.add(17);
        System.out.println("Added value 17 to end of array.");
	System.out.println(L);
	System.out.println();

	L.add(5,23);
        System.out.println("Inserted value 23 at index 5.");
	System.out.println(L);
	System.out.println();

	L.set(9,16);
	System.out.println("Changed value at index 9 to 16.");
	System.out.println(L);
	System.out.println();

	System.out.println("Testing get():\nThe value at index 16 is: " + L.get(16)+"\nThe value at index 4 is: " + L.get(4));
	System.out.println();

	System.out.println("Testing find(): search for 16: found " + L.find(16));
	System.out.println();

	L.fRemove(16);	
	System.out.println("Removed the first instance of 16.");
	System.out.println(L);
	System.out.println();

	System.out.println();

	myStringList SNL = new myStringList();

	System.out.println("String List");

	System.out.println(SNL);
	for (int i = 0; i < 5; i++)
	    SNL.add(SNL.makeRandomStrings());
	System.out.println(SNL);

	for (int i = 0; i < 7; i++)
	    SNL.add(SNL.makeRandomStrings());
	System.out.println(SNL);
	System.out.println();

	SNL.remove(1);
	System.out.println("Removed value at index 1.");
	System.out.println(SNL);
	System.out.println();

	SNL.add("addTest");
        System.out.println("Added value \"addTest\" to end of array.");
	System.out.println(SNL);
	System.out.println();

	SNL.add(5,"insertTest");
        System.out.println("Inserted value \"insertTest\" at index 5.");
	System.out.println(SNL);
	System.out.println();

	SNL.set(9,"setTest");
	System.out.println("Changed value at index 9 to \"setTest\".");
	System.out.println(SNL);
	System.out.println();

	System.out.println("Testing get():\nThe value at index 18 is: " + SNL.get(18)+"\nThe value at index 9 is: " + SNL.get(9));
	System.out.println();


	System.out.println("Testing find(): search for \"even\": found " + SNL.find("even"));
	System.out.println();

	SNL.fRemove("even");	
	System.out.println("Removed the first instance of \"even\".");
	System.out.println(SNL);
	System.out.println();

	System.out.println();
	
    }

}
