import java.util.Scanner;
public class half_XmasTree {

	public static void main(String[] args) {
		System.out.print("Choose the amount of rows for a Christmas tree: ");
		Scanner rows = new Scanner(System.in);
		int r = rows.nextInt();
		rows.close();
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int h = 0; h < (r-i); h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	

	}

}
