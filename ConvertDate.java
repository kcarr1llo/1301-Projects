import java.util.Scanner;
public class ConvertDate {

	public static void main(String[] args) {
		
		//user input
		System.out.print("Date to be converted: ");
		Scanner input = new Scanner(System.in);
		String date = input.nextLine();
		
		//find index numbers
		int indexSpace = date.indexOf(" ");
		int index2ndSpace = date.indexOf(" ", indexSpace);
		
		
		
	}

}
