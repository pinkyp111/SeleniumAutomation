package exam;

import java.util.Arrays;

public class ExamQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strarray = { "Harish", "Ram", "SummitWork", "Sreenivas", "Selenium", "Automation" };
//{ram,sreenivas,summitwork,selenium,,harish,automation}
		System.out.println(strarray.length);
		System.out.println(Arrays.toString(strarray));

		for (int i = 0; i < strarray.length; i++) {
			for (int j = i + 1; j < strarray.length; j++) {
				if (strarray[i].compareTo(strarray[j]) > 0) {
					String temp = strarray[i];//
					strarray[i] = strarray[j];//
					strarray[j] = temp;//
				}
			}
		}
		System.out.println(Arrays.toString(strarray));
	}
}