package PatternPrinting.SpecialPatterns;
import java.util.*;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int m = sc.nextInt();
		int p = 1;
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(p + " ");
				p++;
			}
			System.out.println();
		}
	}

}





/*
 1
 2 3
 4 5 6
 7 8 9 10
*/
