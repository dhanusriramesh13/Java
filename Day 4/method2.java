import java.util.Scanner;
class java {
	public void sub(int x,int y)
	{
		System.out.println("Subtraction="+(x-y));
	}
}
class method2
{
public static void main(String[] args) {
	java o= new java();
	Scanner s= new Scanner(System.in);
	System.out.println("enter a");
	System.out.println("enter b");
	int a=s.nextInt();
	int b=s.nextInt();
	o.sub(a,b);
	}
}