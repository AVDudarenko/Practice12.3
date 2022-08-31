package HomeTaskSeven;

import java.util.ArrayList;
import java.util.List;

public class Student {

	String name;
	String group;
	Integer course;
	Integer historyGrade;
	Integer javaGrade;
	Integer maths;

	public Student(String name,
				   String group,
				   Integer course,
				   Integer historyGrade,
				   Integer javaGrade,
				   Integer maths) {
		this.name = name;
		this.group = group;
		this.course = course;
		this.historyGrade = historyGrade;
		this.javaGrade = javaGrade;
		this.maths = maths;

	}

	static ArrayList<Student> listOfStudents = new ArrayList<>();

	public static void main(String[] args) {
		addStudents();
		deleteStudentWithLowGrade(listOfStudents);
		printStudents(listOfStudents, 2);
	}

	private static void addStudents() {
		Student one = new Student("Sasha", "1", 1, 5, 4, 5);
		Student two = new Student("Petya", "1", 1, 5, 4, 5);
		Student three = new Student("Ivan", "2", 2, 1, 5, 1);
		Student four = new Student("Masha", "3", 3, 5, 5, 5);
		Student five = new Student("Kate", "2", 2, 3, 3, 3);

		listOfStudents.add(one);
		listOfStudents.add(two);
		listOfStudents.add(three);
		listOfStudents.add(four);
		listOfStudents.add(five);
	}

	private static void deleteStudentWithLowGrade(List<Student> student) {

		for (Student studentForCheck : student) {
			int averageGradeOfStudent = (studentForCheck.historyGrade + studentForCheck.javaGrade + studentForCheck.maths)/3;
			if (averageGradeOfStudent < 3) {
				listOfStudents.remove(studentForCheck);
			}
		}
	}

	private static void printStudents(List<Student> students, int course) {

		for (Student studentForCheck : students) {
			if (studentForCheck.course == course) {
				System.out.println(studentForCheck.name);
			}
		}
	}
}
