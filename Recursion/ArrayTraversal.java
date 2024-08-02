import java.util.*;
public class Main
{
    public static void arrayTraversal(int[] arr, int n){
        // int n = arr.length;
        int i = n - 1;
        if(i < 0){
            return;
        }
        arrayTraversal(arr,i);
        System.out.print(arr[i] + " ");
    }
    
    public static void arrayTraversal1(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        System.out.print(arr[i] + " ");
        arrayTraversal1(arr,i+1);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    arrayTraversal(arr,n);
	    System.out.println();
	    arrayTraversal1(arr,0);
	}
}
