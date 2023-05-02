
public class Blackjack_Jr {

	public static void main(String[] args) {
		System.out.println("Blackjack Jr!");
		int card, card2, card3, card4, sum1, sum2;
		card = (int)(Math.random() * 10)+1;
		card2 = (int)(Math.random() * 10)+1;
		card3 = (int)(Math.random() * 10)+1;
		card4 = (int)(Math.random() * 10)+1;
		sum1 = card + card2;
		sum2 = card3 + card4;
		
		System.out.println("You drew "+ card +" and "+ card2+ ".");
		System.out.println("Your total is " + sum1 +".");
		
		System.out.print("\n");
		
		System.out.println("The dealer has "+ card3 + " and "+ card4+".");
		System.out.println("Dealer'\s total is "+ sum2+ ".");
		
		if (sum1 == sum2){
			System.out.println("It's a tie!");
		}
		if (sum1 > sum2) {
			System.out.println("YOU WON!!!!!");
		}else {
			System.out.println("Play again? (y or n)");
			
	
		}
		
		
				
		// TODO Auto-generated method stub

	}

}
