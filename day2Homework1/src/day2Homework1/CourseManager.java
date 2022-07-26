package day2Homework1;

import java.util.Scanner;

public class CourseManager {
	
	public void changeCourseName(Course course) {//kullanýcýdan alýnan yeni ismi kursun ismi olarak günceller
		System.out.println("Lütfen " + course.courseId + " numaralý kursun yeni ismini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String newCourseName = scanner.nextLine();
		
		course.courseName = newCourseName;
		System.out.println(course.courseId + " numaralý kursun adý " + course.courseName + " olarak güncellendi");
	}
	public void changeCourseInstructor(Course course) {
		System.out.println("Lütfen " + course.courseId + " numaralý kursun yeni eðitmenini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String newCourseInstructor = scanner.nextLine();
		
		course.courseInstructor = newCourseInstructor;
		System.out.println(course.courseId + " numaralý kursun eðitmeni " + course.courseInstructor + " olarak güncellendi");
	}

}
