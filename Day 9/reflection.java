package javafullproject;
class student{
	String name;
	int age;
	void show(){
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

public class reflection {

	public static void main(String[] args) {
		Student s1=new Student ();
		class a = s1.getclass();
		System.out.println("Class name:"+a.getName());
		System.out.println("\n Fields inside the object:");
		Field fields []= a.getDeclaredFields();
		for(field f : fields)
		{
			System.out.println("f.getName()+"+" f.getType().getSimpleName()")	;
		}
		System.out.println("\nMethods[] inside the objects:");
		Method methods[]= a.getDeclaredMethods();
		for(Method m : methods)
		{
			System.out.println("m.getName()");
		}
	}

}
