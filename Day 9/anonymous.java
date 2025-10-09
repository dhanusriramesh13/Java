package javafullproject;
class cycle
{
	public void display()
	{
		System.out.println("I am a cycle");
	}
}
class tricycle extends cycle
{
	public void display()
	{
		System.out.println(" I am a tricycle ")	;
	}
	class anonymous
	{
		public  void main(String[]args)
		{
			cycle c = new cycle()
					{
				public void display()
				{
					System.out.println("I am a tricycle");
				}
		
					};
			c.display();
	}
}
}