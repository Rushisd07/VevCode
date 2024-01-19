import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int fib = 0;
		int fib1 = 1;
		int fib2 = 0;
		int count=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt(); 
		System.out.println("Series:"); 
		System.out.println(+fib+"\n"+fib1);

		//for (int i = 2; i < n; i++) {
		while(n-2>count) {
			fib2 = fib + fib1;
			System.out.println(fib2);
			fib = fib1;
			fib1 = fib2;
			count++;
		}

	}

}
