package assignmentsWeek1;
public class PrimeNumber {
	public static void main(String[] args) {
		int n = 9;
		for (int i = 2; i <n; i++) {
			if (n%i==0) {
				System.out.println(n + " Is not a prime number");
				return;
			}
		}
		System.out.println(n + " is a prime number");
	}
}
