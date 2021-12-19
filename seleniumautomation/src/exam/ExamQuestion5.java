package exam;

public class ExamQuestion5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find duplicate number in an array
		int a[] = new int[] { 101, 222, 222, 38, 102, 7, 8, 3, 3 };
		int length = a.length;
		int count = 0;
		int temp = 0;
		System.out.println("Array length" + " " + length);
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (a[i] == a[j]) {
					temp = a[i];
					count++;
					System.out.println("The number duplicated is " + temp + " and the count is " + count);
				}

			}
		}

	}
}
