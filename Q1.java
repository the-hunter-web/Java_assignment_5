package assignment_5;
//Amicable numbers are pair of numbers each of whose divisors are added to give the other
//number.
import java.util.*;
public class Q1 {
    int amicable (int n) {
        int sum = 0 ;
        for (int i = 1 ; i < n ; i++) {
            int fact = 0;
            if (n % i == 0) {
                fact = 1;
                sum = sum + i;
            }
            if (fact != 0)
            System.out.print(i + " ");
        }
        System.out.println();
            return sum;
    }
    public static void main (String [] args ) {
            Q1 call = new Q1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum1 = call.amicable(x);
        int sum2 = call.amicable(y);

            if (sum1 == y && sum2 == x){
                System.out.println("Amicable");
            } else {
                System.out.println("not Amicable");
            }
    }
}
