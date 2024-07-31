import java.util.*;
public class Main {
  
    public static long powLog(int a, int b) {
        if (b == 0) {
            return 1;
        }
        long power = powLog(a, b / 2);
        if (b % 2 == 0) {
            return power * power;
        } else {
            return power * power * a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(powLog(a, b));
    }
}
