package exam;

import java.util.Scanner;

public class ExamQuestion14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to check number is prime or not
		int num;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
		if (num == 0 || num == 1) {
			System.out.println("Neither prime nor composite");

		} else {
			for (int i = 2; i < num / 2; i++) // 5/1,5/2,5/3,
			{
				if (num % i == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(num + " is a prime number.");
			else
				System.out.println(num + " is not a prime number.");

		}
		sc.close();
	}
}