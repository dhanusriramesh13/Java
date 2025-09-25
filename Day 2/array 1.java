package today;
import java.util.Scanner;
public class arrayprint {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 numbers:");
		for( int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
       System.out.println("you entered:");
       for(int num:arr)
         {
	System.out.print(num+" ");  
		}

	}

} 