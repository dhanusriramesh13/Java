package javafullproject;
import java.util.ArrayList;
import java.util.Collections;
public class add1 {

	public static void main(String[] args) {
		ArrayList <Integer> alist = new ArrayList <Integer>();
		alist.add(1);
		alist.add(2);
		alist.add(5);
		alist.add(3);
		alist.add(4);
		Collections.sort(alist);
		System.out.println(alist);
	}

}

