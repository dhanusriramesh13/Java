package javafullproject;

class ECE {
	public void finalize()
	{
		System.out.println("Finalize method called before object is destroyed ");
	}

	public static void main(String[] args) {
		ECE object = new ECE();
		object = null;
		System.gc();
		System.out.println("Main method execution:");
	}

}
