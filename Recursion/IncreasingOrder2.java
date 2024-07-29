import java.util.*;
public class Main
{
    static int n;
    public static void increase1(int i){
        if(i > n) return;
        System.out.println(i);
        increase1(i+1);
    }
  
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	   int i = 1;
	   increase1(i);
	}
}
