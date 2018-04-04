package array;

public class FindUniqueElement {

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 4, 2 };

		boolean isDistinct = false;

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					isDistinct = true;
					System.out.println(array[i]);
					System.out.println(isDistinct);

					while (isDistinct) {

						break;
					}

					continue;

				}

			}

			if (!isDistinct) {

				System.out.println("NOT DISTINCT" + array[i]);

			}

		}

	}

}
