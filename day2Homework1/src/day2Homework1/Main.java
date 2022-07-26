package day2Homework1;

public class Main {

	public static void main(String[] args) {

		/*Course course1 = new Course(1, "Java + React", "Engin Demirog");//Yanlış kullanım
		Course course2 = new Course(2, "JavaScript", "Engin Demirog");*/
		
		Course course1 = new Course();
		course1.courseId = 1;
		course1.courseName = "Java + React";
		course1.courseInstructor = "Engin Demirog";
		
		Course course2 = new Course();
		course2.courseId = 2;
		course2.courseName = "JavaScript";
		course2.courseInstructor = "Engin Demirog";
		Course[] courses = { course1, course2 };

		CourseManager courseManager = new CourseManager();
		courseManager.changeCourseName(course1);

		courseManager.changeCourseInstructor(course2);

		for (Course course : courses) {
			System.out.println(course.courseName);
		}
	}

}
