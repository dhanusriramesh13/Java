class Father
{
	void house()
	{
		System.out.println("Have own 2bhk house");
	}
}
class son extends Father
{
	void car()
	{
		System.out.println("Have own audi car");
	}
}
class singleinheritance {
 public static void main(String[] args) {
	 son o =new son();
	 o.car();
	 o.house();
		
	}

}
