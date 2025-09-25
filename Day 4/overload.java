class box
{
	float length,breadth;
	box()
	{
		length=2;
		breadth=5;
	}
	box(float x,float y)
	{
		length=x;
		breadth=y;
	}
	box (float x)
	{
		length=breadth=x;
	}
	float area()
	{
		return length * breadth;
	}
}
public class overload {

	public static void main(String[] args) {
		box o = new box();
		System.out.println("Area ="+o.area());
		box o1 = new box(3,6);
		System.out.println("Area ="+o1.area());
		box o2 = new box(3);
		System.out.println("Area ="+o2.area());

	}

}
