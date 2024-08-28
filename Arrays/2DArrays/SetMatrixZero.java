import java.util.*;
public class Main
{   
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    
	    int[][] arr = new int[m][n];
	    for(int i = 0; i < m; i++){
	        for(int j = 0; j < n; j++){
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    
	    int[][] brr = new int[m][n];
	    for(int i = 0; i < m; i++){
	        for(int j = 0; j < n; j++){
	            brr[i][j] = arr[i][j];
	        }
	    }
	    
	    for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(brr[i][j] == 0){
                    //   set the ith row and jth col to 0 in arr 
                    for(int b = 0; b < n; b++){
                        arr[i][b] = 0;
                    }
                    for(int a = 0; a < m; a++){
                        arr[a][j] = 0;
                    }
                }
            }
        }
        
         for(int i = 0; i < m; i++){
	        for(int j = 0; j < n; j++){
	            System.out.print(arr[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}
