package javafullproject;

import java.util.Arrays;
import java.util.stream.IntStream;

public class stream {

	public static void main(String[] args) {
		int arr[]={10,5,7,3,6};
		IntStream s = Arrays.stream(arr);
		s=s.sorted();
		s.forEach(System.out.println:: println);

	}

}
