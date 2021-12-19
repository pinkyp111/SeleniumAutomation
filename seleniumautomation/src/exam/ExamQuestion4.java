package exam;

public class ExamQuestion4 {

	public static void main(String[] args) {
		// to reverse a string
		String str = "Hi  pinky", nstr = "";
		char ch;

		System.out.print("Original word: ");
		System.out.println("Hi pinky"); // Example word

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i); // extracts each character
			nstr = ch + nstr; // adds each character in front of the existing string
		}
		System.out.println("Reversed word: " + nstr);
	}

}
