
public class primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int flag;
		int n = 11;
		for (i = 2; i <= n; i++) {
			flag = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(i+"Prime");

			}
			else {
				System.out.println(i+"Not prime");
			}

		}

	}
}
