class grandfather
{
	void land()
	{
		System.out.println("5 acres of land");
	}
}
class father extends grandfather
{
	void house()
	{
		System.out.println("Have own 2bhk house");
	}
}
class son extends father
{
	void car()
	{
		System.out.println("Have own audi car");
	}
}
public class multilevel {

	public static void main(String[] args) {
		son o = new son();
		o.car();
		o.house();
		o.land();

	}

}
