package CommonalityDao;


import CharacterInfo.Bandit;
import CharacterInfo.Player;
import PlaceInfo.City;
import VictoryOrDefeat.WarVictoryOrDefeat;

public class AboutWar {
	
	
	
	
	public void Warring(Player player, City[] citystr, int warlordwarnum, WarVictoryOrDefeat warVictoryOrDefeat) {
		if(warlordwarnum >= 0 && warlordwarnum <= 2) {
			warVictoryOrDefeat.warswitch = true;
		}		
		if(warVictoryOrDefeat.warswitch) {
			switch (player.warchoice) {
				case 0://äe
					if(citystr[warlordwarnum].warlord.warchoice == 0) {
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;					
					}else if(citystr[warlordwarnum].warlord.warchoice == 1) {
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;											
					}else if(citystr[warlordwarnum].warlord.warchoice == 2) {					
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;		
					}
					break;
				case 1://Ê¯
					if(citystr[warlordwarnum].warlord.warchoice == 0) {
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;	
					}else if(citystr[warlordwarnum].warlord.warchoice == 1) {												
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;	
					}else if(citystr[warlordwarnum].warlord.warchoice == 2) {										
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;	
					}
					break;
				case 2://¼ˆ
					if(citystr[warlordwarnum].warlord.warchoice == 0) {					
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;		
					}else if(citystr[warlordwarnum].warlord.warchoice == 1) {
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;								
					}else if(citystr[warlordwarnum].warlord.warchoice == 2) {										
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;	
					}
					break;				
				default:
					break;
			}
			warVictoryOrDefeat.warswitch = false;
		}
	}
	
	public Integer Warlife(Player player, City[] citystr, int warlordwarnum, WarVictoryOrDefeat warVictoryOrDefeat) {
		if(!warVictoryOrDefeat.warswitch) {
			if(warVictoryOrDefeat.victory && !warVictoryOrDefeat.glat && !warVictoryOrDefeat.defeat)  {
				if(citystr[warlordwarnum].warlord.life + citystr[warlordwarnum].warlord.defence - player.power > 0) {
					citystr[warlordwarnum].warlord.life = citystr[warlordwarnum].warlord.life + citystr[warlordwarnum].warlord.defence - player.power;
					return 0;
				}else {
					citystr[warlordwarnum].warlord.life = 0;
					citystr[warlordwarnum].warlord.die = true;
					return 3;
				}
			}else if(warVictoryOrDefeat.defeat && !warVictoryOrDefeat.glat && !warVictoryOrDefeat.victory) {
				if(player.life + player.defence - citystr[warlordwarnum].warlord.power > 0) {
					player.life = player.life + player.defence - citystr[warlordwarnum].warlord.power;
					return 1;
				}else {
					player.life = 0;
					player.die = true;
					return 4;
				}
			}else if(!warVictoryOrDefeat.defeat && warVictoryOrDefeat.glat && !warVictoryOrDefeat.victory) {
				if(citystr[warlordwarnum].warlord.life + citystr[warlordwarnum].warlord.defence - player.power > 0) {
					citystr[warlordwarnum].warlord.life = citystr[warlordwarnum].warlord.life + citystr[warlordwarnum].warlord.defence - player.power;
				}else {
					citystr[warlordwarnum].warlord.life = 0;
					citystr[warlordwarnum].warlord.die = true;
					return 3;
				}
				if(player.life + player.defence - citystr[warlordwarnum].warlord.power > 0) {
					player.life = player.life + player.defence - citystr[warlordwarnum].warlord.power;
				}else {
					player.life = 0;
					player.die = true;
					return 4;
				}
				return 2;
			}

		}
		return null;
	}

	public void BanditWarring(Player player, Bandit bandit, WarVictoryOrDefeat warVictoryOrDefeat) {

		warVictoryOrDefeat.warswitch = true;

		if(warVictoryOrDefeat.warswitch) {
			switch (player.warchoice) {
				case 0://äe
					if(bandit.warchoice == 0) {
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;					
					}else if(bandit.warchoice == 1) {
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;											
					}else if(bandit.warchoice == 2) {					
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;		
					}
					break;
				case 1://Ê¯
					if(bandit.warchoice == 0) {
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;	
					}else if(bandit.warchoice == 1) {												
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;	
					}else if(bandit.warchoice == 2) {										
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;	
					}
					break;
				case 2://¼ˆ
					if(bandit.warchoice == 0) {					
						warVictoryOrDefeat.defeat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.glat = false;		
					}else if(bandit.warchoice == 1) {
						warVictoryOrDefeat.victory = true;
						warVictoryOrDefeat.glat = false;					
						warVictoryOrDefeat.defeat = false;								
					}else if(bandit.warchoice == 2) {										
						warVictoryOrDefeat.glat = true;
						warVictoryOrDefeat.victory = false;
						warVictoryOrDefeat.defeat = false;	
					}
					break;				
				default:
					break;
			}
			warVictoryOrDefeat.warswitch = false;
		}
	}
	
	public Integer BanditWarlife(Player player, Bandit bandit, WarVictoryOrDefeat warVictoryOrDefeat) {
		if(!warVictoryOrDefeat.warswitch) {
			if(warVictoryOrDefeat.victory && !warVictoryOrDefeat.glat && !warVictoryOrDefeat.defeat)  {
				if(bandit.life + bandit.defence - player.power > 0) {
					bandit.life = bandit.life + bandit.defence - player.power;
					return 0;
				}else {
					bandit.life = 0;
					bandit.die = true;
					return 3;
				}
			}else if(warVictoryOrDefeat.defeat && !warVictoryOrDefeat.glat && !warVictoryOrDefeat.victory) {
				if(player.life + player.defence - bandit.power > 0) {
					player.life = player.life + player.defence - bandit.power;
					return 1;
				}else {
					player.life = 0;
					player.die = true;
					return 4;
				}
			}else if(!warVictoryOrDefeat.defeat && warVictoryOrDefeat.glat && !warVictoryOrDefeat.victory) {
				if(bandit.life + bandit.defence - player.power > 0) {
					bandit.life = bandit.life + bandit.defence - player.power;
				}else {
					bandit.life = 0;
					bandit.die = true;
					return 3;
				}
				if(player.life + player.defence - bandit.power > 0) {
					player.life = player.life + player.defence - bandit.power;
				}else {
					player.life = 0;
					player.die = true;
					return 4;
				}
				return 2;
			}

		}
		return null;
	}
}
