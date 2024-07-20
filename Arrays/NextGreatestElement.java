public class Main
{
	public static void main(String[] args) {
	    int[] arr = {12,8,41,60,2,49,16,28,21};
	    int n = arr.length;
	    int[] ans = new int[n];
	    int max =   Integer.MIN_VALUE;

    //  BRUTE FORCE 
	   // for(int i = 0; i < n; i++){
	   //     if(i == n-1){
	   //         max = -1;
	   //     }
	   //     else{
	   //         max = arr[i+1];
	   //     }
	   //     for(int j = i + 1; j < n; j++){
	   //         if(max < arr[j]){
	   //             max = arr[j];
	   //         }
	   //     }
	   //     ans[i] = max;
	   // }


    //  OPTIMIZED METHOD 
	    for(int i = n - 1; i >= 0; i--){
	        if(i == n - 1){
	            ans[i] = -1;
	        }
	        else{
	            max = Math.max(max,arr[i+1]);
	            ans[i] = max;
	        }
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.print(ans[i] + " ");
      }
	}
}
