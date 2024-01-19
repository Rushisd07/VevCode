
public class SwapTwoElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=12;
    int b=32;
    System.out.println("Before :"+a+" "+b );
    int sum=a+b;
    a=sum-a;
    b=sum-b;
    System.out.println("After :"+a+" "+b);
    int c;
    c=a;
    a=b;
    b=c;
    System.out.println("After:"+a+" "+b);
	}

}
