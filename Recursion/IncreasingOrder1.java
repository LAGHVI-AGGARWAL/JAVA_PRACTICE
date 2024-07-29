import java.util.*;
public class Main
{
  // USING EXTRA PARAMETER
    public static void increase(int n, int i){
        if(i > n){
            return;
        }
        System.out.println(i);
        i++;
        increase(n,i);
    }
  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int i = 1;
	   increase(n,i);
	}
}
