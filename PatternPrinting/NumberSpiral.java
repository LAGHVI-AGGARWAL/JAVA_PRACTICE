package PatternPrinting.CompositePatterns;
import java.util.*;
public class NumberSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= 2*n - 1; i++){
			for(int j = 1; j <= 2*n - 1; j++){
				int a = i;
				int b = j;
				if(i > n){
					a = 2*n - i;
				}
				if(j > n){
					b = 2*n - j;
				}
				System.out.print(n + 1 - Math.min(a,b) + " ");
			}
			System.out.println();
		}
	}
}

/*
  	 4 4 4 4 4 4 4 
  	 4 3 3 3 3 3 4 
	 4 3 2 2 2 3 4 
	 4 3 2 1 2 3 4 
	 4 3 2 2 2 3 4 
	 4 3 3 3 3 3 4 
	 4 4 4 4 4 4 4 

*/
