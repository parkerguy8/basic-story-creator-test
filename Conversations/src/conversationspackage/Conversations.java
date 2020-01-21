package conversationspackage;
import java.util.Scanner;
public class Conversations {

	public static void main(String[] args) {
		//scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Type your name and press Enter: ");
		String name = input.nextLine();
		
		System.out.print("Type in a noun and press Enter: ");
		String noun = input.nextLine();
		
		System.out.print("Type in a verb and press Enter: ");
		String verb = input.nextLine();
		
		System.out.print("Type in a integer and press Enter: ");
		int integer = input.nextInt();
		
		System.out.print("Type in a real number or a decimal and press Enter: ");
		double double1= input.nextInt();
		
		
		//story (Given)
		
		String story = "One day, " + name + " picked up a " + noun;
		story += " and decided to " + verb + " it.\n";
		story += "After getting arrested, spending " + integer;
		story += " days in jail, and paying a $" + String.format("%.2f",double1) + " fine,\n";
		story += name + " decided that was a bad idea!";
		System.out.print(story);
		
	}

}
