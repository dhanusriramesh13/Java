package javafullproject;
import java.util.Scanner;
public class countgreatele {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);

		        int N = sc.nextInt();
		        int[] Arr = new int[N];
		        for (int i = 0; i < N; i++) {
		            Arr[i] = sc.nextInt();
		        }

		        int count = 1; // First element is always counted
		        int maxSoFar = Arr[0];

		        for (int i = 1; i < N; i++) {
		            if (Arr[i] > maxSoFar) {
		                count++;
		                maxSoFar = Arr[i];
		            }
		        }

		        System.out.println(count);
		    }

	}

}
