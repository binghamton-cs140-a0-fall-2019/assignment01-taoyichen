package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import assignment01.Computer;
public class ComputerTester {
	public static void main(String[] args) {
	//TODO make 4 different Computer objects with different
	//combinations of disk size (two more than a terabyte and two less)
	//and for each make one an SSD drive and the other not.
	//Then call System.out.println(comp); for each "comp" object
	//and observe that there are small differences in how the computer
	//information prints out.
	Computer computerOne = new Computer("Apple", "Intel", 16, 2000, true, 200);
	Computer computerTwo = new Computer("Apple", "Intel", 16, 4000, false, 100);
	Computer computerThree = new Computer("Apple", "Intel", 16, 100, true, 40);
	Computer computerFour = new Computer("Apple", "Intel", 16, 200, false, 30);
	System.out.println(computerOne);
	System.out.println(computerTwo);
	System.out.println(computerThree);
	System.out.println(computerFour);
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");

		//Copy all your lines above, add an extra "2" to every variable name
		// and replace every System.out.print or System.out.println
		// by output.print or output.println
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}