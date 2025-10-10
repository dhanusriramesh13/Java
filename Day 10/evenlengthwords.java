package javafullproject;
import java.util.Scanner;
public class evenlengthwords {

	public static void main(String args[]) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        String s = sc.nextLine();

		       
		        String[] words = s.split("\\s+");
		        for (String word : words) {
		            if (word.length() % 2 == 0) {
		                System.out.println(word);
		            }
		        }
		    }
		
	}

