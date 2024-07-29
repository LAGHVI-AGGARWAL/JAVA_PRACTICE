
import java.util.*;
public class Main
{
    public static int fact(int n){
        int ans = 1;
        if(n == 1 || n == 0){
            return 1;
        }
        ans = n * fact(n-1);
        return ans;
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println(fact(n));
	}
}
