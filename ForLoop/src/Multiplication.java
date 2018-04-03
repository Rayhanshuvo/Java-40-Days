import java.util.Scanner;

//Write a program in C to display the multiplication table of a given integer
/*Input the number (Table to be calculated) : 15 
Expected Output : 
15 X 1 = 15 
...
... 
15 X 10 = 150*/
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int takenValue = sc.nextInt();
		for (int i = 1; i <= 10; i++) {

			System.out.println(takenValue + "*" + i + "=" + takenValue * i);

		}
		sc.close();

	}
}