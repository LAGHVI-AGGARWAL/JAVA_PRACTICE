
import java.util.*;
public class Main
{
    public static void reverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   reverse(n);
	}
}
