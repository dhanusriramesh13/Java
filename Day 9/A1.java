package javafullproject;
class Box extends Thread
{
	public void run()
	{
		try {
			for (int i = 1 ; i<+5 ; i++)
			{
				Thread.sleep(2000);
				System.out.println("Update database");
			}
		}
		catch (InterruptedException e){}
	}
}
class Box1 extends Thread
{
	public void run()
	{
		try{
			for(int i = 1;i<=5;i++)
			{
				Thread.sleep(2000);
				System.out.println(i);
			}
		}
		catch (InterruptedException e){}
		
	}
}
public class A1 {

	public static void main(String[] args) throws InterruptedException
		{
			Box b = new Box();
			b.start();
			Box1 b1 = new Box1();
			b1.start();
			b.join();
			b1.join();
			System.out.println("I am working by main thread");
			
		}

	}


