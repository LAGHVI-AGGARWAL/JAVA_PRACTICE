//  ROTATE THE 2D ARRAY BY 90 DEGREES CLOCKWISE 
import java.util.*;
public class Main
{
    public static void print(int[][] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][n];
	    
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    
	    System.out.println();
	    
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j <= i; j++){
	            int temp = arr[i][j];
	            arr[i][j] = arr[j][i];
	            arr[j][i] = temp;
	        }
	    }
	    
	    
	   // print(arr);
	    
	    
	    for(int i = 0; i < n; i++){
	        int k = 0;
            int j = n - 1;
            while(k <= j){
                int temp = arr[i][k];
                arr[i][k] = arr[i][j];
                arr[i][j] = temp;
                k++;
                j--;
            }
	    }
	    
	    print(arr);
	}
}
