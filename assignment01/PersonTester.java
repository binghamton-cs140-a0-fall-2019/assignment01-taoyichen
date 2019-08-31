package assignment01;
/**
Write a class PersonTester.java with a main method to check out the Person class:
Create one person and see that it prints correctly add similar code to print your test to the output file.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment01.DateAndPlaceOfBirth;
import assignment01.StreetUSAddress;
import assignment01.Person;
public class PersonTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth DOBPlaceOne = new DateAndPlaceOfBirth(2000, 12, 25, "Binghamton", "NY", "USA");
		StreetUSAddress addrOne = new StreetUSAddress("4400 PKWY EAST VESTAL", "Binghamton University", "Binghamton", "NY", "13850");
		Person student = new Person("Keterina", "Romanov", "290182892", DOBPlaceOne, addrOne);

		System.out.println(student);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Person.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}