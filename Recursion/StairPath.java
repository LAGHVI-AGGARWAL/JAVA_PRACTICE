import java.util.*;
public class Main
{
    public static int stairPath(int n, String ans){
        if(n == 0){
            System.out.print(ans + " ");
            return 1;
        }
        if(n < 0){
            return 0;
        }
        int a = stairPath(n - 1,ans+"1");
        int b = stairPath(n - 2,ans+"2");
        return a + b;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String ans = "";
	    int count = stairPath(n,ans);
	    System.out.println();
	    System.out.print(count);
	}
}
