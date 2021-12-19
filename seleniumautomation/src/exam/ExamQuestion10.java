package exam;

import java.util.Scanner;

public class ExamQuestion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if (age > 0 && age <= 2) {
			System.out.println("Infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("Child");
		} else if (age > 12 && age <= 25) {
			System.out.println("Younger");
		} else if (age > 25 && age <= 59) {
			System.out.println("Adult");
		} else if (age > 59 && age <= 100) {
			System.out.println("Sr.Citizen");
		}
		sc.close();
	}
}
