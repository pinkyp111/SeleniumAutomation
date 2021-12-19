package exam;

public class ExamQuestion11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Print the numbers");
		for (i = 1; i <= 31; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("number: " + i + " is divisible by 5 and 3");
			} else if (i % 3 == 0) {
				System.out.println("number: " + i + " number is divisible by 3");
			} else if (i % 5 == 0) {
				System.out.println("number: " + i + " is divisible by 5");
			}
		}
	}
}