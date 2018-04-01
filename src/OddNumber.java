import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sum = 0;

		int takenValueFromInput = sc.nextInt();
		for (int i = 1; i <= takenValueFromInput; i++) {

			if (i % 2 != 0) {

				sum = sum + i;
				System.out.println(i);

			}

		}

		System.out.println("Sum is:" + sum);

	}

}
