package classExample;

public class Dice {
	int faceUp = 1;
	int nDice = 0;
	
	public Dice() {
		faceUp = 1;
		nDice++;
	}
	public Dice(int faceUp) {
		this.faceUp = faceUp;
		nDice++;
	}
	public void tossDice() {
		faceUp = (int)(Math.random()*10)%6+1; 
	}
	public int getPips() {
		return faceUp;
	}
}
