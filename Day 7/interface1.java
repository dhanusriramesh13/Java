import java .io.*;
import java.util.*;
interface BOB
{
	void bobinterest();
}
interface ICICI
{
	void iciciinterest();
}
class Person1 implements BOB , ICICI 
{
	public void bobinterest()
	{
		System.out.println("the bob interest amount is"+(1000*0.07));
	}
	public void iciciinterest()
	{
		System.out.println("the icici interest amount is"+(1000*0.08));
	}
}
public class interface1 {

	public static void main(String[] args) {
		Person1 a = new Person1();
		a.bobinterest();
		a.iciciinterest();
		
	}

}
