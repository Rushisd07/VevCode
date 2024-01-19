
import java.util.*;

public class ArrayMaxNo {

	public static void main(String[] args) {
		int i;
		int j = 0;
		int temp = 0;
		int max = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		for (i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("maximum number:" + max);
		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.print(a[i] + " ");
		}
		//System.out.println("Range of i:"+i);
		
		System.out.println("Second Max Number  :" + a[i - 2]);
		
		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.println("Array element is:" + a[i]);
		}

	}
}