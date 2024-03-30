package PatternPrinting.SpecialPatterns;
import java.util.*;

public class StarTriangleVerticallyFlipped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// this is the method which is coded by considering it as a square 
		
		// but by considering this example as triangle and then doing would do further 
		
		
//		for(int i = 1; i <=n ; i++){
//			for(int k = 1; k <= n - i ; k++){
//				System.out.print(" " + " ");
//			}
//			for(int j = n - i + 1; j <=n ; j++){
//				System.out.print("*" + " ");
//			}
//			System.out.println();
//		}
		
		for(int i = 1; i <=n; i++){
			for(int j = 1; j <=n; j++){
				if(i + j > n){
					System.out.print("*" + " ");
				}
				else{
					System.out.print(" " + " ");
				}
			}
			System.out.println();
		}
	}

}
