package assignmentsWeek1;

public class FibonocciSeries {

	public static void main(String[] args) {
		int n = 8;
		int a = 0;
		int b = 1;

		System.out.print("Fibonacci Series up to " + n + " numbers: ");

		for (int i = 0; i < n; i++) {//0,1,2,3,4,5,6,7
			
			System.out.print(a + " ");//0,1,1,2,3,5,8,13
			
			int next = a + b; //1,2,3,5,8,13,21,34,
			a = b; //a=1,1,2,3,5,8,13,21
			b = next; //b=1,2,3,5,8,13,21,34
		}

	}

}
