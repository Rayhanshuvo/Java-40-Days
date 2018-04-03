import java.util.Scanner;

public class SwapWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		int numb2 = sc.nextInt();

		numb1 = numb1 - numb2;
		numb2 = numb1 + numb2;
		numb1 = numb2 - numb1;

	}

}
