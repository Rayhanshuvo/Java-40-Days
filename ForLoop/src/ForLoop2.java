import java.util.Scanner;

//Write a program in C to display n terms of natural number and their sum
//Test Data : 7 
//Expected Output : 
//The first 7 natural number is : 
//1 2 3 4 5 6 7 
//The Sum of Natural Number upto 7 terms : 28
public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= n; i++) {

			sum = sum + i;

		}

		System.out.println("Sum is:" + sum);

	}

}
