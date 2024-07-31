import java.util.*;
public class Main
{
    public static int pow(int a, int b){
        int m = 1;
        int ans = 1;
        if(b == 1){
            return a;
        }
        if(b == 0){
            return 1;
        }
        ans = pow(a,m) * pow(a,b-1);
        // ans = a * pow(a,b-1);
        return ans;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    
	    System.out.println(pow(a,b));
	}
}
