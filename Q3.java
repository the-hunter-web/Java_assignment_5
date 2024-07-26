package assignment_5;
//WAP to enter the first number and second number. Display the prime numbers between the
//first and second number
import java.util.*;
public class Q3 {
    void factor (int n , int o){
        for (int i = n ; i <= o ; i++){
            int count = 0;
            for (int j = 2 ; j < i ; j++){
                if (i % j == 0){
                    count = 1 ;
                }
            }
            if (count == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main (String [] args) {
        Q3 call = new Q3();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two num :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        call.factor(x,y);
    }
}
