package array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[3];
		arr[0] = 2;
		arr[1] = 3;
		arr[2] = 4;

		int[] secondArr = new int[3];
		// System.out.println(secondArr[0]);

		for (int i = 0; i < arr.length; i++) {

			secondArr[i] = arr[i];

		}

		for (int j = 0; j < secondArr.length; j++) {
			System.out.println(secondArr[j]);

		}

	}
}
