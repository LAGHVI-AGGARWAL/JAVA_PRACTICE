// Given a number num  and a value k, print k multiples of num
import java.util.*;
public class Main
{
    public static void Multiple(int num, int k, int n){
        if(n > k){
            return;
        }
        int ans = num * n;
        System.out.print(ans + ",");
        Multiple(num,k,n+1);
    }
    
    public static void multiple(int num, int k){
        if(k == 0){
            return;
        }
        multiple(num,k-1);
        System.out.print((num*k) + " ");
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int k = sc.nextInt();
	    int n = 1;
	   // Multiple(num,k,n);
	    multiple(num,k);
	}
}
