package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = { 1, 2, 3, 4, 5 };
		int[] secondArray = { 6, 7, 8, 9, 10 };

		// For each
		for (int arr1 : firstArray) {

			System.out.println(arr1);
		}

		Arrays.sort(firstArray);
		Arrays.sort(secondArray);

		// convertArray to array List
		ArrayList<int[]> arrayList1 = new ArrayList<int[]>(Arrays.asList(firstArray));
		ArrayList<int[]> arrayList2 = new ArrayList<int[]>(Arrays.asList(secondArray));

	}

}
