//  GENERATE BINARY STRINGS OF LENGTH N WITHOUT HAVING CONSECUTIVE ONES
import java.util.*;
public class Main
{
	public static void binaryString(String ans, int n, Boolean check, int m) {
	    if(m == n){
	        System.out.println(ans);
	        return;
	    }
		if(check) {
			binaryString(ans+'0',n,false,m+1);
		}
		else {
		    binaryString(ans+'0',n,false,m+1);
		    binaryString(ans+'1',n,true,m+1);
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		boolean check = false;
		binaryString(ans,n,check,0);
	}
}
