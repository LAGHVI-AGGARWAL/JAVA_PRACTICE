
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int m = sc.nextInt();
	    int n = sc.nextInt();
	    int[][] a = new int[m][n];
	    
	    int p = sc.nextInt();
	    int q = sc.nextInt();
	    int[][] b = new int[p][q];
	    
	    if(n != p){
	        System.out.println("The matrix multiplication is not possible");
	    }
	    
	    else{
	         for(int i = 0; i < m; i++){
	             for(int j = 0; j < n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            
            for(int i = 0; i < p; i++){
	             for(int j = 0; j < q; j++){
                    b[i][j] = sc.nextInt();
                }
            }
            
            int[][] c = new int[m][q];
            
            for(int i = 0; i < m; i++){
                for(int j = 0; j < q; j++){
                    for(int k = 0; k < n; k++){
                        c[i][j] += (a[i][k] * b[k][j]);
                    }
                }
            }
            
            for(int i = 0; i < m; i++){
	             for(int j = 0; j < q; j++){
                    System.out.print(c[i][j] + " ");
                }
            }
	    }
	    
	}
}
