package WarlordActionDao;



import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CharacterInfo.Warlord;
import CharacterInterface.WarlordAction;
import CommonalityDao.AboutLocation;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;
import PlaceInfo.City;
public class WarlordActionDao implements WarlordAction{
	AboutLocation aboutLocation = new AboutLocation();
	@Override
	public Integer WarlordMove(Player player , City[] citystr, String[] warlordserifstartstr,String[] warlordserifrunstr) {
		 for(Integer n = 0; n < 3; n++){ 
			 if(!citystr[n].warlord.die) {
	            if(player.px >= citystr[n].cx - 70 && player.px <= citystr[n].cx - 40 && player.py >= citystr[n].cy - 7.5 && player.py - 15<= citystr[n].cy + 7.5){
		            if(!(player.px >= citystr[n].warlord.wx - 15 && player.px <= citystr[n].warlord.wx && player.py >= citystr[n].warlord.wy - 15 && player.py - 15<= citystr[n].warlord.wy)) {
		            	if(citystr[n].warlord.wx >= citystr[n].cx - 70 && citystr[n].warlord.wx <= citystr[n].cx + 70){
		                    citystr[n].warlord.wx--;
		                    citystr[n].warlord.serif = warlordserifstartstr[citystr[n].warlord.warid];
		                }
		            }else {
		            	return n;
		            }
	                

         
	            }else{
	                if(citystr[n].warlord.wx < citystr[n].cx - 8){
	                    citystr[n].warlord.wx++;
	                    citystr[n].warlord.serif = warlordserifrunstr[citystr[n].warlord.warid];
	                    if(!aboutLocation.Location(player, citystr).equals("郊外")){
	                    }    
	                }            
	                
	            }
	            if(player.px + 15>= citystr[n].cx + 25 && player.px <= citystr[n].cx + 70 && player.py >= citystr[n].cy - 7.5 && player.py - 15<= citystr[n].cy + 7.5){
	            	 if(!(player.px >= citystr[n].warlord.wx - 15 && player.px<= citystr[n].warlord.wx  + 15 && player.py >= citystr[n].warlord.wy - 15 && player.py  - 15 <= citystr[n].warlord.wy)) {
		                if(citystr[n].warlord.wx >= citystr[n].cx - 70 && citystr[n].warlord.wx <= citystr[n].cx + 70){
		                    citystr[n].warlord.wx++;
		                    citystr[n].warlord.serif = warlordserifstartstr[citystr[n].warlord.warid];
		                }
	            	 }else {
		            	return n;
		             }
	            }else{
	                if(citystr[n].warlord.wx > citystr[n].cx - 8){
	                    citystr[n].warlord.wx--;
	                    citystr[n].warlord.serif = warlordserifrunstr[citystr[n].warlord.warid];
	                    if(!aboutLocation.Location(player, citystr).equals("郊外")){
	                    }    
	                }

	            }                
	            
	            if(player.px + 15>= citystr[n].cx - 9.5 && player.px <= citystr[n].cx + 7.5 && player.py >= citystr[n].cy + 25 && player.py <= citystr[n].cy + 70){
	            	if(!(player.px >= citystr[n].warlord.wx - 15 && player.px <= citystr[n].warlord.wx  + 15 && player.py >= citystr[n].warlord.wy  && player.py <= citystr[n].warlord.wy + 15)) {
		                if(citystr[n].warlord.wy >= citystr[n].cy - 70 && citystr[n].warlord.wy <= citystr[n].cy + 70){
		                    citystr[n].warlord.wy++;
		                    citystr[n].warlord.serif = warlordserifstartstr[citystr[n].warlord.warid];
		                }
	            	}else {
		            	return n;
		            }
	            }else{
	                if(citystr[n].warlord.wy > citystr[n].cy + 8){
	                    citystr[n].warlord.wy--;
	                    citystr[n].warlord.serif = warlordserifrunstr[citystr[n].warlord.warid];
	                    if(!aboutLocation.Location(player, citystr).equals("郊外")){
	                    }
	                }

	            }
	            
	            if(player.px + 15>= citystr[n].cx - 9.5 && player.px <= citystr[n].cx + 7.5 && player.py >= citystr[n].cy - 70 && player.py <= citystr[n].cy - 25){
	            	if(!(player.px >= citystr[n].warlord.wx - 15 && player.px <= citystr[n].warlord.wx + 15&& player.py>= citystr[n].warlord.wy  - 15&& player.py <= citystr[n].warlord.wy)) {
		                if(citystr[n].warlord.wy >= citystr[n].cy - 70 && citystr[n].warlord.wy <= citystr[n].cy + 70){
		                    citystr[n].warlord.wy--;
		                    citystr[n].warlord.serif = warlordserifstartstr[citystr[n].warlord.warid];
		                }
	            	}else {
		            	return n;
		            }
	            }else{
	                if(citystr[n].warlord.wy < citystr[n].cy + 8){
	                    citystr[n].warlord.wy++;
	                    citystr[n].warlord.serif = warlordserifrunstr[citystr[n].warlord.warid];
	                    if(!aboutLocation.Location(player, citystr).equals("郊外")){

	                    }
	                }
	            }    
	            	            
	        }
	}
		 return null;
	}

	

	@Override
	public void CityAndWarlord(Player player, City[] citystr, Warlord[] warlordstr, Bandit bandit, String[] citynamestr ,String[] citymapnamestr, String[] citynnamestr,  String[] warlordnamestr, String[] warlordmapnamestr, String[] warlordmediumnamestr, String[] warlordserifstartstr, String[] banditserifstartstr){
	    if(!player.die) {
	    	citystr[0].name = citynamestr[0];
		    citystr[0].mapname = citymapnamestr[0];
		    citystr[0].nname = citynnamestr[0];
		    citystr[0].food = 300;
		    citystr[0].dieplusfood = 1;
		    citystr[0].die = false;
		    
		    citystr[1].name = citynamestr[1];
		    citystr[1].mapname = citymapnamestr[1];
		    citystr[1].nname = citynnamestr[1];
		    citystr[1].food = 400;
		    citystr[1].dieplusfood = 3;
		    citystr[1].die = false;
		    
		    citystr[2].name = citynamestr[2];
		    citystr[2].mapname = citymapnamestr[2];
		    citystr[2].nname = citynnamestr[2];
		    citystr[2].food = 500;
		    citystr[2].dieplusfood = 5;
		    citystr[2].die = false;
		    
		   warlordstr[0].id = 0;
		   warlordstr[0].warid = 0;
		   warlordstr[0].name = warlordnamestr[0];
		   warlordstr[0].mapname = warlordmapnamestr[0];
		   warlordstr[0].mediumname = warlordmediumnamestr[0];
		   warlordstr[0].power = 250;
		   warlordstr[0].defence = 50;
		   warlordstr[0].life = 2000;
		   warlordstr[0].serif = warlordserifstartstr[0];
		   warlordstr[0].pluspower = 10;
		   warlordstr[0].plusdefence = 10;
		   warlordstr[0].pluslife = 30;
		   warlordstr[0].die = false;
		   
		   warlordstr[1].id = 1;
		   warlordstr[1].warid = 1;
		   warlordstr[1].name = warlordnamestr[1];
		   warlordstr[1].mapname = warlordmapnamestr[1];
		   warlordstr[1].mediumname = warlordmediumnamestr[1];
		   warlordstr[1].power = 300;
		   warlordstr[1].defence = 60;
		   warlordstr[1].life = 2000;
		   warlordstr[1].serif = warlordserifstartstr[1];
		   warlordstr[1].pluspower = 15;
		   warlordstr[1].plusdefence = 15;
		   warlordstr[1].pluslife = 40;
		   warlordstr[1].die = false;
		   
		   warlordstr[2].id = 2;
		   warlordstr[2].warid = 2;
		   warlordstr[2].name = warlordnamestr[2];
		   warlordstr[2].mapname = warlordmapnamestr[2];
		   warlordstr[2].mediumname = warlordmediumnamestr[2];
		   warlordstr[2].power = 400;
		   warlordstr[2].defence = 70;
		   warlordstr[2].life = 4000;
		   warlordstr[2].serif = warlordserifstartstr[2];
		   warlordstr[2].pluspower = 20;
		   warlordstr[2].plusdefence = 20;
		   warlordstr[2].pluslife = 50;
		   warlordstr[2].die = false;
		   
		    while(true){	        
		        int cityxstr1 = (int)(351 + Math.random()*(653 - 351 + 1));
		        int cityystr1 = (int)(160 + Math.random()*(457 - 160 + 1));
		        int citywarlord1 = (int)(Math.random()*(2 + 1));

		        int cityxstr2 = (int)(351 + Math.random()*(653 - 351 + 1));
		        int cityystr2 = (int)(160 + Math.random()*(457 - 160 + 1));
		        int citywarlord2 = (int)(Math.random()*(2 + 1));

		        int cityxstr3 = (int)(351 + Math.random()*(653 - 351 + 1));
		        int cityystr3 = (int)(160 + Math.random()*(457 - 160 + 1));
		        int citywarlord3 = (int)(Math.random()*(2 + 1));

		        if(cityxstr1 != cityxstr2 && cityxstr1 != cityxstr3 && cityxstr2 != cityxstr3 && cityxstr1 != cityystr1 && cityxstr2 != cityystr2 && cityxstr3 != cityystr3 && cityxstr1 != cityystr1){
		            if(cityxstr1 - cityxstr2 > 100 && cityxstr1 - cityxstr3 > 100 && cityxstr2 - cityxstr3 > 100 || cityystr1 - cityystr2 > 100 && cityystr1 - cityystr3 > 100 && cityystr2 - cityystr3 > 100 ){
		                if(citywarlord1 != citywarlord2 && citywarlord1 != citywarlord3 && citywarlord2 != citywarlord3){
		                    citystr[0].cx = (int)cityxstr1;
		                    citystr[0].cy = (int)cityystr1;
		                    citystr[0].warlord = warlordstr[citywarlord1]; 
		                    citystr[0].warlord.wx = citystr[0].cx - 8;
		                    citystr[0].warlord.wy = citystr[0].cy + 8;  
		                    citystr[0].choice = true;	                    

		                    citystr[1].cx = (int)cityxstr2;
		                    citystr[1].cy = (int)cityystr2;
		                    citystr[1].warlord = warlordstr[citywarlord2];
		                    citystr[1].warlord.wx = citystr[1].cx - 8;
		                    citystr[1].warlord.wy = citystr[1].cy + 8;  
		                    citystr[1].choice = true;

		                    citystr[2].cx = (int)cityxstr3;
		                    citystr[2].cy = (int)cityystr3;
		                    citystr[2].warlord = warlordstr[citywarlord3];    
		                    citystr[2].warlord.wx = citystr[2].cx - 8;
		                    citystr[2].warlord.wy = citystr[2].cy + 8;  
		                    citystr[2].choice = true;

		                    break;
		                }else{
		                    continue;
		                }
		                
		            }else{
		                continue;
		            }
		            
		        }else{
		            continue;
		        }
		    }
	    }
	
	}



	@Override
	public void Warchoice(City[] citystr, int diewarlordnum) {
		
		int warlordwarchoice = (int)((1+Math.random()*(3)) - 1);
		citystr[diewarlordnum].warlord.warchoice = warlordwarchoice;
	}



	@Override
	public void WarDie(Player player,City[] citystr, int diewarlordnum, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue) {
		if(citystr[diewarlordnum].warlord.die && player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 < 180) {
			
			if(player.power + citystr[diewarlordnum].warlord.pluspower <= 390) {
				plusValue.pluspower = citystr[diewarlordnum].warlord.pluspower;
			}else {
				plusValue.pluspower = 0;
			}
			
			if(player.defence + citystr[diewarlordnum].warlord.plusdefence <= 240) {
				plusValue.plusdefence = citystr[diewarlordnum].warlord.plusdefence;
			}else {
				plusValue.plusdefence = 0;
			}
			if(player.life + citystr[diewarlordnum].warlord.pluslife <= 5000) {
				plusValue.pluslife = citystr[diewarlordnum].warlord.pluslife;	
			}else {
				plusValue.pluslife = 0;	
			}
			if(player.food + citystr[diewarlordnum].food <= 10000) {
				plusValue.plusfood = citystr[diewarlordnum].food;
			}else {
				plusValue.plusfood = 0;
			}	
			plusValue.plusvalueswitch = true;	
		}else if(citystr[diewarlordnum].warlord.die && player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 == 180) {			

				player.power = player.power + plusValue.pluspower;
				player.defence = player.power + plusValue.plusdefence;
				player.life = player.life + plusValue.pluslife;
				player.food = player.food + plusValue.plusfood;
			
			
			
			
			plusValue.plusvalueswitch = false;
			
			player.playercannotmove = false;
			player.dowarchoiced = false;
			player.warchoice = 10;			
			citystr[diewarlordnum].warlord.warchoice = 10;	
			
			minusValue.RestorePlayerWarMinusValue();
			opponentMinusValue.RestoreOpponentWarMinusValue();
						
			citystr[diewarlordnum].die = true;
			shareSwitchAndValue.RestoreShareSwitchAndValue();
			
			
			citystr[diewarlordnum].warcheck = false;
		
			citystr[diewarlordnum].solocheck = false;


		}
			
	
	}



		
}	


