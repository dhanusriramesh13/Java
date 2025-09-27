import java.util.*;
public class traverse {

	public static void main(String[] args) {
		int arr[]= new int [100];
		int size;
		
		System.out.println(" enter size");
		Scanner s = new  Scanner (System.in);
		size = s.nextInt();
		System.out.println(" enter values");
		for(int i =0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Forward alternate elements:");
		
		for(int i =0;i<size;i=i+2)
		{
		System.out.println(arr[i]+"");
	}
		System.out.println("Backward alternate elements:");
		for(int i =size-1;i>=0;i=i-2)
		{
			System.out.println(arr[i]+"");
		}
		

}
}
