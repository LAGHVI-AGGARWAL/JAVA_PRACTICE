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
    
    
    public static int reverseDigit(int n, int count){
        int r = 0;
        int x = 1;
        int ans = 0;
        while(n > 0){
            r = n % 10;
            x = (int)Math.pow(10,--count);
            x *=r;
            ans+=x;
            n = n/10;
        }
        return ans;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = countDigits(n,0);
	   int ans = reverseDigit(n,count);
	    System.out.println(ans);
	}
}
