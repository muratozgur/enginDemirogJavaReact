import abstracts.BaseGamerManager;
import abstracts.BaseSellManager;
import adapters.EGovernmentServiceAdapter;
import concrete.CampaignManager;
import concrete.GamerManager;
import concrete.SellManager;
import entities.Campaign;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager gamerManager = new GamerManager(new EGovernmentServiceAdapter());
		Gamer gamer1 = new Gamer(1, "zleaN", "Muhammed Murat", "Ozgur", "19335688126", 2001);
		gamerManager.add(gamer1);
		
		Campaign campaign1 = new Campaign(1, "Askeri Personel", 18);
		Campaign campaign2 = new Campaign(2, "Emniyet Teskilati Mensubu", 18);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.update(campaign2);
		campaignManager.add(campaign1);
		
		BaseSellManager sellManager = new SellManager();
		sellManager.sell(gamer1, campaign1);

	}

}
