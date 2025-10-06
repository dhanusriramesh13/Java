class vehicles
{
	final void run()
	{
		System.out.println("Vehicle is running");
	}
}
class bike extends vehicles
{
	void run ()
	{
		System.out.println("Bike is running");
	}
}
class finalmethod1
{
	public static void main(String args[])
	{
		bike obj = new bike();
		obj.run();
	}
}
