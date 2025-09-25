package today;
import java.util.Scanner;

public class noofconsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		int count=0;
		for(int i = 0;i<str.length();i++){
			char ch= Character.toLowerCase(str.charAt(i));
			if(ch>='a'&& ch<='z'&& ! (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')){
				count ++;
			}
		}
		System.out.println(" No.of consonants:" + count);
		
		
	}

}
