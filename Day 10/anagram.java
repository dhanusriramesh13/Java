package javafullproject;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
	String s1="listen";
	String s2 = "silent";
	char[] arr1= s1.to char Array();
	char[] arr2= s2.to char Array();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if(Arrays.equals(arr1,arr2)){
		System.out.println("The strings are anagram");
	}
	else{
		System.out.println("Not an anagram");
	}
	
	

	}

}
