package assignment01;
/**
Write a class ComputerOwnerTester.java with a main method to check out the ComputerOwner class:
In the main method make a Person and use it to make a ComputerOwner object and 4 computers.
Add the 4 computers to the owner and print the object. Then remove 2 computers and print it again.
Copy and modify the code to that what you see in the console gets repeated in the output file.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment01.DateAndPlaceOfBirth;
import assignment01.StreetUSAddress;
import assignment01.Person;
import assignment01.ComputerOwner;
import assignment01.Computer;
public class ComputerOwnerTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth DOBPlaceOne = new DateAndPlaceOfBirth(2000, 12, 25, "Binghamton", "NY", "USA");
		StreetUSAddress addrOne = new StreetUSAddress("4400 PKWY EAST VESTAL", "Binghamton University", "Binghamton", "NY", "13850");
		Person student = new Person("Keterina", "Romanov", "290182892", DOBPlaceOne, addrOne);
		ComputerOwner ownerOne = new ComputerOwner(student);
		Computer computerOne = new Computer("Apple", "Intel", 16, 2000, true, 200);
		Computer computerTwo = new Computer("Apple", "Intel", 16, 4000, false, 100);
		Computer computerThree = new Computer("Apple", "Intel", 16, 100, true, 40);
		Computer computerFour = new Computer("Apple", "Intel", 16, 200, false, 30);
		ownerOne.addComputer(computerOne);
		ownerOne.addComputer(computerTwo);
		ownerOne.addComputer(computerThree);
		ownerOne.addComputer(computerFour);


		System.out.println(ownerOne);
		ownerOne.removeComputer(0);
		ownerOne.removeComputer(0);
		System.out.println(ownerOne);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}