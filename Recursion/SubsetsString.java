import java.util.*;
public class Main
{
    public static void PrintSubsets(String str, int i, String ans, ArrayList<String> arr){
        if(i == str.length()){
            arr.add(ans);
            // System.out.println(ans);
            // System.out.println();
            return;
        }
        
        PrintSubsets(str,i+1,ans,arr);
        PrintSubsets(str,i+1,ans+str.charAt(i),arr);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String ans = "";
	    ArrayList<String> arr = new ArrayList<>();
	   PrintSubsets(str,0,ans,arr);
	   System.out.println(arr);
	   
	}
}
