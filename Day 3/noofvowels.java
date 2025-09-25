package today;
import java.util.Scanner;

public class noofvowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("ENTER A STRING:");
		String a =sc. nextLine();
		int count = 0;
		for(int i=0;i<a.length();i++){
			char ch = Character.toLowerCase(a.charAt(i));
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch =='o'|| ch =='u'){
				count++;
			}
			System.out.println("No of vowels:"+ count);
		}
		

	}

}
