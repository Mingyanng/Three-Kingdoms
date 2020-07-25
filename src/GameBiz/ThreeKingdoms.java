package GameBiz;
import BanditActionDao.BanditActionDao;
import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CharacterInfo.Warlord;
import CommonalityDao.AboutInformation;
import CommonalityDao.AboutLocation;
import CommonalityDao.AboutWar;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerHoldingPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.RGBColor;
import CommonalityObject.ShareSwitchAndValue;
import CommonalityObject.WarColor;
import PlaceInfo.City;
import PlayerActionDao.PlayerActionDao;
import VictoryOrDefeat.WarVictoryOrDefeat;
import WarlordActionDao.WarlordActionDao;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.event.MouseEvent;

public class ThreeKingdoms extends PApplet{

	public static void main(String[] args) {
		PApplet.main("GameBiz.ThreeKingdoms");
	}
	

	

	Player player = new Player(); 
	
	City city1 = new City();
	City city2 = new City();
	City city3 = new City();

	City[] citystr = {city1, city2, city3};

	Warlord warlord1 = new Warlord();
	Warlord warlord2 = new Warlord();
	Warlord warlord3 = new Warlord();

	Warlord[] warlordstr = {warlord1, warlord2, warlord3};
	
    Bandit bandit = new Bandit();
    

    
    /* ----Actions---- */
    

    
    PlayerActionDao pDao = new PlayerActionDao();
	WarlordActionDao wDao = new WarlordActionDao();
	BanditActionDao bDao = new BanditActionDao();
	AboutLocation aboutLocation = new AboutLocation();
	AboutInformation aboutInformation = new AboutInformation();
	
	/* ----Actions---- */
	
    /* ----citylocation---- */
    
  //現在地名前表示位置
  	int lx;
  	int ly = 78;

  	//地図城門表示位置
  	float mx;
  	int my = 10;
  	
  	/* ----citylocation---- */
  	
  	
    /* ----solo---- */
    //solospacecheck
    boolean warlordspacecheck = false;
	boolean warlordspaceoff = false;
	boolean banditspacecheck = false;
	boolean banditspaceoff = false;
	
	//solocolor
	RGBColor solopcolor;
	RGBColor solowcolor;
	RGBColor zhoupink = new RGBColor(255,20,147);
	RGBColor zhaoblue = new RGBColor(30,144,255);
	RGBColor lvpink = new RGBColor(148, 0, 211);
	RGBColor white = new RGBColor(255, 255, 255);
	RGBColor red = new RGBColor(255,69,0);
	RGBColor black = new RGBColor(0, 0, 0);
	RGBColor green= new RGBColor(34,139,34);
	RGBColor yellow= new RGBColor(255,255,0);
	RGBColor bpink= new RGBColor(255,182,193);
	RGBColor warwinpink= new RGBColor(255, 106, 106);
	RGBColor warlosepink= new RGBColor(139, 131, 134);
	RGBColor glatrose= new RGBColor(255, 130, 171);
	RGBColor[] powerupColorstr  = {zhoupink, zhaoblue, lvpink};
	
	 /* ----solo---- */
	
	//HoldingPlusValue
	PlayerHoldingPlusValue pHoldingPluseValue = new PlayerHoldingPlusValue();
	
	 /* ----plusandminusvalue---- */
	
	PlayerPlusValue plusValue = new PlayerPlusValue();
	PlayerWarMinusValue minusValue = new PlayerWarMinusValue();
	OpponentWarMinusValue opponentMinusValue = new OpponentWarMinusValue();
	

	
	/* ----plusandminusvalue---- */
	
	/* ----shareSwitchAndValue---- */
	

	ShareSwitchAndValue shareSwitchAndValue = new ShareSwitchAndValue();
	
	/* ----shareSwitchAndValue---- */
	
	/* ----war---- */
	//戦闘判断
	
	PImage Pweaponphoto;
	PImage Wweaponphoto;
	
	
	

	
	//warcolor
	WarColor warColor = new WarColor(white, white, black, white, black);
	//warchoice
	
	AboutWar aboutWar = new AboutWar();
	WarVictoryOrDefeat warVictoryOrDefeat = new WarVictoryOrDefeat(false, false, false, false);	
	

	//warphoto
	PImage player_war_before_choice_photo0;
	PImage player_war_before_choice_photo1;
	PImage player_war_before_choice_photo2;
	PImage player_war_after_choice_photo;
	PImage opponent_war_after_choice_photo;
	//warphotostring
	String[] player_war_before_choice_photo_namestr = {"player_scissors_choice.png", "player_rock_choice.png", "player_paper_choice.png"};
	String[] opponent_war_before_choice_photo_namestr = {"opponent_scissors_choice.png", "opponent_rock_choice.png", "opponent_paper_choice.png"};
	String[] player_war_after_choice_photo_namestr = {"player_scissors.png", "player_rock.png", "player_paper.png"};
	String[] opponent_war_after_choice_photo_namestr = {"opponent_scissors.png", "opponent_rock.png", "opponent_paper.png"};
	//warcolor
	RGBColor wingreen = new RGBColor(34,139,34);
	RGBColor losered = new RGBColor(255,140,0);
	RGBColor scissorsred= new RGBColor(178,34,34);
	RGBColor rockyellow= new RGBColor(255,215,0);
	RGBColor paperblue= new RGBColor(123,104,238);
	RGBColor[] winorlosecolorstr  = {wingreen, losered};
	
	/* ----war---- */
	
	/* ----serif---- */
	String[] playernamestr = {"曹操", "劉備", "孫権"};
	
	String[] fserifstr = {"曹孟徳の覇道……妨げる者は消す", "劉玄徳が乱世を正す！", "孫家の志　この私が示そう！"};
	
	String[] playerfserifsoloprosstr = {"今なら敵陣を崩せる！　押せい！", "一気に打ち破る！", "父上、兄上、我が兵の強さ、ご覧あれ！"};
	
	String[] playerfserifsolobanlacestr = {"我が覇道を遮る者は、斬る！", "大義のため…私は戦う！", "孫家の力、見せてやろう！"};
	
	String[] playerfserifsoloconsstr = {"退くべきか…？", "進退、窮まったか…", "もはや、これまでか…"};
	
	String  playerfserifwin = "敵将！　討ち取った！";
	
	String  playerfserifwinbandit = "山賊！　討ち取った！";
	
	String[] playerfserifwinowergame1 = {"僕の力で乱世を制した!", "皆…ありがとう。今日までよく戦ってくれた。", "よくやった！これで乱世は終わろう！"};
	
	String[] playerfserifwinowergame2 = {"覇道は成した…これからは天の道を行こう。", "乱世は去った！さあ、皆で新しい時代を歩んでいこう。", "新たな天下を始まりましょう。"};
	
	String[] director = {"ディレクター", "傅 明揚"};
	
	String[] playerfserifsoloendstr = {"覇道では…天下は定まらぬのか？", "桃園の花は…散ってしまったか…", "父や兄には…及ばぬ…か…"};
	
	String[] soloasidestr = {"もうすごし！", "頑張って！", "危ない！"};
	
	String[] citynamestr = {"赤壁(せきへき)", "荊州(けいしゅう)", "虎牢関(ころうかん)"};

	String[] citymapnamestr = {"赤壁", "荊州", "虎牢関"};

	String[] citynnamestr = {"赤", "荊", "虎"};

	String[] warlordnamestr = {"周 瑜(しゅう ゆ)(周 公瑾)", "趙 雲(ちょう うん)(趙 子龍)", "呂 布(りょ ふ)(呂 奉先)"};

	String[] warlordmapnamestr = {"周", "趙", "呂"};
	
	String[] warlordmediumnamestr = {"周瑜", "趙雲", "呂布"};
	
	String[] warlordserifstartstr = {"大将・周公瑾に、負けはない！", "趙子龍、いざ参る！", "雑魚どもが、これで終わりか！"};
	
	String[] warlordserifrunstr = {"逃げられるのか？負け犬", "どこだ！？　私が相手になろう！", "雑魚め……俺の邪魔はするなよ!"};
	
	String[] warlordserifsoloprosstr = {"我が軍の力、見せつける！", "ここが勝敗の分かれ目！", "安心しろ　一瞬だ！"};
	
	String[] warlordserifsolopowerupstr = {"我が剣舞、あの世で語り継げ！", "いざ参る！せいやぁっ！", "この虫けらども！消し飛べ！"};
	
	String[] warlordserifsoloconsstr = {"ここが生死の分かれ目ぞ！", "我が軍の兵を…許さん！", "俺の怒りに触れたな･･････覚えておけ！"};
	
	String[] warlordserifsoloendstr = {"江東の山々よ、美しき大河よ…さらばだ！", "ここまでか……無念だ！", "俺は死なん！　…俺は…"};
	
	String[] banditserifstartstr = {"お前……兵糧を持ってくれ！"};
	
	String[] banditserifsoloprosstr = {"ふふふ、皆殺しじゃ！"};
	
	String[] banditserifsolopowerupstr = {"これで一息つけるわい！"};
	
	String[] banditserifsoloconsstr = {"負けは許さんぞ！"};
	
	String banditserifsoloendstr = "わしが、なぜじゃあ…";
	/* ----serif---- */


	



	public void settings() {
        size(1000,618);
    }

	public void setup(){
	    PFont font = createFont("Meiryo", 120);
	    textFont(font);	   	    	    
	}
	public void draw(){ 		
	    background(255);
	    if(player.die && !(citystr[0].choice && citystr[1].choice && citystr[2].choice)){	    	
	    	if(player.warresultwaittime1 < 180) {
				textSize(35);
				textAlign(CENTER, CENTER);
				fill(0);
				text("Three Kingdoms", width / 2 ,height / 2);
				player.warresultwaittime1++;
	    	}else {
	    		textAlign(0);
		        //勢力選択	    		
		        fill(0);
		        textSize(15);
		        textAlign(CENTER);
		        text("三国(2.0 Beta)",width / 2, 25);
		        textAlign(0);
		        textSize(20);
		        text("魏(ぎ)\n",250, 100);
		        textSize(15);
		        text("\n攻撃力:100\n防御力:150\n体力:2000\n兵糧:500\n", 250, 120);
		        
		        textSize(20);
		        text("蜀(しょく)\n",450, 100);
		        textSize(15);
		        text("\n攻撃力:150\n防御力:100\n体力:1500\n兵糧:200\n", 450, 120);
		        
		        textSize(20);
		        text("呉(ご)\n",650, 100);
		        textSize(15);
		        text("\n攻撃力:130\n防御力:130\n体力:1700\n兵糧:300\n", 650, 120);
		        text("勢力(せいりょく)を選択してください", 390, 400);
	    	}						
	    }
	    //城位置判断
	    if(!player.die && !(citystr[0].choice && citystr[1].choice && citystr[2].choice)){
	    	wDao.CityAndWarlord(player, citystr, warlordstr, bandit, citynamestr, citymapnamestr, citynnamestr, warlordnamestr, warlordmapnamestr,warlordmediumnamestr, warlordserifstartstr, banditserifstartstr);
	    	//CityAndWarlord();	    	
	    }
	    
	    //else if(!player.die && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && !bandit.solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice){
	    	if(!player.die && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && !bandit.warcheck && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && !bandit.solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice && (!citystr[0].die || !citystr[1].die || !citystr[2].die)){
	       
	    		
	    		
	    		//logo
	        textSize(15);
	        textAlign(CENTER);
	        text("三国(2.0 Beta)",width / 2, 25);
	        textAlign(0);
	        //現在地
	        if(aboutLocation.NameLength(aboutLocation.Location(player, citystr)) == 2){
	            lx = 615;
	        }else if(aboutLocation.NameLength(aboutLocation.Location(player, citystr)) == 3){
	            lx = 600;
	        }else if(aboutLocation.NameLength(aboutLocation.Location(player, citystr)) == 4){
	            lx = 585;
	        }else if(aboutLocation.NameLength(aboutLocation.Location(player, citystr)) == 5){
	            lx = 570;
	        }
	        text(aboutLocation.Location(player, citystr), lx, ly);
	        text(":" + "(" + player.px + "," + player.py + ")", 645, 78);
	       
	        //winserif
	        if(!(player.fserif.equals(fserifstr[player.warid]))) {
	        	player.playerfserifwinwaittime++;
	        	if(player.playerfserifwinwaittime == 180) {
		        	
		        	player.fserif = fserifstr[player.warid];
		        	 	
		        	player.playerfserifwinwaittime = 0;
		        }
	        }
	        
	        //勢力
	        text(player.force , 740, 110);

	        text(player.fserif ,740, 130, 250, 60);

	        text("攻撃力:" + player.power, 740, 200);
	        
	        text("防御力:" + player.defence, 740, 220);
	        
	        text("体力:" + player.life, 740 , 240);
	        
	        
	        if(pHoldingPluseValue.Holdingplusvalueswitch  && player.food <= 10000){
	        	fill(green.R, green.G, green.B);
	        	String s = player.food + "";
	        	if(s.length() == 1) {
	        		text(" + " + pHoldingPluseValue.AllHoldingplusfood, 785, 260);
	        	}else if(s.length() == 2) {
	        		text(" + " + pHoldingPluseValue.AllHoldingplusfood, 795, 260);
	        	}else if(s.length() == 3) {
	        		text(" + " + pHoldingPluseValue.AllHoldingplusfood, 805, 260);
	        	}else if(s.length() == 4) {
	        		text(" + " + pHoldingPluseValue.AllHoldingplusfood, 815, 260);
	        	}else {
	        		text(" + " + pHoldingPluseValue.AllHoldingplusfood, 825, 260);
	        	}
	        	
	        }
	        fill(0);
        	text("兵糧:" + player.food, 740, 260);	        
	        text("所有の城:" + "\n\n", 740, 320);
	        
	        for(int k = 0; k < 3; k++){
	            if(citystr[k].die){
	                text(citystr[k].name + "\n\n", 740, 350 + (k * 20));             
	            }            
	        }	        	        
	        if(pHoldingPluseValue.Holdingplusvalueswitch && player.food <= 10000) {
	        	player.Possessionfoodtestwaittime++;
	        }
	        
	        if(player.Possessionfoodtestwaittime == 60 && player.food <= 10000) {
	        	pHoldingPluseValue.Holdingplusvalueswitch = false;
	        	pHoldingPluseValue.AllHoldingplusfood = 0;
	        	player.Possessionfoodtestwaittime = 0;
	        }
	        
	        if(citystr[0].die || citystr[1].die || citystr[2].die && player.food <= 10000) {
	        	player.Possessionfoodwaittime++;	       
	        }
	        	        
	        if(player.Possessionfoodwaittime == player.Possessionfoodtotalwaittime) {
	        	pHoldingPluseValue.Holdingplusvalueswitch = true;
	        	
	        	if(citystr[0].die) {
	        		pHoldingPluseValue.Holdingplusfood = pHoldingPluseValue.Holdingplusfood + citystr[0].dieplusfood;
	        		pHoldingPluseValue.AllHoldingplusfood = pHoldingPluseValue.AllHoldingplusfood + citystr[0].dieplusfood; 
		        }
		        if(citystr[1].die) {
		        	pHoldingPluseValue.Holdingplusfood = pHoldingPluseValue.Holdingplusfood + citystr[1].dieplusfood;
		        	pHoldingPluseValue.AllHoldingplusfood = pHoldingPluseValue.AllHoldingplusfood + citystr[1].dieplusfood; 
		        }
		        if(citystr[2].die) {
		        	pHoldingPluseValue.Holdingplusfood = pHoldingPluseValue.Holdingplusfood + citystr[2].dieplusfood;		        	
		        	pHoldingPluseValue.AllHoldingplusfood = pHoldingPluseValue.AllHoldingplusfood + citystr[2].dieplusfood; 
		        }
		        
		        if(player.food + pHoldingPluseValue.Holdingplusfood <= 10000) {
		        	player.food = player.food + pHoldingPluseValue.Holdingplusfood;
			        pHoldingPluseValue.Holdingplusfood = 0;		       
			        player.Possessionfoodwaittime = 0;
		        }else {
		        	pHoldingPluseValue.AllHoldingplusfood = 10000 - player.food;
		        	player.food = 10000;
		        }
		        
	        }
	        	        
	        //城
	        for(int l = 0; l < 3; l++){
	            if(l == 2){
	            	mx = 22;
	            }else{
	                mx = 15;
	            }
	            strokeWeight(2);
	            strokeJoin(BEVEL);
	            stroke(0);
	            noFill();
	            rect(citystr[l].cx - 25, citystr[l].cy - 25, 50, 50);
	            stroke(255, 0, 0);      
	            //城門  
	            line((float)(citystr[l].cx - 25), (float)(citystr[l].cy - 7.5), (float)(citystr[l].cx - 25), (float)(citystr[l].cy + 7.5));

	            line((float)(citystr[l].cx + 25), (float)(citystr[l].cy - 7.5), (float)(citystr[l].cx + 25), (float)(citystr[l].cy + 7.5));

	            line((float)(citystr[l].cx - 7.5), (float)(citystr[l].cy - 25), (float)(citystr[l].cx + 7.5), (float)(citystr[l].cy - 25));

	            line((float)(citystr[l].cx - 7.5), (float)(citystr[l].cy + 25), (float)(citystr[l].cx + 7.5), (float)(citystr[l].cy + 25));

	            fill(0);
	            text(citystr[l].mapname, citystr[l].cx - mx, citystr[l].cy - my);
	            
	        }
	        
	        
	        //範囲内城位と大将の状態
	        Integer n = aboutInformation.CityandWarlordInformation(player, citystr);
	        Integer warlordactive = wDao.WarlordMove(player, citystr, warlordserifstartstr, warlordserifrunstr);
	        if(n != null && !citystr[n].warlord.die){ 
                text(citystr[n].name, 50, 110);

                text("兵糧:" + citystr[n].food, 50, 130);

                text(citystr[n].warlord.name, 50, 160);
                
                text(citystr[n].warlord.serif, 50, 180, 220, 60);  
                
                text("攻撃力:" + citystr[n].warlord.power,50, 250);

                text("防御力:" + citystr[n].warlord.defence, 50, 270);
                
                text("体力:" + citystr[n].warlord.life, 50, 290);
                if(warlordactive == null) {
                    text("主公、のさばっている敵("+ citystr[n].warlord.mediumname +")に打撃を与えますか[y(普通対戦),s(ソロ対戦),n(破棄)]？", 220, 560);
                }else {
                    text("対戦モードを選択して下さい[y(普通対戦),s(ソロ対戦)]", 310, 560); //大将自動攻撃範囲
                    player.playercannotmove = true;
                }	                	
	        }
	        
	        if(!bandit.die) {
	        	bandit.serif  = banditserifstartstr[0] ;
	        }
	        //山賊再生time

	        if(bandit.die && bandit.renascenttimeswitch) {
	        	text(bandit.name + "再生時間:" + (bandit.renascenttime - bandit.banditminutetime), 276, 80);
	        	bandit.banditsecondtime++;
				if(bandit.banditsecondtime == 60) {
					bandit.banditminutetime++;
					bandit.banditsecondtime = 0;
				}
				if(bandit.renascenttime == bandit.banditminutetime) {
					bandit.banditsecondtime = 0;
					bandit.banditminutetime = 0;
					bandit.renascenttimeswitch = false;
				}
	        }	       
	        
	        for(int o = 0; o < 3; o++){
	        	if(!citystr[o].warlord.die) {
	        		text(citystr[o].warlord.mapname, citystr[o].warlord.wx, citystr[o].warlord.wy);
	        	}
	            
	        }
	        
	        if(!bandit.die && aboutLocation.Location(player, citystr).equals("郊外")){
	        	
	            text(bandit.name +"が出て来た!", 50, 110);

	            text("兵糧:" + bandit.food, 50, 130);
	            
	            text(bandit.name, 50, 160);

	            text(bandit.serif, 50, 180, 220, 60);  

	            text("攻撃力:" + bandit.power,50, 250);

	            text("防御力:" + bandit.defence, 50, 270);

	            text("体力:" + bandit.life, 50, 290);
	            if(player.food >= bandit.banditneedfood) {
                	text("主公、"+ bandit.name + "に打撃を与えますか[y(普通対戦),s(ソロ対戦),n(破棄,兵糧-"+ bandit.banditneedfood +")]？", 240, 560);
                	player.playercannotmove = true;
                }else {
                	text("対戦モードを選択して下さい[y(普通対戦),s(ソロ対戦)]", 310, 560); //山賊強制攻撃
                	player.playercannotmove = true;
                }	 
	        }	        
	        //map
	        stroke(0, 0, 0); 
	        strokeWeight(3);
	        line(276, 85, 723, 85);
	        line(276, 85, 276, 532);
	        line(276, 532, 723, 532);
	        line(723, 85, 723, 532);
	        pDao.PlayerMove(player, citystr, bandit, plusValue, shareSwitchAndValue);
	        fill(0);
	        text(player.character, player.px, player.py);

	    }else if(!player.die && (citystr[0].solocheck && !citystr[0].warlord.die || citystr[1].solocheck && !citystr[1].warlord.die || citystr[2].solocheck && !citystr[2].warlord.die) && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && citystr[0].choice && citystr[1].choice && citystr[2].choice && !bandit.solocheck){
	    	
	    	if(!shareSwitchAndValue.warlordsolostartswitch) {
	    		player.solopx = width / 2;
 	 	    	player.solopy = 25;
 	 	    	player.solopyplustime = 0;
 	 	    	player. oldsolopyplustime = 0;
 	 	    	player.solodielineColor = red;
 	 	    	solopcolor = black;
	 		   	solowcolor = white;
	 		   	
	    		 if (citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck) {
	 	 	    	shareSwitchAndValue.solonum = 0;
	 	 	    		 	 		   	 
	 	 	    	citystr[0].warlord.solowx = width / 2;
	 	 	    	citystr[0].warlord.solowy = 25;
	 	 		   	 	 	 	    	
	 	 		   	citystr[0].warlord.solowyplustime =0;
	 	 		   	citystr[0].warlord.oldsolowyplustime = 0;
	 	 		   	 
	 	 		   	citystr[0].warlord.maxpower = false;
	 	 		   	citystr[0].warlord.domaxpowertime = 0;
	 	 		   	
	 	 		   	if(citystr[0].warlord.warid == 0) {
		 	 		   	citystr[0].warlord.maxpowertime = 1;	
		 	 		   	citystr[0].warlord.maxminutetime = 1;
	 	 		   	}else if(citystr[0].warlord.warid == 1) {
	 	 		   		citystr[0].warlord.maxpowertime = 2;	
	 	 		   	    citystr[0].warlord.maxminutetime = 2;
	 	 		   	}else if(citystr[0].warlord.warid == 2) {
	 	 		   		citystr[0].warlord.maxpowertime = 3;	
	 	 		   	    citystr[0].warlord.maxminutetime = 3;
	 	 		   	}	 	 		   	
	 	 		   	shareSwitchAndValue.warlordsolostartswitch = true;
	 	 	    	
	 	 		}else if (citystr[1].solocheck && !citystr[0].solocheck && !citystr[2].solocheck) {
	                  shareSwitchAndValue.solonum = 1;
	                  	 	 		   	 
	 	 	    	citystr[1].warlord.solowx = width / 2;
	 	 	    	citystr[1].warlord.solowy = 25;
	 	 		   	 	 	 	    	
	 	 		   	citystr[1].warlord.solowyplustime =0;
	 	 		   	citystr[1].warlord.oldsolowyplustime = 0;
	 	 		   	 
	 	 		   	citystr[1].warlord.maxpower = false;
	 	 		   	citystr[1].warlord.domaxpowertime = 0;
	 	 		   		 	 		   	
	 	 		   	if(citystr[1].warlord.warid == 0) {
	 	 		   		citystr[1].warlord.maxpowertime = 1;	
	 	 		   		citystr[1].warlord.maxminutetime = 1;
	 	 		   	}else if(citystr[1].warlord.warid == 1) {
	 	 		   		citystr[1].warlord.maxpowertime = 2;	
	 	 		   		citystr[1].warlord.maxminutetime = 2;
	 	 		   	}else if(citystr[1].warlord.warid == 2) {
	 	 		   		citystr[1].warlord.maxpowertime = 3;	
	 	 		   		citystr[1].warlord.maxminutetime = 3;
	 	 		   	} 
	 	 		   		 	 		   	
	 	 		   	shareSwitchAndValue.warlordsolostartswitch = true;
	 	 		}else if (citystr[2].solocheck && !citystr[1].solocheck && !citystr[0].solocheck){
	 	 			shareSwitchAndValue.solonum = 2;	 	 		   	 
	 	 	    	citystr[2].warlord.solowx = width / 2;
	 	 	    	citystr[2].warlord.solowy = 25;
	 	 		   	 	 	 	    	
	 	 		   	citystr[2].warlord.solowyplustime =0;
	 	 		   	citystr[2].warlord.oldsolowyplustime = 0;
	 	 		   	 
	 	 		   	citystr[2].warlord.maxpower = false;
	 	 		   	citystr[2].warlord.domaxpowertime = 0;
	 	 		   		 	 		   	
	 	 		   	if(citystr[2].warlord.warid == 0) {
	 	 		   		citystr[2].warlord.maxpowertime = 1;	
	 	 		   		citystr[2].warlord.maxminutetime = 1;
	 	 		   	}else if(citystr[2].warlord.warid == 1) {
	 	 		   		citystr[2].warlord.maxpowertime = 2;	
	 	 		   		citystr[2].warlord.maxminutetime = 2;
	 	 		   	}else if(citystr[2].warlord.warid == 2) {
	 	 		   		citystr[2].warlord.maxpowertime = 3;	
	 	 		   		citystr[2].warlord.maxminutetime = 3;
	 	 		   	}
	 	 		   		   		 	 		   	
	 	 		     shareSwitchAndValue.warlordsolostartswitch = true;
	 	 		}
	    		 citystr[shareSwitchAndValue.solonum].warlord.powerupColor = powerupColorstr[citystr[shareSwitchAndValue.solonum].warlord.warid];
	    		 citystr[shareSwitchAndValue.solonum].solopoweruplineColor = citystr[shareSwitchAndValue.solonum].warlord.powerupColor;
				 citystr[shareSwitchAndValue.solonum].solodielineColor = red;
	    	}

	    	 if(solowcolor == white) {
		   		background(255);
		   	 }else {
		   		background(solowcolor.R, solowcolor.G, solowcolor.B);
		   	 }
	    	 
	    	 if(solopcolor == black) {
	    		 fill(0);
	    	 }else {
	    		 fill(solopcolor.R, solopcolor.G, solopcolor.B);
             }
             
	    	 noStroke();
	    	 quad(0, 0, 600, 0, 400, 618, 0, 618);
	    	 fill(255);
	    	 rect(0, height / 2 - 50, 1000, 100);
	    	 textSize(40);
	    	 
	    	 textAlign(CENTER);	    	 
	    	 text(citystr[shareSwitchAndValue.solonum].mapname , width / 2, 50);
	    	 
	    	 textAlign(0);
	    	 
	    	 fill(255);
	    	 textSize(20);
	    	 text("Spaceキーを連打して下さい!" , 60, 600);
	    	 textSize(20);
	    	 fill(0);
	    	 text("パワーアップ: " + (citystr[shareSwitchAndValue.solonum].warlord.maxpowertime - citystr[shareSwitchAndValue.solonum].warlord.domaxpowertime) + " 回" , 800, 50);	    	    	 	    	 
	    	 if(player.solopx <= 450) {
	    		 solopcolor = red;
	    		 player.solodielineColor = black;
	    		 player.fserif = playerfserifsoloconsstr[player.warid];
	    		 citystr[shareSwitchAndValue.solonum].soloaside = soloasidestr[2];
	    	 }else if(player.solopx >= 550){
	    		 solopcolor = green;
	    		 player.solodielineColor = red;
	    		 player.fserif = playerfserifsoloprosstr[player.warid];
	    		 citystr[shareSwitchAndValue.solonum].soloaside = soloasidestr[0];
	    	 }else {
	    		 solopcolor = black;
	    		 player.solodielineColor = red;
	    		 player.fserif = playerfserifsolobanlacestr[player.warid];
	    		 citystr[shareSwitchAndValue.solonum].soloaside = soloasidestr[1];
	    	 }
	    	 fill(255);
	    	 textSize(45);	    	 
	    	 text(citystr[shareSwitchAndValue.solonum].soloaside, 100, 500);
	    	 
	    	 //playerセリフ
	    	 textSize(30);
	    	 
	    	 fill(255);
	    	 text(player.name + ":" +player.fserif, 30, 60 ,500, 200);
	    	 
	    	 fill(solopcolor.R, solopcolor.G, solopcolor.B);
	    	 triangle(player.solopx, height / 2, player.solopx -player.solopy - 25, height / 2 + player.solopy, player.solopx -player.solopy - 25, height / 2 - player.solopy);
	    	 quad(player.solopx - 25- player.solopy,  height / 2 - player.solopy + 10, player.solopx - 25- player.solopy, height / 2 + player.solopy - 10, 0, height / 2 + player.solopy - 10, 0, height / 2 - player.solopy + 10);	 
	    	 //大将セリフ
	    	 fill(0);
		    	
	    	 textSize(30);
	    	 	    	
	    	 text(citystr[shareSwitchAndValue.solonum].warlord.mediumname + ":" + citystr[shareSwitchAndValue.solonum].warlord.serif, 500, 388, 500, 300);
	    	 
	    	 fill(solowcolor.R, solowcolor.G, solowcolor.B);
	    	 
	    	 if(citystr[shareSwitchAndValue.solonum].warlord.solowx >= 550 && !citystr[shareSwitchAndValue.solonum].warlord.maxpower) {
	    		 solowcolor = red;
	    		 citystr[shareSwitchAndValue.solonum].solodielineColor = black;
	    		 citystr[shareSwitchAndValue.solonum].warlord.serif = warlordserifsoloconsstr[citystr[shareSwitchAndValue.solonum].warlord.warid];
	    	 }else if(citystr[shareSwitchAndValue.solonum].warlord.maxpower) {
	    		 solowcolor = citystr[shareSwitchAndValue.solonum].warlord.powerupColor;
	    		 citystr[shareSwitchAndValue.solonum].solodielineColor = red;
	    		 citystr[shareSwitchAndValue.solonum].solopoweruplineColor = citystr[shareSwitchAndValue.solonum].warlord.powerupColor;
	    		 citystr[shareSwitchAndValue.solonum].warlord.serif = warlordserifsolopowerupstr[citystr[shareSwitchAndValue.solonum].warlord.warid];
	    	 }else if(citystr[shareSwitchAndValue.solonum].warlord.solowx <= 450 && !citystr[shareSwitchAndValue.solonum].warlord.maxpower) {
	    		 solowcolor =  yellow;
	    		 citystr[shareSwitchAndValue.solonum].solodielineColor = black;
	    		 citystr[shareSwitchAndValue.solonum].warlord.serif = warlordserifsoloprosstr[citystr[shareSwitchAndValue.solonum].warlord.warid];
	    	 }
	    	 if(citystr[shareSwitchAndValue.solonum].warlord.maxpowertime - citystr[shareSwitchAndValue.solonum].warlord.domaxpowertime == 0) {
	    		
	    		 citystr[shareSwitchAndValue.solonum].solopoweruplineColor = white;
	    	 }else {
	    		 citystr[shareSwitchAndValue.solonum].solopoweruplineColor = citystr[shareSwitchAndValue.solonum].warlord.powerupColor;
	    	 }
	    	 if(solowcolor == white) {
	    		 stroke(0);
	    	 }else {
	    		 stroke(solowcolor.R, solowcolor.G, solowcolor.B);
	    	 }	 	 
	    	 strokeWeight(2);
	    	 triangle(citystr[shareSwitchAndValue.solonum].warlord.solowx, height / 2, citystr[shareSwitchAndValue.solonum].warlord.solowx + 25+ citystr[shareSwitchAndValue.solonum].warlord.solowy, height / 2 + citystr[shareSwitchAndValue.solonum].warlord.solowy, citystr[shareSwitchAndValue.solonum].warlord.solowx + 25 + citystr[shareSwitchAndValue.solonum].warlord.solowy, height / 2 - citystr[shareSwitchAndValue.solonum].warlord.solowy);
	    	 quad(citystr[shareSwitchAndValue.solonum].warlord.solowx + 25+ citystr[shareSwitchAndValue.solonum].warlord.solowy,  height / 2 - citystr[shareSwitchAndValue.solonum].warlord.solowy + 10, citystr[shareSwitchAndValue.solonum].warlord.solowx + 25+ citystr[shareSwitchAndValue.solonum].warlord.solowy, height / 2 + citystr[shareSwitchAndValue.solonum].warlord.solowy - 10,  width, height / 2 + citystr[shareSwitchAndValue.solonum].warlord.solowy - 10, width, height / 2 - citystr[shareSwitchAndValue.solonum].warlord.solowy + 10);	 
	    	 
	    	 stroke(citystr[shareSwitchAndValue.solonum].solopoweruplineColor.R, citystr[shareSwitchAndValue.solonum].solopoweruplineColor.G, citystr[shareSwitchAndValue.solonum].solopoweruplineColor.B);
	    	 
	    	 //powerup線
	    	 strokeWeight(4);
             line(width / 2 + 50, height / 2 - 80, width / 2 + 50, height / 2 + 80);
             
	    	 //死亡線
	    	 stroke(player.solodielineColor.R, player.solodielineColor.G, player.solodielineColor.B);
	    	 line(width / 2 - 150, height / 2 - 80, width / 2 - 150, height / 2 + 80);
	    	 stroke(citystr[shareSwitchAndValue.solonum].solodielineColor.R, citystr[shareSwitchAndValue.solonum].solodielineColor.G, citystr[shareSwitchAndValue.solonum].solodielineColor.B);
	    	 line(width / 2 + 150, height / 2 - 80, width / 2 + 150, height / 2 + 80);
	    	 
	    	 //die
	    	 if(player.solopx >= 650 && citystr[shareSwitchAndValue.solonum].warlord.solowx >= 650) {
	    		 citystr[shareSwitchAndValue.solonum].warlord.die = true;
	    	 }else if(player.solopx <= 350 && citystr[shareSwitchAndValue.solonum].warlord.solowx <= 350) {
	    		 player.die = true;
	    	 }
	    	 
	    	 if(player.solopx< 650  && player.solopx> 350 && citystr[shareSwitchAndValue.solonum].warlord.solowx > 350 &&  citystr[shareSwitchAndValue.solonum].warlord.solowx < 650 && warlordspacecheck && warlordspaceoff) {
	    		 if(citystr[shareSwitchAndValue.solonum].warlord.warid == 0) {
	    			 player.solopx = player.solopx + 10;//zhou
		    		 citystr[shareSwitchAndValue.solonum].warlord.solowx = citystr[shareSwitchAndValue.solonum].warlord.solowx + 10;
	    		 }else if(citystr[shareSwitchAndValue.solonum].warlord.warid == 1) {
	    			 player.solopx = player.solopx + 11;//zhao
		    		 citystr[shareSwitchAndValue.solonum].warlord.solowx = citystr[shareSwitchAndValue.solonum].warlord.solowx + 11;
	    		 }else {
	    			 player.solopx = player.solopx + 12;//lv
		    		 citystr[shareSwitchAndValue.solonum].warlord.solowx = citystr[shareSwitchAndValue.solonum].warlord.solowx + 12;
	    		 }	    		 	    		 
	    		 warlordspacecheck = false;
	    		 warlordspaceoff = false;
	    	    	
    		  }	  
	    	 if(player.solopx< 650  && player.solopx> 350 && citystr[shareSwitchAndValue.solonum].warlord.solowx > 350 &&  citystr[shareSwitchAndValue.solonum].warlord.solowx < 650) {
	    			
	    		 	if(citystr[shareSwitchAndValue.solonum].warlord.solowx >= 550 && citystr[shareSwitchAndValue.solonum].warlord.maxpowertime - citystr[shareSwitchAndValue.solonum].warlord.domaxpowertime > 0) {
	    		 		citystr[shareSwitchAndValue.solonum].warlord.maxpower = true;					 		
	    			 }			 
	    		 	if(citystr[shareSwitchAndValue.solonum].warlord.maxpower && citystr[shareSwitchAndValue.solonum].warlord.maxpowertime - citystr[shareSwitchAndValue.solonum].warlord.domaxpowertime > 0) {
	    		 		player.solopx = player.solopx - 2;
	    		 		citystr[shareSwitchAndValue.solonum].warlord.solowx = citystr[shareSwitchAndValue.solonum].warlord.solowx - 2;		 				 		
	    		 		shareSwitchAndValue.secondtime++;
	    				if(shareSwitchAndValue.secondtime >= 60) {
	    					shareSwitchAndValue.minutetime++;
	    					shareSwitchAndValue.secondtime = 0;
	    				}
	    				
	    				if(shareSwitchAndValue.minutetime == citystr[shareSwitchAndValue.solonum].warlord.maxminutetime) {
	    					citystr[shareSwitchAndValue.solonum].warlord.maxpower = false;
	    					citystr[shareSwitchAndValue.solonum].warlord.domaxpowertime++;
	    					shareSwitchAndValue.minutetime = 0;
	    				}else {
	    					fill(0);
	    					textSize(30);
	    					text("パワーアップ:"  + (citystr[shareSwitchAndValue.solonum].warlord.maxminutetime - shareSwitchAndValue.minutetime) + "秒(残り)!" , 600, 200);
	    				}
	    				
	    		 	}else {
	    		 		player.solopx = player.solopx - 1;
	    		 		citystr[shareSwitchAndValue.solonum].warlord.solowx = citystr[shareSwitchAndValue.solonum].warlord.solowx - 1;		 	
	    		 	}
	    		 	
	    		 	//psize		 	
	    		 	if(player.solopx >= width / 2) {		 		
	    		 		
	    		 		player.solopyplustime = (int)((player.solopx - (width / 2)) / 6);
	    		 		if(player.solopx == (width / 2) + (6 * player.solopyplustime) && player.solopy >= 25 && player.solopy <= 50){
	    		 			player.solopy = player.solopy + (player.solopyplustime - player.oldsolopyplustime);
	    		 			player.oldsolopyplustime = player.solopyplustime;
	    		 		}
	    		 	}

	    		 	//wsize		 	
	    		 	if(citystr[shareSwitchAndValue.solonum].warlord.solowx <= width / 2) {		 		
	    		 		citystr[shareSwitchAndValue.solonum].warlord.solowyplustime = (int)(((width / 2) - citystr[shareSwitchAndValue.solonum].warlord.solowx) / 6);
	    		 		if(citystr[shareSwitchAndValue.solonum].warlord.solowx == (width / 2) - (6 * citystr[shareSwitchAndValue.solonum].warlord.solowyplustime) && citystr[shareSwitchAndValue.solonum].warlord.solowy >= 25 && citystr[shareSwitchAndValue.solonum].warlord.solowy <= 50){
	    		 			citystr[shareSwitchAndValue.solonum].warlord.solowy = citystr[shareSwitchAndValue.solonum].warlord.solowy + (citystr[shareSwitchAndValue.solonum].warlord.solowyplustime - citystr[shareSwitchAndValue.solonum].warlord.oldsolowyplustime);
	    		 			citystr[shareSwitchAndValue.solonum].warlord.oldsolowyplustime = citystr[shareSwitchAndValue.solonum].warlord.solowyplustime;
	    		 		}
	    		 	}
	    		 			
	    		}
	    	
	    }else if(!player.die && !bandit.die && bandit.solocheck && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice ) {//solo山賊	    	
	    	if(!shareSwitchAndValue.banditsolostartswitch) {
		    		player.solopx = width / 2;
	 	 	    	player.solopy = 25;
	 	 	    	player.solopyplustime = 0;
	 	 	    	player. oldsolopyplustime = 0;
	 	 	    	
	 	 	    	solopcolor = black;
		 		   	bandit.solobcolor = white;		 		  
		 	 		   	 
	 	 	    	bandit.solowx = width / 2;
	 	 	    	bandit.solowy = 25;
	 	 		   	 	 	 	    	
	 	 		   	bandit.solowyplustime =0;
	 	 		   	bandit.oldsolowyplustime = 0;
	 	 		   	 
	 	 		   	bandit.maxpower = false;
	 	 		   	bandit.domaxpowertime = 0;
	 		   		 		
	 		   		bandit.maxpowertime = 1;	
	 		   		bandit.maxminutetime = 3;
		 	 		   	
		 	 		   		   	
	 		   		bandit.solodielineColor = red;
	 		   		bandit.solopoweruplineColor = bpink;
	 		   		bandit.powerupColor = bpink;
	 	 		    shareSwitchAndValue.banditsolostartswitch = true;
	 	 		}
	    	
            if(bandit.solobcolor == white) {
            background(255);
            }else {
            background(bandit.solobcolor.R, bandit.solobcolor.G, bandit.solobcolor.B);
            }
            
            if(solopcolor == black) {
                fill(0);
            }else {
                fill(solopcolor.R, solopcolor.G, solopcolor.B);
            }
            noStroke();
            quad(0, 0, 600, 0, 400, 618, 0, 618);
            fill(255);
            rect(0, height / 2 - 50, 1000, 100);
            textSize(40);
            if(aboutLocation.NameLength(bandit.name) == 2) {
                text(bandit.name , width / 2 - 40, 50);
            }else {
                text(bandit.name , width / 2 - 60, 50);
            }	    	 
            fill(255);
            textSize(20);
            text("Spaceキーを連打して下さい!" , 60, 600);
            textSize(20);
            fill(0);
            text("パワーアップ: " + (bandit.maxpowertime - bandit.domaxpowertime) + " 回" , 800, 50);	    
            
            if(player.solopx <= 450) {
                solopcolor = red;
                player.solodielineColor = black;
                player.fserif = playerfserifsoloconsstr[player.warid];
                bandit.soloaside = soloasidestr[2];
            }else if(player.solopx >= 550){
                solopcolor = green;
                player.solodielineColor = black;
                player.fserif = playerfserifsoloprosstr[player.warid];
                bandit.soloaside = soloasidestr[0];
            }else {
                solopcolor = black;
                player.solodielineColor = black;
                player.fserif = playerfserifsolobanlacestr[player.warid];
                bandit.soloaside = soloasidestr[1];
            }
            fill(255);
            textSize(45);	    	 
            text(bandit.soloaside, 100, 500);
            
            //playerセリフ
            textSize(30);
            
            fill(255);
            text(player.name + ":" +player.fserif, 30, 60 ,500, 200);
            
            fill(solopcolor.R, solopcolor.G, solopcolor.B);
            triangle(player.solopx, height / 2, player.solopx -player.solopy - 25, height / 2 + player.solopy, player.solopx -player.solopy - 25, height / 2 - player.solopy);
            quad(player.solopx - 25- player.solopy,  height / 2 - player.solopy + 10, player.solopx - 25- player.solopy, height / 2 + player.solopy - 10, 0, height / 2 + player.solopy - 10, 0, height / 2 - player.solopy + 10);	 
            //山賊セリフ
            fill(0);
            
            textSize(30);
                    
            text(bandit.name + ":" + bandit.serif, 500, 388, 500, 300);
            
            fill(bandit.solobcolor.R, bandit.solobcolor.G, bandit.solobcolor.B);
                        
            if(bandit.solowx >= 550 && !bandit.maxpower) {
                bandit.solobcolor = red;
                bandit.solodielineColor = black;
                bandit.serif = banditserifsoloconsstr[0];
            }else if(bandit.maxpower) {
                bandit.solodielineColor = red;
                bandit.solobcolor = bandit.powerupColor;
                bandit.serif = banditserifsolopowerupstr[0];
            }else if(bandit.solowx <= 450 && !bandit.maxpower) {
                bandit.solobcolor =  yellow;
                bandit.serif =banditserifsoloprosstr[0];
                bandit.solodielineColor = black;
            }
            
            if(bandit.maxpowertime - bandit.domaxpowertime == 0) {	    		
            bandit.solopoweruplineColor = white;
            }else {
                bandit.solopoweruplineColor = bandit.powerupColor;
            }
            
            if(bandit.solobcolor == white) {
                stroke(0);
            }else {
                stroke(bandit.solobcolor.R, bandit.solobcolor.G, bandit.solobcolor.B);
            }	 	 
            strokeWeight(2);
            triangle(bandit.solowx, height / 2, bandit.solowx + 25+ bandit.solowy, height / 2 + bandit.solowy, bandit.solowx + 25 + bandit.solowy, height / 2 - bandit.solowy);
            quad(bandit.solowx + 25+ bandit.solowy,  height / 2 - bandit.solowy + 10, bandit.solowx + 25+ bandit.solowy, height / 2 + bandit.solowy - 10,  width, height / 2 + bandit.solowy - 10, width, height / 2 - bandit.solowy + 10);	 
                        
        //powerup線
            strokeWeight(4);
            stroke(bandit.solopoweruplineColor.R, bandit.solopoweruplineColor.G, bandit.solopoweruplineColor.B);	    	 
            line(width / 2 + 50, height / 2 - 80, width / 2 + 50, height / 2 + 80);
            //死亡線
            stroke(player.solodielineColor.R, player.solodielineColor.G, player.solodielineColor.B);
            line(width / 2 - 150, height / 2 - 80, width / 2 - 150, height / 2 + 80);
            stroke(bandit.solodielineColor.R, bandit.solodielineColor.G, bandit.solodielineColor.B);
            line(width / 2 + 150, height / 2 - 80, width / 2 + 150, height / 2 + 80);

            
        //die
            if(player.solopx >= 650 && bandit.solowx >= 650) {
                bandit.die = true;
            }else if(player.solopx <= 350 && bandit.solowx <= 350) {
                player.die = true;
            }
            
            if(player.solopx< 650  && player.solopx> 350 && bandit.solowx > 350 &&  bandit.solowx < 650 && banditspacecheck && banditspaceoff) {

                    player.solopx = player.solopx + 13;
                    bandit.solowx = bandit.solowx + 13;
                                            
                    banditspacecheck = false;
                    banditspaceoff = false;
                
            }	  
            if(player.solopx< 650  && player.solopx> 350 && bandit.solowx > 350 &&  bandit.solowx < 650) {
                
                if(bandit.solowx >= 550 && bandit.maxpowertime - bandit.domaxpowertime > 0) {
                    bandit.maxpower = true;					 		
                    }			 
                if(bandit.maxpower && bandit.maxpowertime - bandit.domaxpowertime > 0) {
                    player.solopx = player.solopx - 2;
                    bandit.solowx = bandit.solowx - 2;		 				 		
                    shareSwitchAndValue.secondtime++;
                    if(shareSwitchAndValue.secondtime >= 60) {
                        shareSwitchAndValue.minutetime++;
                        shareSwitchAndValue.secondtime = 0;
                    }
                    
                    if(shareSwitchAndValue.minutetime == bandit.maxminutetime) {
                        bandit.maxpower = false;
                        bandit.domaxpowertime++;
                        shareSwitchAndValue.minutetime = 0;
                    }else {
                        fill(0);
                        textSize(30);
                        text("パワーアップ:"  + (bandit.maxminutetime - shareSwitchAndValue.minutetime) + "秒(残り)!" , 600, 200);
                    }
                    
                }else {
                    player.solopx = player.solopx - 1;
                    bandit.solowx = bandit.solowx - 1;		 	
                }
                
                //psize		 	
                if(player.solopx >= width / 2) {		 		
                    
                    player.solopyplustime = (int)((player.solopx - (width / 2)) / 6);
                    if(player.solopx == (width / 2) + (6 * player.solopyplustime) && player.solopy >= 25 && player.solopy <= 50){
                        player.solopy = player.solopy + (player.solopyplustime - player.oldsolopyplustime);
                        player.oldsolopyplustime = player.solopyplustime;
                    }
                }

	    		 	//bsize		 	
	    		 	if(bandit.solowx <= width / 2) {		 		
	    		 		bandit.solowyplustime = (int)(((width / 2) - bandit.solowx) / 6);
	    		 		if(bandit.solowx == (width / 2) - (6 * bandit.solowyplustime) && bandit.solowy >= 25 && bandit.solowy <= 50){
	    		 			bandit.solowy = bandit.solowy + (bandit.solowyplustime - bandit.oldsolowyplustime);
	    		 			bandit.oldsolowyplustime = bandit.solowyplustime;
	    		 		}
	    		 	}
	    		 			
	    		}
	    	 
	    	}else if(!player.die && (citystr[0].warcheck &&  !citystr[0].warlord.die  || citystr[1].warcheck &&  !citystr[1].warlord.die || citystr[2].warcheck &&  !citystr[2].warlord.die) && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && !bandit.solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice){
	    		if(!shareSwitchAndValue.warlordwarstartswitch) {
	    			
	    			if(citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck) {
	    				
	    				if(citystr[0].warlord.warid == 0) {
	    					warColor.trianglecolor1 = zhoupink;
	    				}else if(citystr[0].warlord.warid == 1) {
	    					warColor.trianglecolor1 = zhaoblue;
	    				}else if(citystr[0].warlord.warid == 2) {
	    					warColor.trianglecolor1 = lvpink;
	    				}
	    				shareSwitchAndValue.warlordwarnum = 0;
	    				shareSwitchAndValue.warlordwarstartswitch = true;	    				
		    		}else if(citystr[1].warcheck && !citystr[0].warcheck && !citystr[2].warcheck) {
		    			if(citystr[1].warlord.warid == 0) {
		    				warColor.trianglecolor1 = zhoupink;
	    				}else if(citystr[1].warlord.warid == 1) {
	    					warColor.trianglecolor1 = zhaoblue;
	    				}else if(citystr[1].warlord.warid == 2) {
	    					warColor.trianglecolor1 = lvpink;
	    				}
		    			shareSwitchAndValue.warlordwarnum = 1;
		    			shareSwitchAndValue.warlordwarstartswitch = true;
		    		}else if(citystr[2].warcheck && !citystr[0].warcheck && !citystr[1].warcheck) {
		    			if(citystr[2].warlord.warid == 0) {
		    				warColor.trianglecolor1 = zhoupink;
	    				}else if(citystr[2].warlord.warid == 1) {
	    					warColor.trianglecolor1 = zhaoblue;
	    				}else if(citystr[2].warlord.warid == 2) {
	    					warColor.trianglecolor1 = lvpink;
	    				}
		    			shareSwitchAndValue.warlordwarnum = 2;
		    			shareSwitchAndValue.warlordwarstartswitch = true;
		    		}
	    			player.warresulttext = "ハサミ、石、紙をクリックしてください。";
	    		}
	    				    	 
	    		player.warbeforephotoname0 = "/images/" + player_war_before_choice_photo_namestr[0];
	    		player.warbeforephotoname1 = "/images/" + player_war_before_choice_photo_namestr[1];
	    		player.warbeforephotoname2 = "/images/" + player_war_before_choice_photo_namestr[2];
	    		
    			player_war_before_choice_photo0 = loadImage(player.warbeforephotoname0);
	    		player_war_before_choice_photo1 = loadImage(player.warbeforephotoname1);
	    		player_war_before_choice_photo2 = loadImage(player.warbeforephotoname2);
	    			    		
	    		background(white.R, white.G, white.B);
	    			    		    		
	    		fill(warColor.trianglecolor1.R, warColor.trianglecolor1.G, warColor.trianglecolor1.B);
	    		noStroke();
	    		triangle(0,  0, width / 2, height / 2,  width, 0);
	    		
	    		if(!player.dowarchoiced) {
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 0) {
	    				warColor.trianglecolor1 = zhoupink;
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 1) {
	    				warColor.trianglecolor1 = zhaoblue;
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 2) {
	    				warColor.trianglecolor1 = lvpink;
	    			}
	    			
	    			warColor.trianglecolor2 = white;
	    			warColor.trianglecolor5 = black;
	    			player.warresulttext = "ハサミ、石、紙をクリックしてください。";
	    		}else {
	    			if(player.warchoice == 0) {
	    				warColor.trianglecolor2 = scissorsred;
	    			}else if(player.warchoice == 1) {
	    				warColor.trianglecolor2 = rockyellow;
	    			}else if(player.warchoice == 2) {
	    				warColor.trianglecolor2 = paperblue;
	    			}
	    			
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 0) {
	    				warColor.trianglecolor5 = scissorsred;
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 1) {
	    				warColor.trianglecolor5 = rockyellow;
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 2) {
	    				warColor.trianglecolor5 = paperblue;
	    			}
	    			
	    		}
	    		
	    		fill(warColor.trianglecolor2.R, warColor.trianglecolor2.G, warColor.trianglecolor2.B);
	    		noStroke();
	    		triangle(0,  0, width / 2, height / 2,  0, height);
		    		
                //相手nochoice
	    		fill(warColor.trianglecolor5.R, warColor.trianglecolor5.G, warColor.trianglecolor5.B);
	    		noStroke();
	    		triangle(width,  0, width / 2, height / 2,  width, height);
                //情報               
	    		//player
                fill(warColor.trianglecolor3.R, warColor.trianglecolor3.G, warColor.trianglecolor3.B);
	    		noStroke();
	    		triangle(0,  height, width / 2, height / 2,  width / 2, height);
	    		//相手
	    		fill(warColor.trianglecolor4.R, warColor.trianglecolor4.G, warColor.trianglecolor4.B);
	    		//fill(losered.R, losered.G, losered.B);	    		
	    		noStroke();
	    		triangle(width / 2,  height, width / 2, height / 2,  width, height);
	    		
	    		//Choicephoto
                //playerchoice
	    		if(!player.dowarchoiced) {
		    		image(player_war_before_choice_photo0 , 50, height / 2 - 160);//image 175 88
		    		image(player_war_before_choice_photo1 , 50, height / 2 - 44);//image 175 88
		    		image(player_war_before_choice_photo2 , 50, height / 2 + 72);//image 175 88
		    		//相手choice
	    			textSize(120);
	    			fill(255);
	    			text("?", width - 250, height / 2 + 45);
	    		}else {
	    			if(player.warchoice == 0) {
	    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[0]);
	    			}else if(player.warchoice == 1) {
	    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[1]);
	    			}else if(player.warchoice == 2) {
	    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[2]);
	    			}
	    			
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 0) {
	    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[0]);
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 1) {
	    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[1]);
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warchoice == 2) {
	    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[2]);
	    			}
	    			image(player_war_after_choice_photo , 50, 219);
	    			image(opponent_war_after_choice_photo, 595, 219);
	    		}	    		
	    		//城名
	    		fill(255);
		    	 textSize(40);
		    	 
		    	 if(aboutLocation.NameLength(citystr[shareSwitchAndValue.warlordwarnum].mapname) == 2) {
		    		 textAlign(CENTER);		    		 
		    		 text(citystr[shareSwitchAndValue.warlordwarnum].mapname , width / 2, 50);
		    	 }else {
		    		 textAlign(CENTER);
		    		 text(citystr[shareSwitchAndValue.warlordwarnum].mapname , width / 2, 50);
		    	 }	
		    	 //勝負
		    	 if(aboutLocation.NameLength(player.warresulttext) ==1) {
		    		 textSize(40);
		    		 textAlign(CENTER);
		    		 text(player.warresulttext , width / 2, height / 4);
		    	 }else{
		    		 textSize(20);
		    		 textAlign(CENTER);
		    		 text(player.warresulttext , width / 2, height / 4);
		    	 }
		    	 
		    	 //player状態
		    	    	 
		    	 if(plusValue.plusvalueswitch) {
	    	   		 
                    fill(255);
                    textSize(16);

	 		    	textAlign(LEFT);
	 		    	
	 		    	text(player.force , width / 2 - 150, height / 2 + 115);

	 		        text(player.name ,width / 2 - 150 , height / 2 + 150);

	 		        text("攻撃力:" + player.power, width / 2 - 150, height / 2 + 190);
	 		       
	 		        text("防御力:" + player.defence, width / 2 - 150, height / 2 + 220);
	 		       
	 		        text("体力:" + player.life, width / 2 - 150 , height / 2 + 250);
	 		    	
	 		    	text("兵糧:" + player.food, width / 2 - 150, height / 2 + 280);
	 		    	
	 		    	fill(wingreen.R, wingreen.G, wingreen.B);
	 		    	
	 		    	text(" + " + plusValue.pluspower, width / 2 - 70 , height / 2 + 190);
	 		    	text(" + " + plusValue.plusdefence, width / 2 - 70 , height / 2 + 220);
	 		    	text(" + " + plusValue.pluslife, width / 2 - 70 , height / 2 + 250);

	 		    	
	 		    	text(" + " + plusValue.plusfood, width / 2 - 70 , height / 2 + 280);
	 		    	
	 		    	fill(255);
	    	   	 }else {
	    	   		 fill(255);
	 		    	textSize(16);

	 		    	textAlign(LEFT);
	 		    	
	 		    	text(player.force , width / 2 - 150, height / 2 + 115);

	 		        text(player.name ,width / 2 - 150 , height / 2 + 150);

	 		        text("攻撃力:" + player.power, width / 2 - 150, height / 2 + 190);
	 		        
	 		        text("防御力:" + player.defence, width / 2 - 150, height / 2 + 220);
	 		        
	 		        text("体力:" + player.life , width / 2 - 150 , height / 2 + 250);
	 		    	if(minusValue.minusvalueswitch) {
	 		    		fill(red.R, red.G, red.B);
	 		    		text(" - " + minusValue.minuslife, width / 2 - 70 , height / 2 + 250);
	 		    	}
	 		    	
	 		    	 fill(255);
	 		    	text("兵糧:" + player.food, width / 2 - 150, height / 2 + 280);
	 		    	 
	    	   	 }
		    	
		        //相手状態
		        //stroke(0);
		        fill(0);
		    	textSize(16);
		    	
		    	text(citystr[shareSwitchAndValue.warlordwarnum].mapname, width / 2 + 75, height / 2 + 115);

		    	text(citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname,width / 2 + 75 , height / 2 + 150);

		        text("攻撃力:" + citystr[shareSwitchAndValue.warlordwarnum].warlord.power, width / 2 + 75, height / 2 + 190);
		        
		        text("防御力:" +  citystr[shareSwitchAndValue.warlordwarnum].warlord.defence, width / 2 + 75, height / 2 + 220);
		        
		        text("体力:" +  citystr[shareSwitchAndValue.warlordwarnum].warlord.life, width / 2 + 75 , height / 2 + 250);
		        
		        if(opponentMinusValue.minusvalueswitch) {			   
		        	fill(red.R, red.G, red.B);
			        text(" - " + opponentMinusValue.minuslife, width / 2 + 155 , height / 2 + 250);			       			        
		        }
		        fill(0);
		        text("兵糧:" +  citystr[shareSwitchAndValue.warlordwarnum].food, width / 2 + 75, height / 2 + 280);
		    		    	   	 
                //choicewaittime
                if(player.dowarchoiced && !citystr[shareSwitchAndValue.warlordwarnum].warlord.die) {
                    player.warchoicewaittime++;
                }
                if(player.dowarchoiced && player.warchoicewaittime == 90 && !citystr[shareSwitchAndValue.warlordwarnum].warlord.die) {
                player.dowarchoiced = false;
                player.warchoicewaittime = 0;
                }	
                //playerminusvaluewaittime
	    	   	if(minusValue.minusvalueswitch) {
	    	   		player.minusvaluewaittime++;
	    	   	}
	    	   	if(minusValue.minusvalueswitch && player.minusvaluewaittime == 60 && !citystr[shareSwitchAndValue.warlordwarnum].warlord.die) {
	    	   		minusValue.minusvalueswitch = false;
	    	   		player.minusvaluewaittime = 0;
	    	   	 }	
	    	   	//warminusvaluewaittime
	    	   	if(opponentMinusValue.minusvalueswitch) {
	    	   		citystr[shareSwitchAndValue.warlordwarnum].warlord.minusvaluewaittime++;
	    	   	}
	    	   	if(opponentMinusValue.minusvalueswitch && citystr[shareSwitchAndValue.warlordwarnum].warlord.minusvaluewaittime == 60 && !citystr[shareSwitchAndValue.warlordwarnum].warlord.die) {
	    	   		opponentMinusValue.minusvalueswitch = false;
	    	   		citystr[shareSwitchAndValue.warlordwarnum].warlord.minusvaluewaittime = 0;
                }	

	    	}else if(!player.die && !bandit.die && bandit.warcheck && !bandit.solocheck && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck &&  !citystr[0].solocheck &&  !citystr[1].solocheck &&  !citystr[2].solocheck  && citystr[0].choice && citystr[1].choice && citystr[2].choice) {	
					BanditWarDraw(player, bandit, shareSwitchAndValue);
	    	}else if(!player.die && (citystr[0].warcheck && citystr[0].warlord.die  || citystr[1].warcheck &&  citystr[1].warlord.die || citystr[2].warcheck &&  citystr[2].warlord.die || citystr[0].solocheck &&  citystr[0].warlord.die || citystr[1].solocheck &&  citystr[1].warlord.die || citystr[2].solocheck &&  citystr[2].warlord.die) && citystr[0].choice && citystr[1].choice && citystr[2].choice) {//die画面（３秒）
	    			OpponentDieDraw(player, shareSwitchAndValue);	    		
    		}else if((bandit.die && bandit.solocheck || bandit.die && bandit.warcheck) && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck &&  !citystr[0].solocheck &&  !citystr[1].solocheck &&  !citystr[2].solocheck  && citystr[0].choice && citystr[1].choice && citystr[2].choice) {
    				BanditDieDraw(player, shareSwitchAndValue);
    		}else if(player.die && citystr[0].choice && citystr[1].choice && citystr[2].choice && (!citystr[0].die || !citystr[1].die || !citystr[2].die)) {
                //playerdie
                if(player.warresultwaittime1 < 180 && player.warresultwaittime2 < 180) {
                    background(losered.R, losered.G, losered.B);
                    fill(255);
                    textAlign(CENTER);
                    textSize(35);
                    player.fserif = playerfserifsoloendstr[player.warid];
                    text(player.name + ":" + player.fserif, width / 2 ,height / 2);		    			
                    player.warresultwaittime1++;
                }else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 < 180) {
                    background(losered.R, losered.G, losered.B);
                    fill(255);
                    textAlign(CENTER);
                    textSize(35);
                    text("GAME OVER", width / 2, height / 2);
                    player.warresultwaittime2++;
                }else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180) {	
                        
                    textAlign(CENTER, CENTER);

                    textSize(35);

                    background(wingreen.R, wingreen.G, wingreen.B);
                    text("主公、もう一度チャレンジしますか?", width / 2, height / 4);
                    noFill();
                    text("はい", width / 2 - 100 , height / 4 + 200);
                    text("いいえ", width / 2 + 100 , height / 4 + 200);						    		    					
                }

	    		}else if(!player.die && citystr[0].die && citystr[0].choice && citystr[1].die && citystr[1].choice && citystr[2].die && citystr[2].choice) {
	    			PlayerWinDraw();
	    		}	    		
	    	}
		    
	
	    //allwin
		public void PlayerWinDraw(){
			textAlign(CENTER, CENTER);
			textSize(30);
			if(player.warresultwaittime1 < 180 && player.warresultwaittime2 < 180 && player.warresultwaittime3 < 270 && player.warresultwaittime4 < 120) {
				background(losered.R, losered.G, losered.B);				
				text(playernamestr[player.warid] + ":" + playerfserifwinowergame1[player.warid], width / 2 ,height / 2);	
	    		player.warresultwaittime1++;
			}else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 < 180 && player.warresultwaittime3 < 270 && player.warresultwaittime4 < 120) {
				background(wingreen.R, wingreen.G, wingreen.B);
				text(playernamestr[player.warid] + ":" + playerfserifwinowergame2[player.warid], width / 2 ,height / 2);
				player.warresultwaittime2++;
			}else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 < 270 && player.warresultwaittime4 < 120) {	
				background(paperblue.R, paperblue.G, paperblue.B);
				text(director[0], width / 2 ,height / 2 - 50);
				text(director[1], width / 2 ,height / 2 + 30);				
				player.warresultwaittime3++;				
			}else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 == 270 && player.warresultwaittime4 < 120) {
				background(255);
				textSize(35);
				fill(0);
				text("Three Kingdoms", width / 2 ,height / 2);
				player.warresultwaittime4++;
			}else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 == 270 && player.warresultwaittime4 == 120) {
				player.warresultwaittime1 = 0;		
				player.warresultwaittime2 = 0;		
				player.warresultwaittime3 = 0;	
				player.warresultwaittime4 = 0;	
				pDao.WarDie(player, citystr, bandit, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);	

			}						
		}
		
		public void BanditWarDraw(Player player, Bandit bandit ,ShareSwitchAndValue shareSwitchAndValue) {
			if(!shareSwitchAndValue.banditwarstartswitch) {    			    				
				warColor.trianglecolor1 = bpink;
				shareSwitchAndValue.banditwarstartswitch = true;	    				
				player.warchoicewaittime = 0;
    			player.warresulttext = "ハサミ、石、紙をクリックしてください。";
    			bandit.serif = banditserifstartstr[0];   			
    		}	    	 
    		player.warbeforephotoname0 = "/images/" + player_war_before_choice_photo_namestr[0];
    		player.warbeforephotoname1 = "/images/" + player_war_before_choice_photo_namestr[1];
    		player.warbeforephotoname2 = "/images/" + player_war_before_choice_photo_namestr[2];
   		
			player_war_before_choice_photo0 = loadImage(player.warbeforephotoname0);
    		player_war_before_choice_photo1 = loadImage(player.warbeforephotoname1);
    		player_war_before_choice_photo2 = loadImage(player.warbeforephotoname2);
    		    		
    		background(white.R, white.G, white.B);
    		    		
    		fill(warColor.trianglecolor1.R, warColor.trianglecolor1.G, warColor.trianglecolor1.B);
    		noStroke();
    		triangle(0,  0, width / 2, height / 2,  width, 0);
    		
    		if(!player.dowarchoiced) {
    			
				warColor.trianglecolor1 = bpink;    			
    			warColor.trianglecolor2 = white;
    			warColor.trianglecolor5 = black;
    			player.warresulttext = "ハサミ、石、紙をクリックしてください。";
    		}else {
    			if(player.warchoice == 0) {
    				warColor.trianglecolor2 = scissorsred;
    			}else if(player.warchoice == 1) {
    				warColor.trianglecolor2 = rockyellow;
    			}else if(player.warchoice == 2) {
    				warColor.trianglecolor2 = paperblue;
    			}
    			
    			if(bandit.warchoice == 0) {
    				warColor.trianglecolor5 = scissorsred;
    			}else if(bandit.warchoice == 1) {
    				warColor.trianglecolor5 = rockyellow;
    			}else if(bandit.warchoice == 2) {
    				warColor.trianglecolor5 = paperblue;
    			}
    			
    		}
    		
    		fill(warColor.trianglecolor2.R, warColor.trianglecolor2.G, warColor.trianglecolor2.B);
    		noStroke();
    		triangle(0,  0, width / 2, height / 2,  0, height);
	    		
            //相手nochoice
    		fill(warColor.trianglecolor5.R, warColor.trianglecolor5.G, warColor.trianglecolor5.B);
    		noStroke();
            triangle(width,  0, width / 2, height / 2,  width, height);
            
    		//情報
    		//player
            fill(warColor.trianglecolor3.R, warColor.trianglecolor3.G, warColor.trianglecolor3.B);
    		noStroke();
            triangle(0,  height, width / 2, height / 2,  width / 2, height);
            
    		//相手
    		fill(warColor.trianglecolor4.R, warColor.trianglecolor4.G, warColor.trianglecolor4.B);    		
    		noStroke();
    		triangle(width / 2,  height, width / 2, height / 2,  width, height);
    		
    		//Choicephoto
            //playerchoice
    		if(!player.dowarchoiced) {
	    		image(player_war_before_choice_photo0 , 50, height / 2 - 160);//image 175 88
	    		image(player_war_before_choice_photo1 , 50, height / 2 - 44);//image 175 88
	    		image(player_war_before_choice_photo2 , 50, height / 2 + 72);//image 175 88
	    		//相手choice
    			textSize(120);
    			fill(255);
    			text("?", width - 250, height / 2 + 45);
    		}else {
    			if(player.warchoice == 0) {
    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[0]);
    			}else if(player.warchoice == 1) {
    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[1]);
    			}else if(player.warchoice == 2) {
    				player_war_after_choice_photo = loadImage("/images/" + player_war_after_choice_photo_namestr[2]);
    			}    			
    			if(bandit.warchoice == 0) {
    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[0]);
    			}else if(bandit.warchoice == 1) {
    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[1]);
    			}else if(bandit.warchoice == 2) {
    				opponent_war_after_choice_photo = loadImage("/images/" + opponent_war_after_choice_photo_namestr[2]);
    			}
    			image(player_war_after_choice_photo , 50, 219);
    			image(opponent_war_after_choice_photo, 595, 219);
            }  
             		
    		//城名
    		fill(255);
	    	textSize(40);	    	 
	    	textAlign(CENTER);
            text(bandit.name , width / 2, 50);

            //勝負
            if(aboutLocation.NameLength(player.warresulttext) ==1) {
                textSize(40);
                textAlign(CENTER);
                //text(player.warresulttext , width / 2 - 20, height / 4);
                text(player.warresulttext , width / 2, height / 4);
            }else{
                textSize(20);
                textAlign(CENTER);
                //text(player.warresulttext , width / 2 - 172, height / 4);
                text(player.warresulttext , width / 2, height / 4);
            }
            
            //player状態
                    
            if(plusValue.plusvalueswitch) {
                
                fill(255);

                textSize(16);

                textAlign(LEFT);
                
                text(player.force , width / 2 - 150, height / 2 + 115);

                text(player.name ,width / 2 - 150 , height / 2 + 150);

                text("攻撃力:" + player.power, width / 2 - 150, height / 2 + 190);
                
                text("防御力:" + player.defence, width / 2 - 150, height / 2 + 220);
                
                text("体力:" + player.life, width / 2 - 150 , height / 2 + 250);
                
                text("兵糧:" + player.food, width / 2 - 150, height / 2 + 280);
                
                fill(wingreen.R, wingreen.G, wingreen.B);
                text(" + " + plusValue.pluspower, width / 2 - 70 , height / 2 + 190);
                text(" + " + plusValue.plusdefence, width / 2 - 70 , height / 2 + 220);
                text(" + " + plusValue.pluslife, width / 2 - 70 , height / 2 + 250);

                
                text(" + " + plusValue.plusfood, width / 2 - 70 , height / 2 + 280);
                
                fill(255);
            }else {
                fill(255);
                textSize(16);

                textAlign(LEFT);
                
                text(player.force , width / 2 - 150, height / 2 + 115);

                text(player.name ,width / 2 - 150 , height / 2 + 150);

                text("攻撃力:" + player.power, width / 2 - 150, height / 2 + 190);
                
                text("防御力:" + player.defence, width / 2 - 150, height / 2 + 220);
                
                text("体力:" + player.life , width / 2 - 150 , height / 2 + 250);
            if(minusValue.minusvalueswitch) {
                fill(red.R, red.G, red.B);
                text(" - " + minusValue.minuslife, width / 2 - 70 , height / 2 + 250);
            }
            
                fill(255);
                text("兵糧:" + player.food, width / 2 - 150, height / 2 + 280);
                
            }
	    	
            //相手状態
	        //stroke(0);
	        fill(0);
	    	textSize(16);
	    	
	    	text(aboutLocation.Location(player, citystr), width / 2 + 75, height / 2 + 115);

	    	text(bandit.name, width / 2 + 75 , height / 2 + 150);

	        text("攻撃力:" + bandit.power, width / 2 + 75, height / 2 + 190);
	        
	        text("防御力:" +  bandit.defence, width / 2 + 75, height / 2 + 220);
	        
	        text("体力:" +  bandit.life, width / 2 + 75 , height / 2 + 250);
	        
	        if(opponentMinusValue.minusvalueswitch) {			   
	        	fill(red.R, red.G, red.B);
		        text(" - " + opponentMinusValue.minuslife, width / 2 + 155 , height / 2 + 250);			       			        
	        }
	        fill(0);
	        text("兵糧:" +  bandit.food, width / 2 + 75, height / 2 + 280);
	    	
	        
    		
    	   	 
    	   	 
    	   	 
            //choicewaittime
            if(player.dowarchoiced && !bandit.die) {
                player.warchoicewaittime++;
            }
            if(player.dowarchoiced && player.warchoicewaittime == 90 && !bandit.die) {
                player.dowarchoiced = false;
                player.warchoicewaittime = 0;
            }	
    	   	 //playerminusvaluewaittime
    	   	if(minusValue.minusvalueswitch) {
    	   		player.minusvaluewaittime++;
    	   	}
    	   	if(minusValue.minusvalueswitch && player.minusvaluewaittime == 60 && !bandit.die) {
    	   		minusValue.minusvalueswitch = false;
    	   		player.minusvaluewaittime = 0;
            }	
    	   	//warminusvaluewaittime
    	   	if(opponentMinusValue.minusvalueswitch) {
    	   		bandit.minusvaluewaittime++;
    	   	}
    	   	if(opponentMinusValue.minusvalueswitch && bandit.minusvaluewaittime == 60 && !bandit.die) {
    	   		opponentMinusValue.minusvalueswitch = false;
    	   		bandit.minusvaluewaittime = 0;
            }	
		}
			
	  
		
	
		
		
	//相手die	    				    			
	//Banditdie
	 public void BanditDieDraw(Player player, ShareSwitchAndValue shareSwitchAndValue) {
			fill(255);
			if(player.warresultwaittime1 < 180 && player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180) {
				textAlign(CENTER);
				textSize(35);
				background(losered.R, losered.G, losered.B);
				bandit.serif = banditserifsoloendstr;
				text(bandit.name + ":" + bandit.serif, width / 2 ,height / 2);   	
				player.warresultwaittime1++;
			}else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180){//wait(1)
				background(wingreen.R, wingreen.G, wingreen.B);
				textAlign(CENTER);
				player.fserif = playerfserifwinbandit;
				text(player.name + ":" + player.fserif, width / 2 ,height / 2);
				player.warresultwaittime2++;
			}else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 < 180) {
				background(wingreen.R, wingreen.G, wingreen.B);
				textAlign(LEFT);
				bDao.WarDie(player, bandit, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);	
				if(plusValue.plusvalueswitch) {	    		
					
					text("攻撃力:" + player.power + " + " +plusValue.pluspower, width / 2 - 130, height / 2 - 89);
	    			text("防御力:" +player.defence + " + " +plusValue.plusdefence, width / 2 - 130,height / 2 - 18);
	    			text("体力:" + player.life + " + " + plusValue.pluslife, width / 2 - 130,height / 2 + 45);
	    			text("兵糧:" + player.food +  " + " +plusValue.plusfood, width / 2 - 130,height / 2 + 116);

				}
				player.warresultwaittime3++;
				
			}else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 == 180) {//wait(2)	   
				
				bDao.WarDie(player, bandit, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);	
				player.warresultwaittime1 = 0;
				player.warresultwaittime2 = 0;
				player.warresultwaittime3 = 0;			
				
				plusValue.pluspower = 0;
				plusValue.plusdefence = 0;
				plusValue.pluslife = 0;
				plusValue.plusfood = 0;
			}
	 }
	 
	 public void OpponentDieDraw(Player player, ShareSwitchAndValue shareSwitchAndValue) {
        if(shareSwitchAndValue.warlordwarnum >= 0 && shareSwitchAndValue.warlordwarnum <= 2 && !(shareSwitchAndValue.solonum >= 0 && shareSwitchAndValue.solonum <= 2)) {
            fill(255);
            if(player.warresultwaittime1 < 180 && player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180) {
                textAlign(CENTER);
                textSize(35);
                background(losered.R, losered.G, losered.B);
                citystr[shareSwitchAndValue.warlordwarnum].warlord.serif = warlordserifsoloendstr[citystr[shareSwitchAndValue.warlordwarnum].warlord.warid];
                text(citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + citystr[shareSwitchAndValue.warlordwarnum].warlord.serif, width / 2 ,height / 2);   	
                player.warresultwaittime1++;
            }else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180){//wait(1)
                background(wingreen.R, wingreen.G, wingreen.B);
                textAlign(CENTER);
                player.fserif = playerfserifwin;
                text(player.name + ":" + player.fserif, width / 2 ,height / 2);
                player.warresultwaittime2++;
            }else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 < 180) {
                background(wingreen.R, wingreen.G, wingreen.B);
                textAlign(LEFT);
                wDao.WarDie(player, citystr, shareSwitchAndValue.warlordwarnum, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);
                if(plusValue.plusvalueswitch) {	    		
                    
                    text("攻撃力:" + player.power + " + " +plusValue.pluspower, width / 2 - 130, height / 2 - 89);
                    text("防御力:" +player.defence + " + " +plusValue.plusdefence, width / 2 - 130,height / 2 - 18);
                    text("体力:" + player.life + " + " + plusValue.pluslife, width / 2 - 130,height / 2 + 45);
                    text("兵糧:" + player.food +  " + " +plusValue.plusfood, width / 2 - 130,height / 2 + 116);
                    
                }
                player.warresultwaittime3++;
                
            }else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 == 180) {//wait(2)	    	
                wDao.WarDie(player, citystr, shareSwitchAndValue.warlordwarnum, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);
                player.warresultwaittime1 = 0;
                player.warresultwaittime2 = 0;
                player.warresultwaittime3 = 0;							
                plusValue.pluspower = 0;
                plusValue.plusdefence = 0;
                plusValue.pluslife = 0;
                plusValue.plusfood = 0;
            }
        }else if(shareSwitchAndValue.solonum >= 0 && shareSwitchAndValue.solonum <= 2 && !(shareSwitchAndValue.warlordwarnum >= 0 && shareSwitchAndValue.warlordwarnum <= 2)) {
            fill(255);            
            if(player.warresultwaittime1 < 180 && player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180) {
                textAlign(CENTER);
                textSize(35);
                background(losered.R, losered.G, losered.B);
                citystr[shareSwitchAndValue.solonum].warlord.serif = warlordserifsoloendstr[citystr[shareSwitchAndValue.solonum].warlord.warid];
                text(citystr[shareSwitchAndValue.solonum].warlord.mediumname + ":" + citystr[shareSwitchAndValue.solonum].warlord.serif, width / 2 ,height / 2);   	
                player.warresultwaittime1++;
            }else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 < 180 && player.warresultwaittime3 < 180){//wait(1)
                background(wingreen.R, wingreen.G, wingreen.B);
                textAlign(CENTER);
                player.fserif = playerfserifwin;
                text(player.name + ":" + player.fserif, width / 2 ,height / 2);
                player.warresultwaittime2++;
            }else if(player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 < 180) {
                background(wingreen.R, wingreen.G, wingreen.B);
                textAlign(LEFT);
                wDao.WarDie(player, citystr, shareSwitchAndValue.solonum, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);
                if(plusValue.plusvalueswitch) {	    		
                    
                    text("攻撃力:" + player.power + " + " +plusValue.pluspower, width / 2 - 130, height / 2 - 89);
                    text("防御力:" +player.defence + " + " +plusValue.plusdefence, width / 2 - 130,height / 2 - 18);
                    text("体力:" + player.life + " + " + plusValue.pluslife, width / 2 - 130,height / 2 + 45);
                    text("兵糧:" + player.food +  " + " +plusValue.plusfood, width / 2 - 130,height / 2 + 116);

                }
                player.warresultwaittime3++;
                
            }else if(player.warresultwaittime1 == 180 && player.warresultwaittime2 == 180 && player.warresultwaittime3 == 180) {//wait(2)	    	
                wDao.WarDie(player, citystr, shareSwitchAndValue.solonum, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);
                player.warresultwaittime1 = 0;
                player.warresultwaittime2 = 0;
                player.warresultwaittime3 = 0;			
                
                plusValue.pluspower = 0;
                plusValue.plusdefence = 0;
                plusValue.pluslife = 0;
                plusValue.plusfood = 0;
            }
        }		
    }
	        
	        
	
	    
	public void mouseClicked(MouseEvent e){
	    if(player.die && !(citystr[0].choice && citystr[1].choice && citystr[2].choice)){   
	        if(e.getX() >= 250 && e.getX() <= 330 && e.getY() >= 85 &&e.getY() <= 235){
	            pDao.ChoiceForce(player, 1, playernamestr, fserifstr);
	        }else if(e.getX() >= 450 && e.getX() <= 545 && e.getY() >= 85 &&e.getY() <= 235){
	        	pDao.ChoiceForce(player, 2, playernamestr, fserifstr);
	        }else if(e.getX() >= 650 && e.getX() <= 730 && e.getY() >= 85 &&e.getY() <= 235){
	        	pDao.ChoiceForce(player, 3, playernamestr, fserifstr);
	        }  
	    }     	    
	    //playerdie
	    if(player.die && citystr[0].choice && citystr[1].choice && citystr[2].choice && (!citystr[0].die || !citystr[1].die || !citystr[2].die)) {
	    	if(e.getX() >= width / 2 - 135 && e.getX() <= width / 2 - 65 && e.getY() >= height / 4 + 188 &&e.getY() <= height / 4 + 223) {	    		
	    		pDao.WarDie(player, citystr, bandit, plusValue, shareSwitchAndValue, minusValue, opponentMinusValue);	
				player.warresultwaittime1 = 0;		
				player.warresultwaittime2 = 0;		
	    	}else if(e.getX() >= width / 2 + 48 && e.getX() <= width / 2 + 153 && e.getY() >= height / 4 + 188 &&e.getY() <= height / 4 + 223) {
	    		exit();
	    	}
	    	
	    }	    
	    if(shareSwitchAndValue.warlordwarstartswitch && !player.dowarchoiced && !bandit.warcheck) {
	    	if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >=  (height / 2 - 160) && e.getY() <= (height / 2 - 72)){
	    		pDao.Warchoice(player, 0);
	    		wDao.Warchoice(citystr, shareSwitchAndValue.warlordwarnum);
	    		aboutWar.Warring(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat);
	    		if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;;
	    			minusValue.minuslife =  citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 0) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[0];//相手die
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 1) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[1];
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 2) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[2];
	    			}
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}
	    		
	    		player.dowarchoiced = true;		  	    		
	    	}else if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >= (height / 2 - 44) && e.getY() <= (height / 2 + 44)){	    	
	    		pDao.Warchoice(player, 1);
	    		wDao.Warchoice(citystr, shareSwitchAndValue.warlordwarnum);
	    		aboutWar.Warring(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat);
	    		if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;;
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 0) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[0];//相手die
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 1) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[1];
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 2) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[2];
	    			}
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}	    		
	    		player.dowarchoiced = true;		  	   
	    	}else if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >= (height / 2 + 72)&& e.getY() <= (height / 2 + 160)){
	    		pDao.Warchoice(player, 2);
	    		wDao.Warchoice(citystr, shareSwitchAndValue.warlordwarnum);
	    		aboutWar.Warring(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat);
	    		if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;
	    			if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 0) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[0];//相手die
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 1) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[1];
	    			}else if(citystr[shareSwitchAndValue.warlordwarnum].warlord.warid == 2) {
	    				player.warresulttext = citystr[shareSwitchAndValue.warlordwarnum].warlord.mediumname + ":" + warlordserifsoloendstr[2];
	    			}
	    			opponentMinusValue.minuslife = player.power - citystr[shareSwitchAndValue.warlordwarnum].warlord.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife = citystr[shareSwitchAndValue.warlordwarnum].warlord.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}
	    		
	    		player.dowarchoiced = true;		   
	    	}	    	
    	}
	    //banditwarpostandresult	    
	    if(shareSwitchAndValue.banditwarstartswitch && !player.dowarchoiced && bandit.warcheck) {
	    	if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >=  (height / 2 - 160) && e.getY() <= (height / 2 - 72)){
	    		pDao.Warchoice(player, 0);
	    		bDao.Warchoice(bandit);
	    		aboutWar.BanditWarring(player, bandit, warVictoryOrDefeat);
	    		if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife = bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			minusValue.minuslife =   bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;	    		
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}
	    		
	    		player.dowarchoiced = true;		  	    		
	    	}else if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >= (height / 2 - 44) && e.getY() <= (height / 2 + 44)){	    	
	    		pDao.Warchoice(player, 1);
	    		bDao.Warchoice(bandit);
	    		aboutWar.BanditWarring(player, bandit, warVictoryOrDefeat);
	    		if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;	    
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}	    		
	    		player.dowarchoiced = true;		  	   
	    	}else if(e.getX() >= 50 && e.getX() <= 225 && e.getY() >= (height / 2 + 72)&& e.getY() <= (height / 2 + 160)){
	    		pDao.Warchoice(player, 2);
	    		bDao.Warchoice(bandit);
	    		aboutWar.BanditWarring(player, bandit, warVictoryOrDefeat);
	    		if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(0)) {
	    			warColor.trianglecolor1 = wingreen;
	    			player.warresulttext = "勝";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(1)) {
	    			warColor.trianglecolor1 = losered;
	    			player.warresulttext = "負";
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(2)){
	    			warColor.trianglecolor1 = glatrose;
	    			player.warresulttext = "平";
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.BanditWarlife(player, bandit, warVictoryOrDefeat).equals(3)){
	    			warColor.trianglecolor1 = warwinpink;
	    			opponentMinusValue.minuslife = player.power - bandit.defence;
	    			opponentMinusValue.minusvalueswitch = true;
	    		}else if(aboutWar.Warlife(player, citystr, shareSwitchAndValue.warlordwarnum, warVictoryOrDefeat).equals(4)){	    			
	    			warColor.trianglecolor1 = warlosepink;
	    			if(player.warid == 0) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[0];//playerdie
	    			}else if(player.warid == 1) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[1];//playerdie
	    			}else if(player.warid == 2) {
	    				player.warresulttext = player.name + ":" + playerfserifsoloendstr[2];//playerdie
	    			}
	    			minusValue.minuslife =  bandit.power - player.defence;
	    			minusValue.minusvalueswitch = true;
	    		}else {
	    			warColor.trianglecolor1 = losered;
	    		}
	    		
	    		player.dowarchoiced = true;		   
	    	}	    	
    	}
	}	
	public void keyPressed() {
	    if (keyCode == RIGHT){
	        player.r = 1;
	    } 
	    if (keyCode == LEFT){
	    	player.l = 1;
	    } 
	    if (keyCode == UP){
	    	player.u = 1;
	    }
	    if (keyCode == DOWN){
	    	player.d = 1;
	    } 
	    
	    if((citystr[0].solocheck || citystr[1].solocheck || citystr[2].solocheck) && citystr[0].choice && citystr[1].choice && citystr[2].choice) {
		    if (keyCode == ' '){
		    	warlordspacecheck = true;
		    }
	    }
	    if((!citystr[0].solocheck &&!citystr[1].solocheck && !citystr[2].solocheck) && bandit.solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice) {
		    if (keyCode == ' '){
		    	banditspacecheck = true;
		    }
	    }
	}
	  
	public void keyReleased() {
	    if (keyCode == RIGHT){
	    	player.r = 0;
	    }
	    if (keyCode == LEFT){
	    	player.l = 0;
	    }
	    if (keyCode == UP){
	    	player.u = 0;
	    }
	    if (keyCode == DOWN){
	    	player.d = 0;
	    }
	    
	    if(aboutInformation.CityandWarlordInformation(player, citystr) != null) {
	    	if (keyCode == 'y' || keyCode == 'Y'){
		        pDao.ChoiceWar(aboutInformation.CityandWarlordInformation(player, citystr), citystr, true);
		    }
	    	if(keyCode == 's' || keyCode == 'S') {
		    	pDao.ChoiceSolo(aboutInformation.CityandWarlordInformation(player, citystr), citystr, true);
		    }
	    			
    	}
	    
		if(aboutLocation.Location(player, citystr).equals("郊外") && !bandit.die){
			if(keyCode == 'y' || keyCode == 'Y') {
				pDao.ChoiceBanditWar(player, bandit, true);
			}else if(keyCode == 's' || keyCode == 'S') {
				pDao.ChoiceBanditSolo(player, bandit, true);
			}
    	}		
	    if(aboutLocation.Location(player, citystr).equals("郊外") && player.food >= bandit.banditneedfood && !bandit.die){
			if(keyCode == 'n' || keyCode == 'N') {
				pDao.ChoiceBanditSolo(player, bandit, false);		    		
			}
	    }	
	    
	    if((citystr[0].solocheck || citystr[1].solocheck || citystr[2].solocheck) && citystr[0].choice && citystr[1].choice && citystr[2].choice) {
	    	
	    	if (keyCode == ' '){
	    		warlordspaceoff =true;
		    }
	    }
	    if((!citystr[0].solocheck &&!citystr[1].solocheck && !citystr[2].solocheck) && bandit.solocheck && citystr[0].choice && citystr[1].choice && citystr[2].choice) {
		    if (keyCode == ' '){
		    	banditspaceoff = true;
		    }
	    }
	}  
	 

}
