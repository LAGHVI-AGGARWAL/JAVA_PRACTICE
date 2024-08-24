
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[][] arr = new int[n][n];
	    int count = 1;
	    
	    
	    int minr = 0;
	    int maxr = n - 1;
	    int minc = 0;
	    int maxc = n - 1;
	    
	    while(minr <= maxr && minc <= maxc){
    	    for(int i = minr; i <= minr ; i++){
    	        for(int j = minc; j <= maxc; j++){
    	           arr[i][j] = count;
    	           count++;
    	        }
    	    }
    	    minr++;
    	    
    	    if(minr > maxr || minc > maxc) break;
    	    for(int j = maxc; j <= maxc; j++){
    	        for(int i = minr; i <= maxr; i++){
    	             arr[i][j] = count;
    	             count++;
    	        }
    	    }
    	    maxc--;
    	    
    	    if(minr > maxr || minc > maxc) break;
    	    for(int i = maxr; i <= maxr; i++){
    	        for(int j = maxc; j >= minc; j--){
    	             arr[i][j] = count;
    	             count++;
    	        }
    	    }
    	    maxr--;
    	    
    	    if(minr > maxr || minc > maxc) break;
    	    for(int j = minc; j <= minc; j++){
    	        for(int i = maxr; i >= minr; i--){
    	             arr[i][j] = count;
    	             count++;
    	        }
    	    }
    	    minc++;
	    }
	    
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            System.out.print(arr[i][j] + " ");
	        }
	    }
	    
	}
}
