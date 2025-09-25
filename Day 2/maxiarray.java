package today;
import java.util.Scanner;
public class maxiarray {
	public static void main(String[]args){
		int arr[]={12,7,5,20,30};
		int count=arr[0];
		int even=0,odd=0;
		for(int num:arr[]){
			if(num%2==0)
				even++;
			else{
				odd++;
		}
		System.out.println("even count="+even);
		System.out.println("odd count="+odd);
	}

}
}