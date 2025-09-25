class bank
{
	void displaybankname()
	{
		System.out.println(" Welcome to SBI");
	}
}
class savingaccount extends bank
{
	void savingfeatures()
	{
		System.out.println("daily transaction allowed");
	}
}
class currentaccount extends bank
{
	void currentfeatures()
	{
		System.out.println("low interest rate");
	}
}
 public class hierarchial {
	public static void main(String[] args) {
		savingaccount s = new savingaccount();
		s.displaybankname();
		s.savingfeatures();
		currentaccount c = new currentaccount();
		c.displaybankname();
		c.currentfeatures();
	}

}
