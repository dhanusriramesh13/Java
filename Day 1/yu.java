package today;
import java.util.*;
public class yu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic,HRA,DA,gross;
		Scanner sc=new Scanner(System.in);
				basic=sc.nextDouble();
		HRA=basic*0.4;
		DA=basic*0.2;
		gross=basic+HRA+DA;
		System.out.println("gross+"+gross);
sc.close();
	}

}
