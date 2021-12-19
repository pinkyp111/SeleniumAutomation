package exam;

import java.util.Random;

public class ExamQuestion7 {

	public static void main(String[] args) {
		// Program for random phone number
		StringBuffer phone = new StringBuffer();
		Random rand = new Random();
		
		phone.append(rand.nextInt(7));
		phone.append(rand.nextInt(7));
		phone.append(rand.nextInt(7));
		
		phone.append(rand.nextInt(7));
		phone.append(rand.nextInt(4));
		phone.append(rand.nextInt(1));

		phone.append(rand.nextInt(9));
		phone.append(rand.nextInt(9));
		phone.append(rand.nextInt(9));
		phone.append(rand.nextInt(9));
		System.out.println("random phone number :" + " " + phone);

	}
}
