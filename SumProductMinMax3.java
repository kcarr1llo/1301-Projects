import java.util.Scanner;
public class SumProductMinMax3 {

	public static void main(String[] args) {
	int number1, number2, number3, sum, prod, min, max;
	Scanner num = new Scanner(System.in);
	
	System.out.print("Enter 1st integer: ");
	number1 = num.nextInt();
	
	System.out.print("Enter 2nd integer: ");
	number2 = num.nextInt();
	
	System.out.print("Enter 3rd integer: ");
	number3 = num.nextInt();
	
	System.out.print("\n");
	
	sum = number1 + number2 + number3;
	prod = number1*number2*number3;
	min = number1;
	if (number2 < min) {
		min = number2;
	}
	if (number3 < min) {
		min = number3;
	}
	max = number1;
	if (number2 > max) {
		max = number2;
	}
	if (number3 > max) {
		max = number3;
	}
	
	System.out.println("The sum is: "+ sum);
	System.out.println("The product is: "+ prod);
	System.out.println("The min is: "+ min);
	System.out.println("The max is: "+ max);
	
	num.close();

	}

}
