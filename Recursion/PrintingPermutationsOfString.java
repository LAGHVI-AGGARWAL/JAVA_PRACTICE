import java.util.*;
public class Main
{
    public static void PrintPermutations(String str, String ans){
        int n = str.length();
        if(n == 0){
            System.out.println(ans);
            return;
        }
            
        for(int i = 0; i < n; i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1,n);
            PrintPermutations((left+right),ans+ch);
        }
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String ans = "";
	    PrintPermutations(str,ans);
	}
}
