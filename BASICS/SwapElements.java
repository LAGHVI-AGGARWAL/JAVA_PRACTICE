//  SWAP KTH ELEMENT FROM THE END AND END IN THE ARRAYLIST 

import java.util.*;
public class Main
{
    public static void swapElements(int n, ArrayList<Integer> arr ,int k){
        Collections.swap(arr,k-1,n-k);
        System.out.println(arr);
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   // int[] arr = new int[n];
	    ArrayList<Integer> arr = new ArrayList<Integer>();
	    
	    for(int i = 0; i < n; i++){
	        arr.add(sc.nextInt());
	    }
	    
	    int k = sc.nextInt();
	    swapElements(n,arr,k);
	}
}
