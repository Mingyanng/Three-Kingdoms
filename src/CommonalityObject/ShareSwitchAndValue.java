package CommonalityObject;

public class ShareSwitchAndValue {
	//warswitch
	public boolean warlordwarstartswitch = false;
	public boolean banditwarstartswitch = false;
	//soloswitch
	public boolean warlordsolostartswitch = false;	
	public boolean banditsolostartswitch = false;
	//warnum
	public int warlordwarnum = 10;
	//solonum
	public int solonum = 10;
	public int secondtime = 0;
	public int minutetime = 0;
	
	public void RestoreShareSwitchAndValue() {

		this.warlordwarstartswitch = false;
		this.banditwarstartswitch = false;
		this.warlordsolostartswitch = false;
		this.banditsolostartswitch = false;
		this.warlordwarnum = 10;
		this.solonum = 10;
		this.secondtime = 0;
		this.minutetime = 0;
	}
	
	
	
	
	
}
