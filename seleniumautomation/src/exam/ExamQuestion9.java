package exam;

import java.util.Scanner;

public class ExamQuestion9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// ATM Transaction
		int total_balance = 0;
		int withdrawal = 0;
		Scanner sc = new Scanner(System.in);
		// ALGORITHM
		// 1.Give user the menu options.
		// 2.for withdrawal always check user has enough balance in account.If yes
		// deduct the withdrawal amount from current balance,
		// if no display message to user that funds are insufficient and also show the
		// current balance.
		// 3.To deposit add money to current balance and display the new balance.
		// 4.exit.

		while (true) {
			// Show 4 options to user and wait for input.
			// Repeat this loop until user chooses exit.
			System.out.println("Hello,what do you want to do today? \n" + "Enter 1 for WITHDRAWAL\n"
					+ "Enter 2 for DEPOSIT\n" + "Enter 3 for current balance\n" + "Enter 4 to exit\n");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter WITHDRAWAL amount:\n");
				withdrawal = sc.nextInt();
				if (withdrawal > total_balance) {
					System.out.println("You do not have sufficient balance in your account! Total Balance ="
							+ total_balance + "\n");
				} else {
					total_balance -= withdrawal;
					System.out.printf("You have successfully withdrawn Rs " + withdrawal
							+ " from your account. Current Balance = Rs " + total_balance + "\n");
				}
				break;
			case 2:
				System.out.println("Enter DEPOSIT amount:\n");
				int deposit = sc.nextInt();
				total_balance += deposit;
				System.out.format("You have successfully deposited Rs " + deposit
						+ " to your account. Current Balance = Rs " + total_balance + "\n");
				break;
			case 3:
				System.out.println("Your current balance = Rs " + total_balance + "\n");
				break;
			case 4:
				System.out.println("Closing your transaction now. Have a great day!\n");
				System.exit(0);
			default:
				System.out.println("Invalid choice selected. Please enter 1,2,3,4\n");
				break;
			}
		}

	}
}
