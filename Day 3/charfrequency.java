package today;

public class charfrequency {

	public static void main(String[] args) {
		String word = "banana";
		char ch = 'a';
		int count = 0;
		for (int i =0 ; i<word.length();i++){
		if ( word.charAt(i)==ch);
			count ++;
	}
System.out.println("Frequency of " + ch+"="+count);

	
	}
}
