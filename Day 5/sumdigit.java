
public class sumdigit {

	public static void main(String[] args) {
		int n=345;
		int sum=0;
		int a;
		while(n!=0)
		{
			a=n%10;
			sum+=a;
			n/=10;
		}
		System.out.println("sum:="+sum);
		

	}

}
