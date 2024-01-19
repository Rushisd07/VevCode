
public class PrimeNo {

	public static void main(String[] args) {
		int flag = 0;
		int n=6;
		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag==1) {
			System.out.println("Prime is not Prime");
		} else {
			System.out.println("Number is Prime");

		}

	}
}
