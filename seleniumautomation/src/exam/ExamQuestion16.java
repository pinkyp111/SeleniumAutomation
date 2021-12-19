package exam;

public class ExamQuestion16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers using forEach() method.
		int[] intary = { 1,2,3,4,5,6,7,8,9,10};
	      
	      foreachDisplay(intary);

	}
	public static void foreachDisplay(int[] data) {
	      System.out.println("Display numbers from 1 to 10 using for each loop");
	      for (int a  : data) {
	         System.out.print(a+"\n");
	      }

}
}