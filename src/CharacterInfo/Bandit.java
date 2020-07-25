package CharacterInfo;

import CommonalityObject.RGBColor;

public class Bandit {
	public int id;
	public String name = "É½Ù\";
	public int wx = 500;
	public int power;
	public int defence;
	public int life;
	public int food = 100;
	public int banditneedfood = 30;
	public boolean warcheck = false;	
	public boolean solocheck = false;	
	public int renascenttime = 10;
	public int banditsecondtime = 0;
	public int banditminutetime = 0;
	//solo
	public float solowx;
	public float solowy;	 
	public int solowyplustime =0;
	public int oldsolowyplustime = 0;
	 
	public boolean maxpower = false;
	public int domaxpowertime = 0;
	public int maxpowertime;	 
	public int maxminutetime;
	public String soloaside;
	public RGBColor solobcolor;
	public RGBColor powerupColor;
	//war
	public RGBColor solodielineColor;
	public RGBColor solopoweruplineColor;
	public int warchoice;
	public String warphotoname;
	public String serif;
	public String wserif;
	public int minusvaluewaittime = 0;
	//plusvalue	
	
	public int pluspower = 10;
	public int plusdefence = 10;
	public int pluslife = 30;			
	
	//ratenum
	public int banditraterandomnum = 0;
	public int banditratenum = 4;
	public boolean renascenttimeswitch = true;	
	public boolean renascenttimestartswitch = true;
	public boolean die = true;
	
	
	
	public RGBColor getSolodielineColor() {
		return solodielineColor;
	}

	public void setSolodielineColor(RGBColor solodielineColor) {
		this.solodielineColor = solodielineColor;
	}

	public RGBColor getSolopoweruplineColor() {
		return solopoweruplineColor;
	}

	public void setSolopoweruplineColor(RGBColor solopoweruplineColor) {
		this.solopoweruplineColor = solopoweruplineColor;
	}

	public int getWarchoice() {
		return warchoice;
	}

	public void setWarchoice(int warchoice) {
		this.warchoice = warchoice;
	}

	public String getWarphotoname() {
		return warphotoname;
	}

	public void setWarphotoname(String warphotoname) {
		this.warphotoname = warphotoname;
	}

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

	public int getBanditraterandomnum() {
		return banditraterandomnum;
	}

	public void setBanditraterandomnum(int banditraterandomnum) {
		this.banditraterandomnum = banditraterandomnum;
	}

	public int getBanditratenum() {
		return banditratenum;
	}

	public void setBanditratenum(int banditratenum) {
		this.banditratenum = banditratenum;
	}

	public boolean isRenascenttimestartswitch() {
		return renascenttimestartswitch;
	}

	public void setRenascenttimestartswitch(boolean renascenttimestartswitch) {
		this.renascenttimestartswitch = renascenttimestartswitch;
	}

	public int getBanditneedfood() {
		return banditneedfood;
	}

	public void setBanditneedfood(int banditneedfood) {
		this.banditneedfood = banditneedfood;
	}

	public int getRenascenttime() {
		return renascenttime;
	}

	public void setRenascenttime(int renascenttime) {
		this.renascenttime = renascenttime;
	}

	public int getBanditsecondtime() {
		return banditsecondtime;
	}

	public void setBanditsecondtime(int banditsecondtime) {
		this.banditsecondtime = banditsecondtime;
	}

	public int getBanditminutetime() {
		return banditminutetime;
	}

	public void setBanditminutetime(int banditminutetime) {
		this.banditminutetime = banditminutetime;
	}

	public boolean isRenascenttimeswitch() {
		return renascenttimeswitch;
	}

	public void setRenascenttimeswitch(boolean renascenttimeswitch) {
		this.renascenttimeswitch = renascenttimeswitch;
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

	public int getMaxminutetime() {
		return maxminutetime;
	}

	public void setMaxminutetime(int maxminutetime) {
		this.maxminutetime = maxminutetime;
	}

	public String getSoloaside() {
		return soloaside;
	}

	public void setSoloaside(String soloaside) {
		this.soloaside = soloaside;
	}

	public RGBColor getSolobcolor() {
		return solobcolor;
	}

	public void setSolobcolor(RGBColor solobcolor) {
		this.solobcolor = solobcolor;
	}

	public RGBColor getPowerupColor() {
		return powerupColor;
	}

	public void setPowerupColor(RGBColor powerupColor) {
		this.powerupColor = powerupColor;
	}

	public boolean isSolocheck() {
		return solocheck;
	}

	public void setSolocheck(boolean solocheck) {
		this.solocheck = solocheck;
	}

	public int getWx() {
		return wx;
	}

	public void setWx(int wx) {
		this.wx = wx;
	}

	public String getWserif() {
		return wserif;
	}

	public void setWserif(String wserif) {
		this.wserif = wserif;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getFood() {
		return food;
	}

	public void setFood(int food) {
		this.food = food;
	}

	public String getSerif() {
		return serif;
	}

	public void setSerif(String serif) {
		this.serif = serif;
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
