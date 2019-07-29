import java.util.*;
public class CoinToss {
  public static void main(String args[]) {
	  Random rand = new Random();
	  int toss = rand.nextInt(2); 
	  String result = toss==0?"Head":"Tail";
	System.out.print(result);
 }
}
