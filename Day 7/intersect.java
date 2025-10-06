public class intersect {

	public static void main(String[] args) {
		int a[]={1,1,3,4,5};
		int b[]={1,1};
		System.out.println("intersection of two arrays:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println(a[i]+" ");
					b[j]=-1;
					break;
				}
			}
		}

	}

}
