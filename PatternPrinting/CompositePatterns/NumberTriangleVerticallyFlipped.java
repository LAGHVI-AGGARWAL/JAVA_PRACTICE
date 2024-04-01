package PatternPrinting.CompositePatterns;
import java.util.*;
public class NumberTriangleVerticallyFlipped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i = 1; i <=n; i++){
//			for(int k = 1; k <= n -i; k++){
//				System.out.print(" " + " ");
//			}
//			int a = 1;
//			for(int j = n - i + 1; j <= n; j++){
//				System.out.print(a + " ");
//				a++;
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <=n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" " + " ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}

/*
 		  1
 	   12 
 	  123
 	 1234
 */

// composite patterns are the ones involving mixture of patterns 
// here we will use 2 loops inside one loop 

