
import java.util.*;
public class Main
{
    public static void maxArray(int[] arr, int n, int i, int max){
        if(i == n){
            System.out.println(max);
            return;
        }
        max = Math.max(arr[i],max);
        maxArray(arr,n,i+1,max);
    }
    
    public static int maxArray1(int arr[], int n, int i, int max){
        if(i == n-1){
            max = arr[i];
            return max;
        }
        max = maxArray1(arr,n,i+1,max);
        Math.max(arr[i],max);
        return max;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    int max = Integer.MIN_VALUE;
	   maxArray(arr,n,0,max);
	    System.out.println(maxArray1(arr,n,0,max));
	}
}
