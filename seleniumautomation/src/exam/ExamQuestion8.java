package exam;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExamQuestion8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to generate timestamp from date
		Date date = new Date();
		System.out.println(date);
		
		//convert the default date to your date format
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		
		String timeStamp = df.format(date);
		System.out.println(timeStamp);

	}

}
