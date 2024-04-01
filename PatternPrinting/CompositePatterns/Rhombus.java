package PatternPrinting.CompositePatterns;
import java.util.*;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <= n - i; j++){
//				System.out.print(" " + " ");
//			}
//			for(int j = n-i+1; j <= n; j++){
//				System.out.print("*" + " ");
//			}
//			for(int j = 1; j <= n - i; j++){
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <=n; i++){
			for(int j = 1; j <= n- i; j++){
				System.out.print(" " + " ");
			}
			for(int j = 1; j <= n; j++){
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}

}

/*
  	  * * * * 
    * * * * 
  * * * * 
* * * *
*/
