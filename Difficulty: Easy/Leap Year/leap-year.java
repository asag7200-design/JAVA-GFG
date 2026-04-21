//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        // code here
                int n = year;
        if((n%4 == 0 && n%100 != 0 )||(n%400==0)){
            System.out.println("True");
            
        }else{
        System.out.println("False");
        }
    }
}