package assignment_5;
//Write a program that will read the value of n from the user and calculate sum of the following
//series:
import java.util.*;

public class Q9 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        double sum = 0;
            for (int j = 1 ; j <= n ; j++) {
                sum = 1.0/(Math.pow(j,2)) + sum;
            }
        System.out.println(sum);
    }
}
