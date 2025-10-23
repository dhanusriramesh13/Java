package javafullproject;

import java.util.ArrayList;

public class add {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ram");
		list.add(25);
		list.add(99.5);
		for(Object ob: list)
		{
			String name = (String)ob;
			System.out.println(name);
		}
	}

}
