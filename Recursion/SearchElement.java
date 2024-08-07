
import java.util.*;
public class Main
{
    
    public static void containElement(int arr[], int n, int i, int k){
        if(i == n){
            System.out.println("no");
            return;
        }
        if(arr[i] == k){
            System.out.println("yes");
            return;
        }
        else{
            containElement(arr,n,i+1,k);
        }
    }
    
    public static boolean containsElement(int[] arr, int n, int i, int k, boolean check){
        if(i == n){
            return false;
        }
        if(arr[i] == k){
            return true;
        }
        else{
            check = containsElement(arr,n,i+1,k,check);
        }
        return check;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    int k = sc.nextInt();
	    containElement(arr,n,0,k);
	    boolean check = false;
	    if(containsElement(arr,n,0,k,check)){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }
	}
}
