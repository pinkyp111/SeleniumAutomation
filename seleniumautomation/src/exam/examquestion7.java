package exam;

import java.util.Random;

public class examquestion7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		StringBuffer phone = new StringBuffer();
		Random rand = new Random();
		for ( i = 0; i < 3; i++) {
			if (i < 3) {
				int first_set = rand.nextInt(7);
				if (first_set == 0) {
					first_set = 1;
				}
				System.out.println("Print first set of random numbers :" + i);
				phone.append(first_set);
				
			}

		}
		System.out.println("the first part of random phone number :"+" "+phone);
		
	
}
}
