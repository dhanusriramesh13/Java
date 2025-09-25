package today;
import java.util.Scanner;
public class printchar {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string:");
		String str = s.nextLine();
		for(int i = 0;i<str.length();i++){
			System.out.println(str.charAt(i));
		s.close();
		}			

	}

}
