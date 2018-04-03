import java.util.Scanner;

public class SwapWithThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numb1 = sc.nextInt();
		int numb2 = sc.nextInt();
		System.out.println("Before:" + "N1=" + numb1 + "N2=" + numb2);
		int temp;
		temp = numb1;
		numb1 = numb2;
		numb2 = temp;
		System.out.println("After:" + "N1=" + numb1 + "N2=" + numb2);

	}

}
