package PlayerActionDao;


import BanditActionDao.BanditActionDao;
import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CharacterInterface.PlayerAction;
import CommonalityDao.AboutLocation;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;
import PlaceInfo.City;

public class PlayerActionDao implements PlayerAction{
	BanditActionDao bDao = new BanditActionDao();
	AboutLocation aboutLocation = new AboutLocation();
	@Override
	public void PlayerMove(Player player , City[] citystr,Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue) {
		for(int p = 0; p < 3; p++){
		    if(player.px >= 277 && player.px <= 708 && player.py >= 100 && player.py <= 530 && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && !bandit.warcheck && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && !bandit.solocheck){
		        if (player.r == 1 && (player.px + 1 <= 708)){            
		            if(((player.px + 1 == citystr[p].cx - 39 && player.py - 10 >= citystr[p].cy - 7.5 && player.py <= citystr[p].cy + 7.5) || !(player.px + 1 == citystr[p].cx - 39 && player.py > citystr[p].cy - 27 && player.py <= citystr[p].cy + 38)) && ((player.px + 1 == citystr[p].cx + 10 && player.py - 10 >= citystr[p].cy - 7.5 && player.py <= citystr[p].cy + 7.5) || !(player.px + 1 == citystr[p].cx + 10 && player.py > citystr[p].cy - 27 && player.py <= citystr[p].cy + 38))){
		                if(!(player.py > citystr[p].cy - 27 && player.py < citystr[p].cy - 11 && player.px >= citystr[p].cx - 25 && player.px <= citystr[p].cx + 10)){
		                    if(!(player.py > citystr[p].cy + 24 && player.py < citystr[p].cy + 39 && player.px >= citystr[p].cx - 25 && player.px <= citystr[p].cx + 10)){
		                        if(p == 0){
		                            player.map.put("right1", true);
		                        }else if(p == 1){
		                            player.map.put("right2", true);
		                        }else if(p == 2){
		                            player.map.put("right3", true);
		                        }                            
		                    }else{
		                        if(p == 0){
		                            player.map.put("right1", false);
		                        }else if(p == 1){
		                            player.map.put("right2", false);
		                        }else if(p == 2){
		                            player.map.put("right3", false);
		                        }   
		                    }                     
		                }else{
		                    if(p == 0){
		                        player.map.put("right1", false);
		                    }else if(p == 1){
		                        player.map.put("right2", false);
		                    }else if(p == 2){
		                        player.map.put("right3", false);
		                    } 
		                }                 
		            }else{
		                if(p == 0){
		                    player.map.put("right1", false);
		                }else if(p == 1){
		                    player.map.put("right2", false);
		                }else if(p == 2){
		                    player.map.put("right3", false);
		                } 
		            }             
		        }else{
		            if(p == 0){
		                player.map.put("right1", false);
		            }else if(p == 1){
		                player.map.put("right2", false);
		            }else if(p == 2){
		                player.map.put("right3", false);
		            } 
		        } 
		        if (player.l == 1 && (player.px - 1 >= 277)){
		            if(((player.px - 1 == citystr[p].cx - 24 && player.py - 10 >= citystr[p].cy - 7.5 && player.py <= citystr[p].cy + 7.5) || !(player.px - 1 == citystr[p].cx - 24 && player.py > citystr[p].cy - 27 && player.py <= citystr[p].cy + 38)) && ((player.px - 1 == citystr[p].cx + 25 && player.py - 10 >= citystr[p].cy - 7.5 && player.py <= citystr[p].cy + 7.5) || !(player.px - 1 == citystr[p].cx + 25 && player.py > citystr[p].cy - 27 && player.py <= citystr[p].cy + 38)) ){
		                if(!(player.py > citystr[p].cy - 27 && player.py < citystr[p].cy - 11 && player.px >= citystr[p].cx - 25 && player.px <= citystr[p].cx + 10)){
		                    if(!(player.py > citystr[p].cy + 24 && player.py < citystr[p].cy + 39 && player.px >= citystr[p].cx - 25 && player.px <= citystr[p].cx + 10)){
		                        if(p == 0){
		                            player.map.put("left1", true);
		                        }else if(p == 1){
		                            player.map.put("left2", true);
		                        }else if(p == 2){
		                            player.map.put("left3", true);
		                        }    
		                    }else{
		                        if(p == 0){
		                            player.map.put("left1", false);
		                        }else if(p == 1){
		                            player.map.put("left2", false);
		                        }else if(p == 2){
		                            player.map.put("left3", false);
		                        }                            
		                    }                     
		                }else{
		                    if(p == 0){
		                        player.map.put("left1", false);
		                    }else if(p == 1){
		                        player.map.put("left2", false);
		                    }else if(p == 2){
		                        player.map.put("left3", false);
		                    } 
		                }   
		            }else{
		                if(p == 0){
		                    player.map.put("left1", false);
		                }else if(p == 1){
		                    player.map.put("left2", false);
		                }else if(p == 2){
		                    player.map.put("left3", false);
		                } 
		            }             
		        }else{
		            if(p == 0){
		                player.map.put("left1", false);
		            }else if(p == 1){
		                player.map.put("left2", false);
		            }else if(p == 2){
		                player.map.put("left3", false);
		            } 
		        }   
		        if (player.u == 1 && (player.py - 1 >= 100)){
		            if(((player.py - 1 == citystr[p].cy - 11 && player.px >= citystr[p].cx - 10 && player.px <= citystr[p].cx - 5) || !(player.py - 1 == citystr[p].cy - 11 && player.px > citystr[p].cx - 40 && player.px <= citystr[p].cx + 25)) && ((player.py - 1 == citystr[p].cy + 38 && player.px >= citystr[p].cx - 10 && player.px <= citystr[p].cx - 5) || !(player.py - 1 == citystr[p].cy + 38 && player.px > citystr[p].cx - 40 && player.px <= citystr[p].cx + 25))){
		                if(!(player.py > citystr[p].cy - 26 && player.py < citystr[p].cy + 38 && player.px > citystr[p].cx - 40 && player.px < citystr[p].cx - 25)){
		                    if(!(player.py > citystr[p].cy - 26 && player.py < citystr[p].cy + 38 && player.px > citystr[p].cx + 10 && player.px < citystr[p].cx + 25)){
		                        if(p == 0){
		                            player.map.put("up1", true);
		                        }else if(p == 1){
		                            player.map.put("up2", true);
		                        }else if(p == 2){
		                            player.map.put("up3", true);
		                        }                             
		                    }else{
		                        if(p == 0){
		                            player.map.put("up1", false);
		                        }else if(p == 1){
		                            player.map.put("up2", false);
		                        }else if(p == 2){
		                            player.map.put("up3", false);
		                        }    
		                    } 
		                }else{
		                    if(p == 0){
		                        player.map.put("up1", false);
		                    }else if(p == 1){
		                        player.map.put("up2", false);
		                    }else if(p == 2){
		                        player.map.put("up3", false);
		                    } 
		                }                     
		            }else{
		                if(p == 0){
		                    player.map.put("up1", false);
		                }else if(p == 1){
		                    player.map.put("up2", false);
		                }else if(p == 2){
		                    player.map.put("up3", false);
		                } 
		            }                 
		        }else{
		            if(p == 0){
		                player.map.put("up1", false);
		            }else if(p == 1){
		                player.map.put("up2", false);
		            }else if(p == 2){
		                player.map.put("up3", false);
		            } 
		        }   
		        if (player.d == 1 && (player.py + 1 <= 530)){
		            if(((player.py + 1 == citystr[p].cy - 26 && player.px >= citystr[p].cx - 10 && player.px <= citystr[p].cx - 5) || !(player.py + 1 == citystr[p].cy - 26 && player.px > citystr[p].cx - 40 && player.px <= citystr[p].cx + 25)) && ((player.py + 1 == citystr[p].cy + 24 && player.px >= citystr[p].cx - 10 && player.px <= citystr[p].cx - 5) || !(player.py + 1 == citystr[p].cy + 24 && player.px > citystr[p].cx - 40 && player.px <= citystr[p].cx + 25))){
		                if(!(player.py > citystr[p].cy - 26 && player.py < citystr[p].cy + 38 && player.px > citystr[p].cx - 40 && player.px < citystr[p].cx - 25)){
		                    if(!(player.py > citystr[p].cy - 26 && player.py < citystr[p].cy + 38 && player.px > citystr[p].cx + 10 && player.px < citystr[p].cx + 25)){
		                        if(p == 0){
		                            player.map.put("down1", true);
		                        }else if(p == 1){
		                            player.map.put("down2", true);
		                        }else if(p == 2){
		                            player.map.put("down3", true);
		                        }   
		                    }else{
		                        if(p == 0){
		                            player.map.put("down1", false);
		                        }else if(p == 1){
		                            player.map.put("down2", false);
		                        }else if(p == 2){
		                            player.map.put("down3", false);
		                        } 
		                    }   
		                }else{
		                    if(p == 0){
		                        player.map.put("down1", false);
		                    }else if(p == 1){
		                        player.map.put("down2", false);
		                    }else if(p == 2){
		                        player.map.put("down3", false);
		                    } 
		                }   
		            }else{
		                if(p == 0){
		                    player.map.put("down1", false);
		                }else if(p == 1){
		                    player.map.put("down2", false);
		                }else if(p == 2){
		                    player.map.put("down3", false);
		                } 
		            }                   
		        }else{
		            if(p == 0){
		                player.map.put("down1", false);
		            }else if(p == 1){
		                player.map.put("down2", false);
		            }else if(p == 2){
		                player.map.put("down3", false);
		            } 
		        }   
		    }
		}
		
		
		
		if(player.px >= 277 && player.px <= 708 && player.py >= 100 && player.py <= 530 && !citystr[0].warcheck && !citystr[1].warcheck && !citystr[2].warcheck && !bandit.warcheck && !citystr[0].solocheck && !citystr[1].solocheck && !citystr[2].solocheck && !bandit.solocheck && !player.playercannotmove) {
			if(player.map.get("right1") && player.map.get("right2") && player.map.get("right3")){
			    player.px++;
			    
			    bDao.Renascent(player,bandit);
			    if(player.food > 0 && player.life > 0){
			        player.food--;
			    }else if(player.life > 0){
			        player.life--;
			    }else if(player.food <= 0 && player.life <= 0) {
			    	player.die = true;
			    }
			}
			
			if(player.map.get("left1") && player.map.get("left2") && player.map.get("left3")){
			    player.px--;

			    bDao.Renascent(player,bandit);
			    if(player.food > 0 && player.life > 0){
			    player.food--;
			    }else if(player.life > 0){
			        player.life--;
			    }else if(player.food <= 0 && player.life <= 0) {
			    	player.die = true;
			    }
			}
			
			if(player.map.get("up1") && player.map.get("up2") && player.map.get("up3")){
			    player.py--;

			    bDao.Renascent(player,bandit);
			    if(player.food > 0 && player.life > 0){
			        player.food--;
			    }else if(player.life > 0){
			        player.life--;
			    }else if(player.food <= 0 && player.life <= 0) {
			    	player.die = true;
			    }
			}
			
			if(player.map.get("down1") && player.map.get("down2") && player.map.get("down3")){
			    player.py++;

			    bDao.Renascent(player,bandit);
			    if(player.food > 0 && player.life > 0){
			        player.food--;
			    }else if(player.life > 0){
			        player.life--;
			    }else if(player.food <= 0 && player.life <= 0) {
			    	player.die = true;
			    }
			}
		}
		

			
	}
	@Override
	public boolean ChoiceForce(Player player, int num, String[] playernamestr, String[] fserifstr){
	    switch (num) {
	        case 1:
	        	player.warid = 0;
	            player.force = "Îº(¤®)";
	            player.name = playernamestr[0];
	            player.character = "²Ü";
	            
	            player.power = 100;
	            player.defence = 150;
	            player.life = 2000;
	            player.food = 500;
	            player.fserif = fserifstr[0];
	            player.die = false;
	            player.warresultwaittime1 = 0;
	            player.playercannotmove = false;
	            return true;
	        case 2:
	        	player.warid = 1;
	            player.force = "Êñ(¤·¤ç¤¯)";
	            player.name = playernamestr[1];
	            player.character = "„¢";
	            player.power = 150;
	            player.defence = 100;
	            player.life = 1500;
	            player.food = 200;
	            player.fserif = fserifstr[1];
	            player.die = false;
	            player.warresultwaittime1 = 0;
	            player.playercannotmove = false;
	            return true;
	        case 3:
	        	player.warid = 2;
	            player.force = "…Ò(¤´)";
	            player.name = playernamestr[2];
	            player.character = "ŒO";
	            player.power = 130;
	            player.defence = 130;
	            player.life = 1700;
	            player.food = 300;
	            player.fserif = fserifstr[2];
	            player.die = false;
	            player.warresultwaittime1 = 0;
	            player.playercannotmove = false;
	            return true;
	        default:
	        return false;
	    }
	}
	@Override
	public void ChoiceWar(int n, City[] citystr, boolean check) {

			if(check){
				citystr[n].warcheck = true;

			}else {
				citystr[n].warcheck = false;
	
			}			

	}
	@Override
	public void ChoiceBanditWar(Player player, Bandit bandit, boolean check) {
		if(check){
			bandit.die = false;
			bandit.warcheck = true;
			bandit.solocheck = false;
		}else {
			bandit.warcheck = false;
		}
	}
	@Override
	public void ChoiceBanditSolo(Player player, Bandit bandit, boolean check) {
			if(check){
				bandit.die = false;
				bandit.warcheck = false;
				bandit.solocheck = true;
			}else {
				player.food = player.food - bandit.banditneedfood;	
				bandit.food = bandit.food +  bandit.banditneedfood ;
	    		player.playercannotmove = false;
				bandit.solocheck = false;
				bandit.die = true;				
			}			

	}
	
	public void ChoiceSolo(int n, City[] citystr, boolean check) {

			if(check){
				citystr[n].solocheck = true;
			}else {
				citystr[n].solocheck = false;		
			}			

	}
	
	@Override
	public void Warchoice(Player player, int playerchoice) {
		player.warchoice = playerchoice;			
	}
	@Override
	public void WarDie(Player player,City[] citystr, Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue) {
		citystr[0].choice = false;
		citystr[0].warlord.warchoice = 10;
		citystr[0].solocheck = false;
		citystr[0].warcheck = false;
		citystr[0].die = true;
		citystr[0].warlord.die = true;
		
		citystr[1].choice = false;
		citystr[1].warlord.warchoice = 10;
		citystr[1].solocheck = false;
		citystr[1].warcheck = false;
		citystr[1].die = true;
		citystr[1].warlord.die = true;
		
		citystr[2].choice = false;
		citystr[2].warlord.warchoice = 10;
		citystr[2].solocheck = false;
		citystr[2].warcheck = false;
		citystr[2].die = true;
		citystr[2].warlord.die = true;
		
		bandit.warcheck = false;
		bandit.solocheck = false;
		bandit.die = true;

		shareSwitchAndValue.RestoreShareSwitchAndValue();
		plusValue.RestorePlayerPlusValue();
		
		minusValue.RestorePlayerWarMinusValue();
		opponentMinusValue.RestoreOpponentWarMinusValue();					
		
		player.dowarchoiced = false;
		player.warchoice = 10;	
		player.id = 10;
		player.warid = 10;
		player.name = null;
		player.px = 300;
		player.py = 300;
		player.playercannotmove = true;
		//ÒÆ„ÓÅÐ¶Ï
		player.u = 0;
		player.d = 0;
		player.l = 0;
		player.r = 0;
		player.die = true;
	}




	

}
