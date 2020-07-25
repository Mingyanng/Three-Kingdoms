package BanditActionDao;

import CharacterInfo.Bandit;
import CharacterInfo.Player;
import CharacterInterface.BanditAction;
import CommonalityObject.OpponentWarMinusValue;
import CommonalityObject.PlayerPlusValue;
import CommonalityObject.PlayerWarMinusValue;
import CommonalityObject.ShareSwitchAndValue;

public class BanditActionDao implements BanditAction{

	@Override
	public void Renascent(Player player, Bandit bandit) {
		
		bandit.banditraterandomnum = (int)(1 + Math.random()*(1000));
		if(bandit.banditraterandomnum <= bandit.banditratenum && !bandit.renascenttimeswitch){			
			bandit.power = player.defence + 10;
			bandit.defence = (int)(player.power / 3);
			bandit.life = player.power * 3;
	        bandit.die = false;
	        bandit.renascenttimeswitch = true;
	    }
		
	}
	@Override
	public void Warchoice(Bandit bandit) {
		
		int banditwarchoice = (int)((1+Math.random()*(3)) - 1);
		bandit.warchoice = banditwarchoice;
	}
	@Override
	public void WarDie(Player player,Bandit bandit, PlayerPlusValue plusValue, ShareSwitchAndValue shareSwitchAndValue, PlayerWarMinusValue minusValue, OpponentWarMinusValue opponentMinusValue) {
		
		if(bandit.die && player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 < 180) {

			plusValue.pluspower = bandit.pluspower;
			plusValue.plusdefence = bandit.plusdefence;
			plusValue.pluslife = bandit.pluslife;							
			plusValue.plusfood = bandit.food;
			
			plusValue.plusvalueswitch = true;
			
		}else if(bandit.die && player.warresultwaittime1 == 180 &&  player.warresultwaittime2 == 180 && player.warresultwaittime3 == 180) {
			player.power = player.power + plusValue.pluspower;
			player.defence = player.defence + plusValue.plusdefence;
			player.life = player.life + plusValue.pluslife;
			player.food = player.food + plusValue.plusfood;	
			
			plusValue.plusvalueswitch = false;
			
			player.playercannotmove = false;
			player.dowarchoiced = false;
			
			minusValue.minusvalueswitch = false;
			
			minusValue.RestorePlayerWarMinusValue();
			opponentMinusValue.minusvalueswitch = false;
			opponentMinusValue.RestoreOpponentWarMinusValue();
			
			shareSwitchAndValue.banditsolostartswitch = false;
			player.warchoice = 10;
			bandit.warchoice = 10;
			
			bandit.warcheck = false;
			bandit.solocheck = false;
			
		}

	}
}
