package array;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[2];
		int diffArr[] = { 1, 3, 4, 5 };
		int sum = 0;

		for (int i = 0; i < diffArr.length; i++) {

			sum = sum + diffArr[i];
		}

		System.out.println("Sum is:" + sum);

	}

}
