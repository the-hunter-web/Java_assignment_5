package assignment_5;
//WAP to calculate and display the factorial of all numbers between m and n (where m < n, m
//> 0, n > 0)
import java.util.*;
public class Q4 {
    void fact(int x , int y){
        for (int i = x ; i <= y ; i++) {
            int fac = 1;
            for (int j = i ; j >= 1 ;j-- ){
                fac = j*fac;
            }
            System.out.println("Factorial of " + i + " = " + fac);
        }
    }

    public static void main (String [] args) {
        Q4 call = new Q4();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        call.fact(x,y);
    }
}
