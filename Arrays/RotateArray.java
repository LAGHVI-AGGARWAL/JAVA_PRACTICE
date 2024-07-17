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

	//  not using an extra array 
		if(n > 1){
    	   int i = 0;
    	   int j = n - 1;
    	   while(i <= j){
    	       int temp = arr[i];
    	       arr[i] = arr[j];
    	       arr[j] = temp;
    	       i++;
    	       j--;
    	   }
    	   
    	   
    	   int m = 0;
    	   int l = k - 1;
    	   while(m <= l){
    	       int temp1 = arr[m];
    	       arr[m] = arr[l];
    	       arr[l] = temp1;
    	       m++;
    	       l--;
    	   }
    	   
    	   
    	   int p = k;
    	   int o = n - 1;
    	   while(p <= o){
    	       int temp2 = arr[p];
    	       arr[p] = arr[o];
    	       arr[o] = temp2;
    	       p++;
    	       o--;
    	   }
	   }
	   
	   for(int q = 0; q < n; q++){
	       System.out.print(arr[q] + " ");
    	}
	   
	}
}
