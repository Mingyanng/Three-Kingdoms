package CommonalityDao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import CharacterInfo.Player;
import PlaceInfo.City;

public class AboutLocation{

	public String Location(Player player , City[] citystr) {
		if(player.px >= citystr[0].cx - 70 && player.px <= citystr[0].cx + 70 && player.py >= citystr[0].cy - 70 && player.py <= citystr[0].cy + 70 && !(player.px >= citystr[0].cx - 40 && player.px <= citystr[0].cx + 40 && player.py >= citystr[0].cy - 40 && player.py <= citystr[0].cy + 40)){
		    return "��ڽ���";        
		}
		if(player.px >= citystr[0].cx - 40 && player.px <= citystr[0].cx + 40 && player.py >= citystr[0].cy - 40 && player.py <= citystr[0].cy + 40){
		    return "���";
		}
		if(player.px >= citystr[1].cx - 70 && player.px <= citystr[1].cx + 70 && player.py >= citystr[1].cy - 70 && player.py <= citystr[1].cy + 70 && !(player.px >= citystr[1].cx - 40 && player.px <= citystr[1].cx + 40 && player.py >= citystr[1].cy - 40 && player.py <= citystr[1].cy + 40)){
		    return "�G�ݽ���";
		}
		if(player.px >= citystr[1].cx - 40 && player.px <= citystr[1].cx + 40 && player.py >= citystr[1].cy - 40 && player.py <= citystr[1].cy + 40){
		    return "�G��";
		}
		if(player.px >= citystr[2].cx - 70 && player.px <= citystr[2].cx + 70 && player.py >= citystr[2].cy - 70 && player.py <= citystr[2].cy + 70 && !(player.px >= citystr[2].cx - 40 && player.px <= citystr[2].cx + 40 && player.py >= citystr[2].cy - 40 && player.py <= citystr[2].cy + 40)){
		    return "�����v����";
		}
		if(player.px >= citystr[2].cx - 40 && player.px <= citystr[2].cx + 40 && player.py >= citystr[2].cy - 40 && player.py <= citystr[2].cy + 40){
		    return "�����v";
		}
		return "����";
	}
	public int NameLength(String str){
	    int count = 0;
	    String regEx = "[\\u4e00-\\u9fa5]";
	    Pattern p = Pattern.compile(regEx);
	    Matcher m = p.matcher(str);
	    while (m.find()) {
	        for (int i = 0; i <= m.groupCount(); i++) {
	            count = count + 1;
	        }
	    }
	    return count;
	}
}
