package classExample;

public class TestDiceClass {
	
	 public static void main(String[] args) {
		 Dice Dice = new Dice();
		 int round = 4;
		 int sumofP1 = 0;
		 int sumofP2 = 0;
		 
		 for (int i = 0; i < round; i++) {
			 Dice.tossDice();
			 int P1 = Dice.getPips();
			 System.out.println("P1 get:" + P1);
			 sumofP1 = sumofP1 + P1;
		 }
		 for (int i = 0; i < round; i++) {
			 Dice.tossDice();
			 int P2 = Dice.getPips();
			 System.out.println("P2 get:" + P2);
			 sumofP2 = sumofP2 + P2;
		 }
		 
		 if (sumofP1 > sumofP2) {
			 System.out.println("Player 1 wins.");
		 } else if (sumofP2 > sumofP1) {
			 System.out.println("Player 2 wins.");
		 } else {
			 System.out.println("it is a tie");
		 }
	 }
}
		 
		 

