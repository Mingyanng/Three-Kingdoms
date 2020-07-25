package CharacterInterface;


import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;
import PlaceInfo.City;

public interface PlayerAction {
	public boolean ChoiceForce(Player player, int num, String[] playernamestr, String[] fserifstr);
	public void PlayerMove(Player player , City[] citystr,Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue);
	public void ChoiceWar(int n, City[] citystr, boolean check);
	public void ChoiceSolo(int n, City[] citystr, boolean check);
	public void ChoiceBanditWar(Player player, Bandit bandit, boolean check);
	public void ChoiceBanditSolo(Player player, Bandit bandit, boolean check);
	public void Warchoice(Player player, int playerchoice); 
	
	public void WarDie(Player player,City[] citystr, Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue);
}
