import java.util.*;
public class Main
{
    public static int mazePath(int i, int j, int n, int m, String ans){
        if(i == n - 1 && j == m - 1){
            return 1;
        }
        if(i > n - 1 || j > m - 1){
            return 0;
        }
        int a = mazePath(i,j+1,n,m,ans+"R");
        int b = mazePath(i+1,j,n,m,ans+"L");
        return a + b;
    }
    
    // using two parameters - i.e backward tracking of the maze 
    public static int mazePaths(int n, int m){
        if(n == 1 && m == 1){
            return 1;
        }
        if(n < 1 || m < 1){
            return 0;
        }
        int a = mazePaths(n,m-1);
        int b = mazePaths(n-1,m);
        return a + b;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int i = 0;
	    int j = 0; 
	    String ans = "";
	    int count = mazePath(i,j,n,m,ans);
	    int count1 = mazePaths(n,m);
	    System.out.println(count);
	    System.out.println(count1);
	}
}
