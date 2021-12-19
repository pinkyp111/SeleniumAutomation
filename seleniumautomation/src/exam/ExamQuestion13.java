package exam;

import java.util.Scanner;

public class ExamQuestion13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// multiplication table
		int number;
		int limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		System.out.println("Enter the limit");
		limit = sc.nextInt();
		for (int i = 1; i <= limit; i++) {
			System.out.println(+i + "*" + number + "=" + i * number);
		}
		sc.close();
	}
}