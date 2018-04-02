
//1
//23
//456
//78910
//1112131415

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 1;
		for (int i = 0; i <= 4; i++) {
			// System.out.println("i=" + i);

			for (int j = 0; j <= i; j++) {

				System.out.print(k++);

			}
			System.out.print("\n");
		}

	}

}
