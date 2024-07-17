import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {10,20,30,40,50,60,70};
	    int n = arr.length;
	    int[] brr = new int[n];
	    int k = sc.nextInt();
	    
	    for(int i = 0; i < k; i++){
	        brr[i] = arr[n-k+i];
	    }
	    for(int j = 0; j < n - k; j++){
	        brr[k+j] = arr[j];
	    }
	    for(int m = 0; m < n; m++){
	        System.out.print(brr[m] + " ");
	    }
	}
}
