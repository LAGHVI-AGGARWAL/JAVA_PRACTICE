import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = {1};
	    int n = arr.length;
	    int[] brr = new int[n];
	    int k = sc.nextInt();

		//  using an extra array approach 
	    if(n == 1){
	        brr[0] = arr[0];
	    }
	    if(k > n){
	        k = k % n;
	    }
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
