class methodoperation
{
	static int multiply (int a ,int b)
	{
		return a*b;
	}
	static double multiply (double x , double y)
	{
		return x*y;
	}
	static int multiply(int r)
	{
		return r*r;
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		System.out.println("\nMulti of 2 integers ="+methodoperation.multiply(25,10));
		System.out.println("\nMulti of 2 float values ="+methodoperation.multiply(12.4,4.5));
		System.out.println("\nMulti of same integer value ="+methodoperation.multiply(2));
		
		
	}

}
