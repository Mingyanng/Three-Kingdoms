package CharacterInfo;

import CommonalityObject.RGBColor;

public class Warlord {
	public int id;
	public int warid;
	public int wx;
	public int wy; 
	public float solowx;
	public float solowy;	 
	public int solowyplustime =0;
	public int oldsolowyplustime = 0;	 
	public boolean maxpower = false;
	public int domaxpowertime = 0;
	public int maxpowertime;	 
	public int maxminutetime;
	public RGBColor solowcolor;
	public String name;
	public String mapname;
	public String mediumname;
	public int power;
	public int defence;
	public int life;
	public RGBColor powerupColor;
	//war
	public int minusvaluewaittime = 0;
	public int warchoice;
	public String warbeforephotoname;
	public String warafterphotoname;
	
	public String serif;
	//plusvalue	
	public int pluspower;
	public int plusdefence;
	public int pluslife;			
	
	
	
	
	
	public int getMinusvaluewaittime() {
		return minusvaluewaittime;
	}

	public void setMinusvaluewaittime(int minusvaluewaittime) {
		this.minusvaluewaittime = minusvaluewaittime;
	}

	public int getPluspower() {
		return pluspower;
	}

	public void setPluspower(int pluspower) {
		this.pluspower = pluspower;
	}

	public int getPlusdefence() {
		return plusdefence;
	}

	public void setPlusdefence(int plusdefence) {
		this.plusdefence = plusdefence;
	}

	public int getPluslife() {
		return pluslife;
	}

	public void setPluslife(int pluslife) {
		this.pluslife = pluslife;
	}

	public int getWarchoice() {
		return warchoice;
	}

	public void setWarchoice(int warchoice) {
		this.warchoice = warchoice;
	}

	public String getWarbeforephotoname() {
		return warbeforephotoname;
	}

	public void setWarbeforephotoname(String warbeforephotoname) {
		this.warbeforephotoname = warbeforephotoname;
	}

	public String getWarafterphotoname() {
		return warafterphotoname;
	}

	public void setWarafterphotoname(String warafterphotoname) {
		this.warafterphotoname = warafterphotoname;
	}

	public int getMaxminutetime() {
		return maxminutetime;
	}

	public void setMaxminutetime(int maxminutetime) {
		this.maxminutetime = maxminutetime;
	}

	public float getSolowx() {
		return solowx;
	}

	public void setSolowx(float solowx) {
		this.solowx = solowx;
	}

	public float getSolowy() {
		return solowy;
	}

	public void setSolowy(float solowy) {
		this.solowy = solowy;
	}

	public int getSolowyplustime() {
		return solowyplustime;
	}

	public void setSolowyplustime(int solowyplustime) {
		this.solowyplustime = solowyplustime;
	}

	public int getOldsolowyplustime() {
		return oldsolowyplustime;
	}

	public void setOldsolowyplustime(int oldsolowyplustime) {
		this.oldsolowyplustime = oldsolowyplustime;
	}

	public boolean isMaxpower() {
		return maxpower;
	}

	public void setMaxpower(boolean maxpower) {
		this.maxpower = maxpower;
	}

	public int getDomaxpowertime() {
		return domaxpowertime;
	}

	public void setDomaxpowertime(int domaxpowertime) {
		this.domaxpowertime = domaxpowertime;
	}

	public int getMaxpowertime() {
		return maxpowertime;
	}

	public void setMaxpowertime(int maxpowertime) {
		this.maxpowertime = maxpowertime;
	}

	public RGBColor getSolowcolor() {
		return solowcolor;
	}

	public void setSolowcolor(RGBColor solowcolor) {
		this.solowcolor = solowcolor;
	}

	public String getMediumname() {
		return mediumname;
	}

	public void setMediumname(String mediumname) {
		this.mediumname = mediumname;
	}

	public RGBColor getPowerupColor() {
		return powerupColor;
	}

	public void setPowerupColor(RGBColor powerupColor) {
		this.powerupColor = powerupColor;
	}

	public int getWarid() {
		return warid;
	}

	public void setWarid(int warid) {
		this.warid = warid;
	}



	public String getWserif() {
		return wserif;
	}

	public void setWserif(String wserif) {
		this.wserif = wserif;
	}

	public String wserif;
	public boolean die = true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWx() {
		return wx;
	}

	public void setWx(int wx) {
		this.wx = wx;
	}

	public int getWy() {
		return wy;
	}

	public void setWy(int wy) {
		this.wy = wy;
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

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public String getSerif() {
		return serif;
	}

	public void setSerif(String serif) {
		this.serif = serif;
	}

	public boolean isDie() {
		return die;
	}

	public void setDie(boolean die) {
		this.die = die;
	}
}
