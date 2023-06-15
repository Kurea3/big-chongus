package test1;
import java.util.Iterator;
import java.util.Scanner;

class classDirectory{
	private String studentNumber;
	private String name;
	private String birthDate;
	private String yearSection;
	
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getYearSection() {
		return yearSection;
	}
	public void setYearSection(String yearSection) {
		this.yearSection = yearSection;
	}
	
}

public class delta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		classDirectory dir = new classDirectory();
		
		int menu;
		
		System.out.println("Class Directory 2.0");
		System.out.println("Option:");
		System.out.println("1.Enter raw data");
		System.out.println("2.Exit");
		menu = input.nextInt();
		input.nextLine();
		
		switch (menu) {
		case 1:
			System.out.println("enter full name in this format: Last, First M.I.");
			dir.setName(input.nextLine());
			System.out.println("enter student number:");
			dir.setStudentNumber(input.nextLine());
			System.out.println("enter birthdate in this format: MM/DD/YYYY");
			dir.setBirthDate(input.nextLine());
			System.out.println("enter year and section:");
			dir.setYearSection(input.nextLine());
			break;
		case 2:
			System.out.println("Student Details:");
			System.out.println("Name: " + dir.getName());
			System.out.println("Student number: " + dir.getStudentNumber());
			System.out.println("Birthdate: " + dir.getBirthDate());
			System.out.println("Year and Section: " + dir.getYearSection());
			break;
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("Class Directory 2.0");
			System.out.println("Option:");
			System.out.println("1.Enter raw data");
			System.out.println("2.Exit");
			menu = input.nextInt();
		}
	}

}
