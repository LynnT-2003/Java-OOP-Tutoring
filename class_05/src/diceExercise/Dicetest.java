package diceExercise;


public class Dicetest {

	public static void main(String[] args) {
		public void testTest() {
			System.out.println("You can call me now");
		}
		
		 public static void main(String[] args) {
			 Dice myDice = new Dice(4);
			 System.out.println(myDice.getPips());
			 for (int i = 0; i<20;  i++) {
				 myDice.tossDice();
				 System.out.println(myDice.getPips());
			 }	
			 System.out.printf("The number of dice is %d \n" ,myDice.nDice);
		 System.out.println(myDice.nDice);
		 Dice ourDice = new Dice();
		 System.out.println(ourDice.getPips());
		 System.out.printf("The number of dice is %d \n" ,myDice.nDice);
		 Dice thirdDice = new Dice();
		 System.out.printf("The number of dice is %d \n" ,myDice.nDice);
		 TestDiceClass m = new TestDiceClass();
		 m.testTest();
		 } 

	}

}
