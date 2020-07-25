package CommonalityObject;

public class PlayerPlusValue {
	public int pluspower;
	public int plusdefence;
	public int pluslife;
	public int plusfood;
	public boolean plusvalueswitch = false;
	
	
	public void RestorePlayerPlusValue() {

		this.pluspower = 0;
		this.plusdefence = 0;
		this.pluslife = 0;
		this.plusfood = 0;
		this.plusvalueswitch = false;
	}
	
	
	
}
