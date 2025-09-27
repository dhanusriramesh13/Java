import java.util.*;
public class leftshift {

	public static void main(String[] args) {
		int temp;
		int a[]=new int[];
		int i;
		System.out.println("Enter size");
		Scanner s = new Scanner (System.in);
		i=s.nextInt();
		System.out.println("Enter value");
		for( i = 0;i<a.length;i++)
		temp=a[0];
		while(i<a.length-1)
		{
			a[i]=a[i+1];
					i++;
		}
		
		System.out.println(" shifted array:"+a[i]);
	}

}
