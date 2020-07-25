package CommonalityDao;

import CharacterInfo.Player;
import PlaceInfo.City;

public class AboutInformation {
	
	public Integer CityandWarlordInformation(Player player , City[] citystr) {
		AboutLocation aboutLocation = new AboutLocation();
		for(int n = 0; n < 3; n++){                          
	        //if(player.px >= citystr[n].cx - 70 && player.px <= citystr[n].cx - 40 && player.py >= citystr[n].cy - 7.5 && player.py <= citystr[n].cy + 7.5 || player.px >= citystr[n].cx + 25 && player.px <= citystr[n].cx + 70 && player.py >= citystr[n].cy - 7.5 && player.py <= citystr[n].cy + 7.5 || player.px >= citystr[n].cx - 9.5 && player.px <= citystr[n].cx + 7.5 && player.py >= citystr[n].cy + 25 && player.py <= citystr[n].cy + 70 || player.px >= citystr[n].cx - 9.5 && player.px <= citystr[n].cx + 7.5 && player.py >= citystr[n].cy - 70 && player.py <= citystr[n].cy - 25){
			if(player.px >= citystr[n].cx - 70 && player.px <= citystr[n].cx + 70 && player.py >= citystr[n].cy - 70 && player.py <= citystr[n].cy + 70) {
	            if(!aboutLocation.Location(player, citystr).equals("½¼Íâ")){	            	
	                return n;
	            }else {
	            	return null;
	            }
	        }
		}
		return null;
	}


	
}
