package PatternPrinting.CompositePatterns;
import java.util.*;

public class StarDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i; j++){
				System.out.print(" " + " ");
			}
			for(int k = 1; k <= 2*i - 1; k++){
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
		
		for(int i = 1; i <= n-1 ; i++){
			for(int j = 1; j <= i ; j++){
				System.out.print(" " + " ");
			}
			for(int k = 2*n - 1 - 2*i; k >=1; k--){
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
//		int nsp = n -1;
//		int nst = 1;
//		
//		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <= nsp; j++){
//				System.out.print(" " + " ");
//			}
//			nsp--;
//			for(int k = 1; k <= nst; k++){
//				System.out.print("*" + " ");
//			}
//			nst+=2;
//			System.out.println();
//		}
//		nst-=4;
//		nsp+=2;
//		for(int i = 1; i <= n-1 ; i++){
//			for(int j = 1; j <= nsp ; j++){
//				System.out.print(" " + " ");
//			}
//			nsp++;
//			for(int k = nst; k >=1; k--){
//				System.out.print("*" + " ");
//			}
//			nst-=2;
//			System.out.println();
//		}
//		
		
	}

}
