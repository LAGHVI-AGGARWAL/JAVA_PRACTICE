package Arrays;
import java.util.*;

public class PrintLeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
//		boolean is_leader = true;
		
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
//		
//		for(int k = 0; k < n; k++){
//			boolean is_leader = true;
//			for(int j = k + 1; j < n; j++){
//				if(arr[j] >= arr[k]){
//					is_leader = false;
//					break;
//				}
//			}
//			if(is_leader == true){
//				System.out.print(arr[k] + " ");
//			}
//		}
		int curr_leader = arr[n-1];
		System.out.print(curr_leader + " ");
		for(int i = n - 2; i >= 0; i--){
//			System.out.print(curr_leader + " ");
			
			if(arr[i] > curr_leader){
				curr_leader = arr[i];
				System.out.print(curr_leader + " ");
			}
		}
		
	}

}
