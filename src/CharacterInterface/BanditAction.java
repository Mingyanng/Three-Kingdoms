package CharacterInterface;

import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;

public interface BanditAction {
	public void Renascent(Player player, Bandit bandit);
	public void Warchoice(Bandit bandit);
	public void WarDie(Player player,Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue);
}
