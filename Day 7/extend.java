interface vehicle{
	void start();
}
interface car extends vehicle{
	void moving();
}
class bmw implements car{
	public void start(){
		System.out.println("car started");
	}
	public void moving(){
		System.out.println("car moving");
	}
}
public class extend {

	public static void main(String[] args) {
		bmw car=new bmw();
		car.start();
		car.moving();
	}

}