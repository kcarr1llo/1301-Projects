package lab8_Karina_CarrilloLezama;

import java.util.Scanner;

public class rollDiceProgram {

	public static void main(String[] args) {
		Scanner chosenNumber = new Scanner(System.in);
		System.out.println("Enter a number from 1 to 6: ");
		String value = chosenNumber.nextLine();
		System.out.println("User input: "+ value);
		chosenNumber.close();
		
		System.out.print("The number on the dice after roll is ");
		int diceNumber;
		int yourValue = Integer.parseInt(value);
		diceNumber = 1 + (int)(Math.random() * 7);
		System.out.print(diceNumber+"\n");
		
		
		
			
	
	}

}
