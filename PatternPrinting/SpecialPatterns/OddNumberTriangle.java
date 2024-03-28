package PatternPrinting.SpecialPatterns;
import java.util.Scanner;

public class OddNumberTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int m = sc.nextInt();
		
//		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <= i; j++){
//				int p = 1;
//				System.out.print(p+2*(j-1) + " ");
//			} 
//			System.out.println();
//		}
		
//		for(int i = 1; i <= n; i++){
//			for(int j = 1; j <=i ; j++){
//				System.out.print((2*j-1) + " ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i <=n ; i++){
//			for(int j = 1; j <= 2*i-1; j+=2){
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <=n ; i++){
			int p = 1;
			for(int j = 1; j <=i; j++){
				System.out.print(p + " ");
				p+=2;
			}
			System.out.println();
		}
		
	}

}


/*
 1
 13
 135
 1357
*/
