package day3Homework2;

public class StudentManager extends UserManager {
	@Override
	public void add() {
		System.out.println("Yeni ogrenci ekleme islemi basarili!");
	}
	@Override
	public void remove() {
		System.out.println("Mevcut ogrenciyi kaldirma islemi basarili!");
	}
}
