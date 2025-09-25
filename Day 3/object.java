package today;
class student{
	int id;
	String name;
	void display(){
		System.out.println("id"+id);
		System.out.println("name"+name);
	}
}

public class object {

	public static void main(String[] args) {
		student ram = new student();
		ram.id=101;
		ram.name="RAM KUMAR";
		ram.display();
	}

}
