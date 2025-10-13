package javafullproject;
import java.util.ArrayList;
import java.util.Collections;
public class fruits {

	public static void main(String[] args) {
		ArrayList<String>fruits = new ArrayList <String>();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("mango");
		System.out.println("First element:"+fruits.get(0));
		System.out.println("Second element:"+fruits.get(1));
		System.out.println("Third element:"+fruits.get(2));
		Collections.sort(fruits);
		System.out.println("Sorted list:"+fruits);
		Collections.reverse(fruits);
		System.out.println("Reversed list :"+fruits);
	}

}
