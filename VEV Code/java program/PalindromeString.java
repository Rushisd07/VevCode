
public class PalindromeString {

	public static void main(String[] args) {
		String a = "madam";
		String temp = a;
		String str = "";
		int n = temp.length();
		for (int i = n - 1; i >= 0; i--) {
			str = str + temp.charAt(i);
		}
		if (a == str) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		if (a.equals(str)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		System.out.println(str);
	}
}
