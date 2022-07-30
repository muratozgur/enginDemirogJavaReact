package abstracts;

import entities.Campaign;
import entities.Gamer;

public abstract class BaseSellManager {
	public void sell(Gamer gamer) {
		System.out.println("Product sold to : " + gamer.getNickName());
	}
	public void sell(Gamer gamer, Campaign campaign) {
		System.out.println("Product sold to : " + gamer.getNickName() + " with '" + campaign.getCampaignName() + "' campaign");
	}
}
