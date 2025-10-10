
package javafullproject;
import java.util.Scanner;

public class starhash {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String S = sc.nextLine();

	        int starCount = 0;
	        int hashCount = 0;

	        // Count the number of '*' and '#'
	        for (int i = 0; i < S.length(); i++) {
	            if (S.charAt(i) == '*') {
	                starCount++;
	            } else if (S.charAt(i) == '#') {
	                hashCount++;
	            }
	        }

	        // Print the difference (* - #)
	        System.out.println(starCount - hashCount);
	    }
	}

	