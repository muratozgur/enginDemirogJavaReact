package concrete;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("New campaign has been created : " + campaign.getCampaignName());
	}
	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign has been deleted : " + campaign.getCampaignName());
	}
	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign has been updated : " + campaign.getCampaignName());
	}

}
