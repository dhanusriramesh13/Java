class person
{
	private int minimumbalance = 2500;
	public int getminimumbalance()
	{
		return minimumbalance;
	}
}
public class getter {

	public static void main(String[] args) {
		person bb = new person();
		int min = bb.getminimumbalance();
		System.out.println(min);

	}

}
