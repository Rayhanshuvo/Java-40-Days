import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int takenNumber = sc.nextInt();
		int facttorialNumber = fact(takenNumber);
		System.out.println(facttorialNumber);
	}

	private static int fact(int takenNumber) {
		// TODO Auto-generated method stub

		int factNumn = 1;
		for (int i = 1; i <= takenNumber; i++) {

			factNumn = i * factNumn;

		}
		return factNumn;
	}

}