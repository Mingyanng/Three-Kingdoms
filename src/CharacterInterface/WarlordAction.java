package CharacterInterface;

import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CharacterInfo.Warlord;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;
import PlaceInfo.City;

public interface WarlordAction {
	public void CityAndWarlord(Player player, City[] citystr, Warlord[] warlordstr, Bandit bandit, String[] citynamestr ,String[] citymapnamestr, String[] citynnamestr,  String[] warlordnamestr, String[] warlordmapnamestr, String[] warlordmediumnamestr, String[] warlordserifstartstr, String[] banditserifstartstr);
	public Integer WarlordMove(Player player , City[] citystr, String[] warlordserifstartstr,String[] warlordserifrunstr);
	public void Warchoice(City[] citystr, int warlordwarnum);
	public void WarDie(Player player,City[] citystr, int diewarlordnum, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue);
}
