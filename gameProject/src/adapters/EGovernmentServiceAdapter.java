package adapters;

import abstracts.GamerCheckService;
import entities.Gamer;

public class EGovernmentServiceAdapter implements GamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {//this is a demo. so whatever the informations is, it returns true
		return true;
	}
	
}
