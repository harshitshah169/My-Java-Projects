import java.util.Scanner;

public class StudentDatabase {
	public void add(int id, String firstname, String lastname,String course) {
		System.out.println(id+" "+firstname+" "+" "+lastname+" "+course);
	}
 public static void main(String args[]) {
	 System.out.println("Enter number of students to be added: ");
	 StudentDatabase sd = new StudentDatabase();
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 System.out.println("Enter data in the format(id fullName course): ");
	 int id[] = new int[n];
	 String firstname[] = new String[n];
	 String lastname[] = new String[n];
	 String course[] = new String[n];
	 
	 //Storing input data as an array
	 for(int i=0;i<n;i++) {
		 id[i] = sc.nextInt();
		 firstname[i] = sc.next();
		 lastname[i] = sc.next();
		 course[i] = sc.next();
		}
	
	 //Printing the entire database using function
	 System.out.println("Database Updated");
	 for(int j=0;j<n;j++) {
		 sd.add(id[j], firstname[j], lastname[j], course[j]);
		
	 }
	 
 }
}
