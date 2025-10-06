abstract class members {
	abstract void welcomemsg();
	void display()
	{
		System.out.println("welcome all");
	}
	}
class stud extends members
{
	void welcomemsg()
	{
		System.out.println("hello teacher");
	}
	}
class classmembers {
	public static void main(String[] args) {
		stud s1 = new stud();
		s1.display();
		s1.welcomemsg();
	}
}
