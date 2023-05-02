
public class Ascii_tree {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < (10-i); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i;k++) {
				System.out.print("\\");
			}
			for(int m = 0; m < 1; m++) {
				System.out.print("|");
			}
			for(int r = 0; r < i;r++) {
				System.out.print("/");
			}
			System.out.println();
		}
		

	}

}