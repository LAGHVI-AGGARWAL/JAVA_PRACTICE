package PatternPrinting.SpecialPatterns;
import java.util.*;

public class StarPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 !=0){
			int a = n/2;
//			System.out.println(a);
			for(int i = 1; i <=n; i++){
				for(int j = 1; j <=n; j++){
					if((i == a+1) || (j == a+1)){
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}

}
