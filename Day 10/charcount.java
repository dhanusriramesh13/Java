package javafullproject;
import java.util.Scanner;
public class charcount {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();

		        // Remove spaces before counting
		        String noSpaces = input.replace(" ", "");
		        System.out.println(noSpaces.length());
		    }
		

	}


