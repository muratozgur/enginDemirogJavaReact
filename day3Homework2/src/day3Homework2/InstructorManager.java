package day3Homework2;

public class InstructorManager extends UserManager{
	@Override
	public void add() {
		System.out.println("Yeni egitmen ekleme islemi basarili!");
	}
	@Override
	public void remove() {
		System.out.println("Mevcut egitmeni kaldirma islemi basarili!");
	}
}
