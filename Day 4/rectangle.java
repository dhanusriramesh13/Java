class recdemo
{int length,breadth;
void getdetails (int x,int y){
	length=x;
	breadth=y;
}
int area()
{
	int a = length*breadth;
	return a;
}
}
public class rectangle {
 public static void main(String[] args) {
		recdemo o1 = new recdemo();
		o1.getdetails(10,20);
		System.out.println("Area of rectangle=" + o1.area());
	}

}
