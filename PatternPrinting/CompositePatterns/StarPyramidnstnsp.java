package PatternPrinting.CompositePatterns;
import java.util.*;

public class StarPyramidnstnsp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n-1;
		int nst = 1;
		
		for(int i = 1; i<=n; i++){
			for(int j = 1; j<=nsp; j++){
				System.out.print(" " + " ");
			}
			nsp--;
			for(int j = 1; j <=nst; j++){
				System.out.print("*" + " ");
			}
			nst +=2;
			System.out.println();
		}
	}

}
