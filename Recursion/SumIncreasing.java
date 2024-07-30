import java.util.*;
public class Main
{
  //  FIRSTLY BY TAKING THE ANS AS PARAMETER
    public static void sum(int n, int ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        ans = ans + n;
        sum(n-1,ans);
    }

  //  BY TAKING THE RETURN TYPE OF FUNCTION AS INT 
    public static int sum1(int n){
        int ans = 0;
        if(n == 0 || n == 1){
            return n;
        }
        ans = sum1(n-1) + n;
        return ans;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int ans = 0;
	    System.out.println(sum1(n));
	   //sum(n,ans);
	   
	}
}
