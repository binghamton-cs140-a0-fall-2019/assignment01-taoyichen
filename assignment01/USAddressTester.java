package assignment01;
/**
Write a class USAddressTester.java with a main method to check out the StreetUSAddress class:
In the main method make 2 objects, one with an empty String for address2 and print them to see that one object prints with 3 lines and the other with 2 lines.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment01.StreetUSAddress;
public class USAddressTester {
	public static void main(String[] args) {
		StreetUSAddress addrOne = new StreetUSAddress("4400 PKWY EAST VESTAL", "Binghamton University", "Binghamton", "NY", "13850");
		StreetUSAddress addrTwo = new StreetUSAddress("1 Main Street", "", "Binghamton", "NY", "13905");

		System.out.println(addrOne);
		System.out.println(addrTwo);


		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}
}