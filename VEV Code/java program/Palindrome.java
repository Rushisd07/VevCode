
public class Palindrome {

	public static void main(String[] args) {
		int n = 34443, rem;
		int pal = 0;
		int m = n;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			pal = pal * 10 + rem;
		}
		if (m == pal) {
			System.out.println("Number is palindrome:" + pal);
		} else {
			System.out.println("Number is not palindrome:" + pal);
		}

	}

}
