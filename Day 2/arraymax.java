
public class arraymax {

	public static void main(String[] args) {
		int arr[]={5,10,15,20};
		int max = arr[0];
		for (int num : arr){
			if(num>max)
			max=num;
		}
		System.out.println("Maximum=" + max);

	}

}
