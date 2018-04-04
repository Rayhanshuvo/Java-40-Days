package array;

public class FindDuplicateEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] findDuplicatedata = { 1, 2, 3, 4, 455, 2, 5, 7, 9, 2 };

		for (int i = 0; i < findDuplicatedata.length; i++) {

			for (int j = i + 1; j < findDuplicatedata.length; j++) {

				if ((findDuplicatedata[i] == findDuplicatedata[j]) && (i != j)) {

					System.out.println("Duplicate data found:" + findDuplicatedata[j]);

				}

			}

		}

	}

}
