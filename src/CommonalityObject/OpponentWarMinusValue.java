package CommonalityObject;

public class OpponentWarMinusValue {
	public int minuspower;
	public int minusdefence;
	public int minuslife;
	public int minusfood;
	public boolean minusvalueswitch = false;
	
	public void RestoreOpponentWarMinusValue() {
		this.minuspower = 0;
		this.minusdefence = 0;
		this.minuslife = 0;
		this.minusfood = 0;
		this.minusvalueswitch = false;
	}
	
	
	
}
