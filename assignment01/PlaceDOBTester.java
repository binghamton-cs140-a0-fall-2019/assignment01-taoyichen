package assignment01;
/**
Write a class PlaceDOBTester.java with a main method to check out the DateAndPlaceOfBirth class:
In the main method make 5 DateAndPlaceOfBirth objects 3 with birth places in the USA (with a State) and
2 from other countries using the 2nd constructor that does not have a state parameter.
Give two objects the same birth date and have another object with the same birthday (day and month) but a different birth year.
Use System.out.println to print each of the 5 objects and then to print the values of the four other
methods that are not getter methods, e.g., System.out.println(object1.hasSameBirthDayAs(object2)).
You will need many lines to test the 4 methods, we want to see that get the right true and false values for the different combinations of the objects you made.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment01.DateAndPlaceOfBirth;
public class PlaceDOBTester {
	public static void main(String[] args) {
		DateAndPlaceOfBirth DOBPlaceOne = new DateAndPlaceOfBirth(2000, 12, 25, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth DOBPlaceTwo = new DateAndPlaceOfBirth(2000, 12, 25, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth DOBPlaceThree = new DateAndPlaceOfBirth(2001, 12, 25, "Binghamton", "NY", "USA");
		DateAndPlaceOfBirth DOBPlaceFour = new DateAndPlaceOfBirth(1999, 11, 24, "London", "UK");
		DateAndPlaceOfBirth DOBPlaceFive = new DateAndPlaceOfBirth(1998, 10, 14, "London", "UK");
		System.out.println(DOBPlaceOne);
		System.out.println(DOBPlaceTwo);
		System.out.println(DOBPlaceThree);
		System.out.println(DOBPlaceFour);
		System.out.println(DOBPlaceFive);
		System.out.println(DOBPlaceOne.olderThan(DOBPlaceFive));			//False
		System.out.println(DOBPlaceFive.olderThan(DOBPlaceOne));			//True
		System.out.println(DOBPlaceOne.youngerThan(DOBPlaceFive));			//True
		System.out.println(DOBPlaceFive.youngerThan(DOBPlaceOne));			//False
		System.out.println(DOBPlaceOne.hasSameBirthDateAs(DOBPlaceTwo));	//True
		System.out.println(DOBPlaceOne.hasSameBirthDateAs(DOBPlaceFive));	//False
		System.out.println(DOBPlaceOne.hasSameBirthDayAs(DOBPlaceTwo));		//True
		System.out.println(DOBPlaceOne.hasSameBirthDayAs(DOBPlaceThree));	//True
		System.out.println(DOBPlaceOne.hasSameBirthDayAs(DOBPlaceFive));	//False


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}