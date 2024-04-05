package PatternPrinting.CompositePatterns;
import java.util.*;
public class NumberBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		for(int i = 1; i<=2*n-1; i++){
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for(int i = 1; i <=n-1; i++){
//			for(int j = 1; j <= n - i; j++){
//				System.out.print(j + " ");
//			}
//			for(int j = 1; j <= 2*i - 1; j++){
//				System.out.print(" " + " ");
//			}
//			for(int j = n + i; j<= 2*n-1; j++){
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
		
		for(int  i = 1; i <= 2*n- 1; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 1; i <= n - 1; i++){
			int a = 1;
			for(int j = n - i; j >=1; j--){
				System.out.print(a + " ");
				a++;
			}
			for(int j = 1; j<=2*i- 1; j++){
				System.out.print(" " + " ");
				a++;
			}
			for(int j = n - i; j>=1; j--){
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}
		
	}

}

/*
 
 
1 2 3 4 5 6 7 8 9 
1 2 3 4   6 7 8 9 
1 2 3       7 8 9 
1 2           8 9 
1               9 


*/
