package CharacterInfo;

import java.util.HashMap;

import CommonalityObject.RGBColor;

public class Player {

	public int id;
	public int warid;
	public String name;
	public int px = 300;
	public int py = 300;
	//“∆Ñ”≈–∂œ
	public	int u = 0;
	public	int d = 0;
	public	int l = 0;
	public	int r = 0;
	
	public HashMap<String, Boolean> map = new HashMap<String, Boolean>(){
	    /**
		 * 
		 */
		private static final long serialVersionUID = -1459053005377564017L;

		/**
		 * 
		 */
		

		{
	        put("right1", false);
	        put("left1", false);
	        put("up1", false);
	        put("down1", false);

	        put("right2", false);
	        put("left2", false);
	        put("up2", false);
	        put("down2", false);

	        put("right3", false);
	        put("left3", false);
	        put("up3", false);
	        put("down3", false);

	    }
	};
	
	
	public boolean playercannotmove = false;
	public float solopx;
	public float solopy;
	public int solopyplustime = 0;
	public int oldsolopyplustime = 0;
	public String force;
	public String character;
	public int power;
	public int defence;
	public int life;
	public int food;	
	public String fserif;
	RGBColor solopcolor;
	
	public RGBColor solodielineColor;
	//food	
	public int Possessionfoodwaittime = 0;	
	public int Possessionfoodtotalwaittime = 300;	
	
	public int Possessionfoodtestwaittime = 0;
	//war
	public int playerfserifwinwaittime = 0;
	
	//waittime
	public int warresultwaittime1 = 0;
	public int warresultwaittime2 = 0;
	public int warresultwaittime3 = 0;
	public int warresultwaittime4 = 0;
	
	public int minusvaluewaittime = 0;
    public int warchoice;
    
    public boolean dowarchoiced = false;
	public int warchoicewaittime = 0;
	public String warresulttext;
	public String warbeforephotoname0;
	public String warbeforephotoname1;
	public String warbeforephotoname2;
	public String warafterphotoname;
	
	
	
	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public HashMap<String, Boolean> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Boolean> map) {
		this.map = map;
	}

	public RGBColor getSolodielineColor() {
		return solodielineColor;
	}

	public void setSolodielineColor(RGBColor solodielineColor) {
		this.solodielineColor = solodielineColor;
	}

	public int getPossessionfoodwaittime() {
		return Possessionfoodwaittime;
	}

	public void setPossessionfoodwaittime(int possessionfoodwaittime) {
		Possessionfoodwaittime = possessionfoodwaittime;
	}

	public int getPossessionfoodtotalwaittime() {
		return Possessionfoodtotalwaittime;
	}

	public void setPossessionfoodtotalwaittime(int possessionfoodtotalwaittime) {
		Possessionfoodtotalwaittime = possessionfoodtotalwaittime;
	}

	public int getPossessionfoodtestwaittime() {
		return Possessionfoodtestwaittime;
	}

	public void setPossessionfoodtestwaittime(int possessionfoodtestwaittime) {
		Possessionfoodtestwaittime = possessionfoodtestwaittime;
	}

	public int getPlayerfserifwinwaittime() {
		return playerfserifwinwaittime;
	}

	public void setPlayerfserifwinwaittime(int playerfserifwinwaittime) {
		this.playerfserifwinwaittime = playerfserifwinwaittime;
	}

	public int getWarresultwaittime1() {
		return warresultwaittime1;
	}

	public void setWarresultwaittime1(int warresultwaittime1) {
		this.warresultwaittime1 = warresultwaittime1;
	}

	public int getWarresultwaittime2() {
		return warresultwaittime2;
	}

	public void setWarresultwaittime2(int warresultwaittime2) {
		this.warresultwaittime2 = warresultwaittime2;
	}

	public int getWarresultwaittime3() {
		return warresultwaittime3;
	}

	public void setWarresultwaittime3(int warresultwaittime3) {
		this.warresultwaittime3 = warresultwaittime3;
	}

	public int getWarresultwaittime4() {
		return warresultwaittime4;
	}

	public void setWarresultwaittime4(int warresultwaittime4) {
		this.warresultwaittime4 = warresultwaittime4;
	}

	public int getMinusvaluewaittime() {
		return minusvaluewaittime;
	}

	public void setMinusvaluewaittime(int minusvaluewaittime) {
		this.minusvaluewaittime = minusvaluewaittime;
	}

	public boolean isDowarchoiced() {
		return dowarchoiced;
	}

	public void setDowarchoiced(boolean dowarchoiced) {
		this.dowarchoiced = dowarchoiced;
	}

	public int getWarchoicewaittime() {
		return warchoicewaittime;
	}

	public void setWarchoicewaittime(int warchoicewaittime) {
		this.warchoicewaittime = warchoicewaittime;
	}

	public String getWarresulttext() {
		return warresulttext;
	}

	public void setWarresulttext(String warresulttext) {
		this.warresulttext = warresulttext;
	}

	public boolean isPlayercannotmove() {
		return playercannotmove;
	}

	public void setPlayercannotmove(boolean playercannotmove) {
		this.playercannotmove = playercannotmove;
	}

	public int getWarchoice() {
		return warchoice;
	}

	public void setWarchoice(int warchoice) {
		this.warchoice = warchoice;
	}

	public String getWarbeforephotoname0() {
		return warbeforephotoname0;
	}

	public void setWarbeforephotoname0(String warbeforephotoname0) {
		this.warbeforephotoname0 = warbeforephotoname0;
	}

	public String getWarbeforephotoname1() {
		return warbeforephotoname1;
	}

	public void setWarbeforephotoname1(String warbeforephotoname1) {
		this.warbeforephotoname1 = warbeforephotoname1;
	}

	public String getWarbeforephotoname2() {
		return warbeforephotoname2;
	}

	public void setWarbeforephotoname2(String warbeforephotoname2) {
		this.warbeforephotoname2 = warbeforephotoname2;
	}

	public String getWarafterphotoname() {
		return warafterphotoname;
	}

	public void setWarafterphotoname(String warafterphotoname) {
		this.warafterphotoname = warafterphotoname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSolopx() {
		return solopx;
	}

	public void setSolopx(float solopx) {
		this.solopx = solopx;
	}

	public float getSolopy() {
		return solopy;
	}

	public void setSolopy(float solopy) {
		this.solopy = solopy;
	}

	public int getSolopyplustime() {
		return solopyplustime;
	}

	public void setSolopyplustime(int solopyplustime) {
		this.solopyplustime = solopyplustime;
	}

	public int getOldsolopyplustime() {
		return oldsolopyplustime;
	}

	public void setOldsolopyplustime(int oldsolopyplustime) {
		this.oldsolopyplustime = oldsolopyplustime;
	}

	public RGBColor getSolopcolor() {
		return solopcolor;
	}

	public void setSolopcolor(RGBColor solopcolor) {
		this.solopcolor = solopcolor;
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

	public int getPx() {
		return px;
	}

	public void setPx(int px) {
		this.px = px;
	}

	public int getPy() {
		return py;
	}

	public void setPy(int py) {
		this.py = py;
	}

	public String getForce() {
		return force;
	}

	public void setForce(String force) {
		this.force = force;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
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

	public String getFserif() {
		return fserif;
	}

	public void setFserif(String fserif) {
		this.fserif = fserif;
	}

	public boolean isDie() {
		return die;
	}

	public void setDie(boolean die) {
		this.die = die;
	}

}
