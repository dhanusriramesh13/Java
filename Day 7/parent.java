abstract class parent
{
	abstract void repay();
	void getloan()
	{
	System.out.println("Getting loan");
	}
}
class child extends parent
{
	void repay()
	{
		System.out.println("I will pay on behalf of my father");
	}
}
 class parent{
	public static void main(String[] args) {
		child c=new child();
		c.getloan();
		c.repay();
	
	}

}
