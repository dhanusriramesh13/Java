package javafullproject;
import java.io.*;
@FunctionalInterface
interface contract
{
	public void rule1(int a,int b);
	
}
 class func
 {

	public static void main(String[] args) 
	{
		contract ci=(a,b)->{System.out.println(a+b);};
		ci.rule1(2,4);
	}
 }


