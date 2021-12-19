package exam;

public class ExamQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "Hi All how is core java session going on";
		int count = 0;
		System.out.println(string.length());// 40
		int temp = string.replace(" ", "").length(); // to replace the spaces in this case there are 8 spaces

		// System.out.println(string.charAt(5));

		for (int i = 0; i < temp; i++) {

			count++;

		}
		System.out.println(count);
	}
}