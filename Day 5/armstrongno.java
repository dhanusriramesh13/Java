
public class armstrongno {

	public static void main(String[] args) {
		int n=153;
		int arm=0;
		int temp=n;
		while(n!=0)
		{
			int a =n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(temp==arm)
		{
			System.out.println("Armstrong no");
		}
		else
		{
			System.out.println(" Not an Armstrong no");
			
			
		}

	}

}
