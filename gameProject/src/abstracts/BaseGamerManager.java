package abstracts;

import entities.Gamer;

public abstract class BaseGamerManager  implements GamerService{
	@Override
	public void add(Gamer gamer) {
		System.out.println("Gamer saved : " + gamer.getFirstName());
	}
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer deleted : " + gamer.getFirstName());
	}
	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer updated : " + gamer.getFirstName());
	}
}
