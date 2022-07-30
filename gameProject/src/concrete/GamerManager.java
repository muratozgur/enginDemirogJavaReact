package concrete;

import abstracts.BaseGamerManager;
import abstracts.GamerCheckService;
import entities.Gamer;

public class GamerManager extends BaseGamerManager{
	
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {//maybe we can use other platforms for validation.
																//in order to prevent addiction to the e-government system, we use constructor
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Validation is success");
			super.add(gamer);
		}	
		else {
			System.out.println("The person you entered is not a valid person");
		}
			
	}
	
}
