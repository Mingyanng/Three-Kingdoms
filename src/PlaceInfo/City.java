package PlaceInfo;

import CharacterInfo.Warlord;
import CommonalityObject.RGBColor;

public class City {
	public int id;
	public int cx;
	public int cy;
	public String name;
	public String mapname;
	public String nname;

	public String soloaside;
	
	public Warlord warlord;
	public int food;
	public int dieplusfood;
	
	public boolean choice = false;
	//war
	public boolean warcheck = false;
	//solo
	
	public boolean solocheck = false;
	
	public RGBColor solopoweruplineColor;
	
	public RGBColor solodielineColor;
	
	public boolean die = false;
	
	public boolean isChoice() {
		return choice;
	}

	public void setChoice(boolean choice) {
		this.choice = choice;
	}

	public boolean isSolocheck() {
		return solocheck;
	}

	public void setSolocheck(boolean solocheck) {
		this.solocheck = solocheck;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMapname() {
		return mapname;
	}

	public void setMapname(String mapname) {
		this.mapname = mapname;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public Warlord getWarlord() {
		return warlord;
	}

	public void setWarlord(Warlord warlord) {
		this.warlord = warlord;
	}

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public boolean isWarcheck() {
		return warcheck;
	}

	public void setWarcheck(boolean warcheck) {
		this.warcheck = warcheck;
	}

	public boolean isDie() {
		return die;
	}

	public void setDie(boolean die) {
		this.die = die;
	}

}
