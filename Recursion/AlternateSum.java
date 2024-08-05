// Given a number n, find the sum of natural numbers till n but with alternate signs

import java.util.*;
public class Main
{
    public static void SumAlternate(int n, int m, int ans, boolean check){
        if(m > n){
            System.out.println(ans);
            return;
        }
        if(check){
            SumAlternate(n,m+1,ans+m,false);
        }
        else{
            SumAlternate(n,m+1,ans-m,true);
        }
    }
    
    public static void sumAlternate(int n, int ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        if(n % 2 == 0){
            sumAlternate(n-1,ans-n);
        }
        else{
            sumAlternate(n-1,ans+n);
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = 1;
	    int ans = 0;
	    boolean check = true;
	   SumAlternate(n,m,ans,check);
	   sumAlternate(n,ans);
	}
}
