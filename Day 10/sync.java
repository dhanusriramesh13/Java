package javafullproject;
class Table
{
	synchronized void printTable(int n)
	{
		try
		{
			for(int i = 1 ; i<=5 ;i++)
			{
				Thread.sleep(1000);
				System.out.println(n*i);
			}
		}
		catch (InterruptedException e){}
	}
}
class sync {
	public static void main(String[] args) {
		Table t = new Table();
		Thread t1 = new Thread ()
				{
			public void run()
			{
				t.printTable(2);
			}
				
		Thread t2 = new Thread()
				{
			public void run()
			{
				t.printTable(3);
				}
		};
			t1.start();
			t2.start();
		
				}
	}
}

