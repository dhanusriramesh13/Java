import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("1.coffee:15");
			System.out.println(" 2.tea :10");
			System.out.println("3.cold coffee:25");
			System.out.println("4.milkshake:50");
			System.out.println("Enter your choice:");
			int choice= sc.nextInt();
			int price=0;
			String item = "";
			switch (choice){
			case 1 :
			item="coffee";
			price=15;
			break;
			case 2:
			item="tea";
			price=10;
			break;
			case 3:
				item="cold coffee";
				price=25;
				break;
			case 4:
				item="milkshake";
				price=50;
				break;
				
			default:
				System.out.println("invalid");
				return;
			}
			System.out.println("Enter quantity:");
			int quantity=sc.nextInt();
			int total= price*quantity;
			System.out.println("total amount:"+total);		
			
			}
	}
	
