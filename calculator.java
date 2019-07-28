import java.util.Scanner;

public class calculator {
	public void calc(int a,int b, int opr) {
	int result=0;
	switch(opr) {
	case 1:
		result = a+b;
		System.out.print("Addition is "+result);
		break;
	case 2:
		result = a > b? a-b : b-a;
		System.out.print("Subtrction is "+result);
		break;
	case 3:
		result = a*b;
		System.out.print("Multiplication is "+result);
		break;
	case 4:
		result = a/b;
		System.out.print("Division is "+result);
		break;
		
	default:
		System.out.println("Invalid choice");
		break;
	}
		
	}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter First number: ");
	 int a= sc.nextInt();
	 
	 System.out.println("Enter Second number: ");
	 int b= sc.nextInt();
	 
	 System.out.println("Enter Operation to be performed: ");
	 System.out.println("Enter 1 for Addition ");
	 System.out.println("Enter 2 for Subtrction ");
	 System.out.println("Enter 3 for Multiplication ");
	 System.out.println("Enter 4 for Division ");
	 
	 int opr= sc.nextInt();
	 
	 calculator c = new calculator();
	 c.calc(a, b, opr);
 }
}
