

class Student{
	static int id;
	static String name;
	static void display(){
		System.out.println("ID"+id);
		System.out.println("name"+name);
	}
}
public class ECE {

	public static void main(String[] args) {
		Student.id=101;
		Student.name="Dhanusri";
		Student.display();

	}

}
