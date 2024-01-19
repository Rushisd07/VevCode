
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=153; 
     int temp=n;
     int sum=0,rem;
      while(n>0) {
      rem=n%10;      
      sum=sum+rem*rem*rem;
      n=n/10; 
      System.out.println(sum); 
      }     
	if(temp==sum) {
		System.out.println("Armstrong");
	}
	else {
		System.out.println("Not Armstrong");
	}
	}
}
