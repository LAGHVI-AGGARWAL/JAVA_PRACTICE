import java.util.*;
public class Main
{
    public static void hcf(int a, int b){
        if(a == 0){
            System.out.println(b);
            return; 
        }
        int ans = b%a;
        hcf(ans,a);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();

    // BRUTE FORCE 
    
	   // int a = Math.min(n,m);
	   // int b = Math.max(n,m);
	   // int min = Math.min(n,m);
	   // boolean check = false;
	   // int ans = Integer.MIN_VALUE;
	   // for(int i = 1; i <= min; i++){
	   //     if(n % i == 0){
	   //         check = true;
	   //     }
	   //     if(check){
	   //         if(m % i == 0){
	   //             ans = Math.max(ans,i);
	   //         }
	   //     }
	   // }
	   // System.out.println(ans);
	    hcf(a,b);
	}
}
