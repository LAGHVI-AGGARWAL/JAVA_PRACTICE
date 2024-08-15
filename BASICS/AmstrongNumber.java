import java.util.*;
public class Main
{
    public static int countDigits(int n, int count){
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    
    public static int amstrongNumber(int n, int count){
        // int ans = 1;
        // int x = count;
        int r = 0;
        int sum = 0;
        while(n > 0){
            r = n % 10;
            n = n / 10;
            sum+=Math.pow(r,count);
        }
        return sum;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = countDigits(n,0);
	   // System.out.println(count);
	   int sum = amstrongNumber(n,count);
	   // System.out.println(sum);
	    if(sum == n){
	        System.out.println("Yes " + n + " is an Amstrong number");
	    }
	    else{
	        System.out.println("No " + n + " is not an Amstrong number");
	    }
	}
}
