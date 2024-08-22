
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   // int m = sc.nextInt();
	   // int n = sc.nextInt();
	   // int[][] arr = new int[m][n];
	   int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
	    
	   // for(int i = 0; i < m; i++){
	   //     for(int j = 0; j < n; j++){
	   //         arr[i][j] = sc.nextInt();
	   //     }
	   // }
	    
	    
	    for(int i = 0; i < arr.length; i++){
	        if(i % 2 == 0){
	            for(int j = 0; j < arr[i].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	        }
	        else{
	            for(int j = arr[i].length - 1; j >= 0; j--){
	                System.out.print(arr[i][j] + " ");
	            }
	        }
	    }
	}
}
