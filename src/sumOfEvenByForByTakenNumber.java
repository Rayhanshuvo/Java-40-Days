
/*Enter number:
7
Even number is:2
Even number is:4
Even number is:6
Sum12
*/

import java.util.Scanner;

public class sumOfEvenByForByTakenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int takenInputVal = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= takenInputVal; i++) {

			if (i % 2 == 0) {
				sum = sum + i;

				System.out.println("Even number is:" + i);

			}

		}

		System.out.println("Sum" + sum);
	}

}
