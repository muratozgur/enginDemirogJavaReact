package day3Homework2;

public class Main {

	public static void main(String[] args) {
		
		UserManager[] managers = {new InstructorManager(), new StudentManager()};
		
		for(UserManager manager : managers) {//polymorphism'den faydalanarak tek array'de Override sayesinde farkli sekilde ekleme yapildi
			manager.add();
		}
		for(UserManager manager : managers) {//polymorphism'den faydalanarak arraydaki tum elemanlar kaldirildi ve turune gore cikti alindi
			manager.remove();
		}

	}

}
