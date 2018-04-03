
//Write a program in C to read 10 numbers from keyboard and find their sum and average
//Test Data :
//Input the 10 numbers : 
//Expected Output : 
//The sum of 10 no is : 55 
//The Average is : 5.500000
public class ForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;

		}

		float average = sum / 10;
		System.out.println(average);
		System.out.println(sum);

	}

}
