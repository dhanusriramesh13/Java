
package javafullproject;
import java.util.ArrayList;
import java.util.Collections;

public class commonele {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList <Integer> b = new ArrayList<Integer>();
		b.add(4);
		b.add(2);
		b.add(5);
		a.retainAll(b);
		System.out.println(a);
		
		
	}

}
