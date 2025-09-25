class setter {
	private int minimumBalance = 2500;
		public void setminimumBalance (int value)
		{
			this.minimumBalance=value;
			System.out.println(minimumBalance);
		}
	}
	public class Accountholder
	{
	public static void main(String[] args) {
		setter bb = new setter();
		bb.setminimumBalance(10000);
	}
		

	}


  