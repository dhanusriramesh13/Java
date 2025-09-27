class user
{
	String name;
	int age;
	user (String n , int a)
	{
		this.name=n;
		this.age=a;
	}
	public void display()
	{
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		
	}
}
class mainprogrammer extends user
{
	String companyname;
	mainprogrammer(String n,int a,String c)
	{
		super(n,a);
		this.companyname=c;
	}
	public void display()
	{
		System.out.println("Nmae="+name);
		System.out.println("Age="+age);
		System.out.println("Company name="+companyname);
	}
}
public class methodoverriding {

	public static void main(String[] args) {
		mainprogrammer o = new mainprogrammer("Ram",22,"Technologies");
		o.display();
		
	}

}
