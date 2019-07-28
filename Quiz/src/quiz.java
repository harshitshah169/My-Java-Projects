import java.text.DecimalFormat;
import java.util.*;

public class quiz {
	
	
		static int count =0;
		static Scanner sc= new Scanner(System.in);
		public void question(int no) {
			if(no ==1) {
				System.out.println("where do you live?");
				System.out.println("1) india");
				System.out.println("2) america");
				int ans = sc.nextInt();
				if(ans==1) {
					System.out.println("correct");
					count++;
				}
				else {
					System.out.println("incorrect");
				}
			}
				else if(no ==2) {
					System.out.println("who is the prime minister of india?");
					System.out.println("1) rahul gandhi");
					System.out.println("2) narendra modi");
					int ans = sc.nextInt();
					if(ans==2) {
						System.out.println("correct");
						count++;
					}
					else {
						System.out.println("incorrect");
					}
			}
				else if(no ==3) {
					System.out.println("how many states are there in india?");
					System.out.println("1) 28");
					System.out.println("2) 29");
					int ans = sc.nextInt();
					if(ans==2) {
						System.out.println("correct");
						count++;
					}
					else {
						System.out.println("incorrect");
					}
			}
				else if(no ==4) {
					System.out.println("who won icc cricket world cup in 2015?");
					System.out.println("1) india");
					System.out.println("2) australia");
					int ans = sc.nextInt();
					if(ans==2) {
						System.out.println("correct");
						count++;
					}
					else {
						System.out.println("incorrect");
					}
			}
				else if(no ==0) {
					System.out.println("capital of india?");
					System.out.println("1) delhi");
					System.out.println("2) mumbai");
					int ans = sc.nextInt();
					if(ans==1) {
						System.out.println("correct");
						count++;
					}
					else {
						System.out.println("incorrect");
					}
			}
		}
		public static void main(String[] args) {
			System.out.println("Type start");
			quiz tp = new quiz();
			String s = sc.next();
			if(s.equals("start")) {
			for(int i=1;i<3;i++) {
				Random rand = new Random();
				int value = rand.nextInt(9);
				tp.question(value/2);
				}	
				System.out.println("Your score is: "+count);
				
			  }
	}
	}






