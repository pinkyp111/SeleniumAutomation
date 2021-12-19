package exam;

public class ExamQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
		int arraylength = array.length;
		// TO sort numbers in an int array from lowest to highest
		for (int i = 0; i < arraylength; i++) {
			for (int j = i + 1; j < arraylength; j++) {
				if (array[i] > array[j])
				// if(array[i]<array[j])
				// to sort from highest to lowest
				{
					int temp = array[j];// 90 // temp=array[i];
					array[j] = array[i];// 109 //array[i]=array[j]
					array[i] = temp;// 90 //array[j]=temp;
				}
			}
			System.out.println(array[i]);
		}

	}
}
