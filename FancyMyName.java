import java.util.Scanner;
public class FancyMyName {

	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("Please enter your first name and last name, seperated by a space:");//Karina Carrillo
		String fullName = name.nextLine();
		
		int nameLength = fullName.length();//15
		int spaceIndex = fullName.indexOf(" ");//7
		
		//substrings
		String firstName = fullName.substring(0,spaceIndex);
		String lastName = fullName.substring(spaceIndex+1,nameLength);
		
		// full name
		System.out.println("You entered the name: "+ fullName);
		
		// first name + letters
		System.out.println("Your first name is "+ firstName + ": has "+ firstName.length()+" characters");
		
		// last name + letters
		System.out.println("Your last name is "+ lastName +": has "+ lastName.length()+ " characters");
		
		// initials
		System.out.println("Your initials are: "+ firstName.substring(0,1)+ lastName.substring(0,1));
		
		name.close();

	}

}
