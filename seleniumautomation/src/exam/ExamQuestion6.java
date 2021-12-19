package exam;

public class ExamQuestion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find odd/even in an array
		int a[] = { 15, 2, 5, 6, 3, 2, 15 };
		int array_length = a.length;
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0; i < array_length; i++) {
			if (a[i] % 2 == 0)
				even_count++;

			else
				odd_count++;
		}
		System.out.println("print the number of even numbers " + even_count);
		System.out.println("print the number of odd numbers " + odd_count);
	}
}