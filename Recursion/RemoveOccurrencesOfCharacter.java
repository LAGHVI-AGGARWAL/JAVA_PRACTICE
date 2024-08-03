import java.util.*;
public class Main
{
    public static void RemoveCharacter(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(i) != 'a'){
            ans+=(str.charAt(i));
        }
        RemoveCharacter(str,ans,i+1);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String ans = "";
	    RemoveCharacter(str,ans,0);
	}
}
