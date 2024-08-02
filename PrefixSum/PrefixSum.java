
import java.util.*;
public class Main
{
    // making new array
    public static void prefixSum(int[] nums){
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        
         for(int i = 0; i < n; i++){
            System.out.print(pre[i] + " ");
        }
    }
    
    // making changes in that array itself 
    public static void runningSum(int[] nums){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] nums = new int[n];
	    for(int i = 0; i < n; i++){
	        nums[i] = sc.nextInt();
	    }
	    
	    prefixSum(nums);
	    runningSum(nums);
	}
}
