
import java.util.*;
public class Main
{
    public static int sumArray(int[] arr, int n, int i){
        if(i == n){
            return 0;
        }
        int sum = sumArray(arr,n,i+1);
        sum = sum + arr[i];
        return sum;
    }
    
    public static void SumArray(int[] arr, int n, int i,int sum){
        if(i == n){
            System.out.println(sum);
            return;
        }
        sum = sum + arr[i];
        SumArray(arr,n,i+1,sum);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    int sum = 0;
	    System.out.println(sumArray(arr,n,0));
	    SumArray(arr,n,0,sum);
	}
}
