package day2Homework1;

import java.util.Scanner;

public class CourseManager {
	
	public void changeCourseName(Course course) {//kullan�c�dan al�nan yeni ismi kursun ismi olarak g�nceller
		System.out.println("L�tfen " + course.courseId + " numaral� kursun yeni ismini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String newCourseName = scanner.nextLine();
		
		course.courseName = newCourseName;
		System.out.println(course.courseId + " numaral� kursun ad� " + course.courseName + " olarak g�ncellendi");
	}
	public void changeCourseInstructor(Course course) {
		System.out.println("L�tfen " + course.courseId + " numaral� kursun yeni e�itmenini giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String newCourseInstructor = scanner.nextLine();
		
		course.courseInstructor = newCourseInstructor;
		System.out.println(course.courseId + " numaral� kursun e�itmeni " + course.courseInstructor + " olarak g�ncellendi");
	}

}
