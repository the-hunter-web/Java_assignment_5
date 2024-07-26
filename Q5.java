package assignment_5;
import java.util.*;
//WAP to display the multiplication table from 2 to 15.
public class Q5 {
    void table (int x , int y){
        for (int i = x ; i <= y ; i++) {
            for (int j = 1 ; j <= 10 ; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
            System.out.println();
        }
    }
    public static void main (String [] args ) {
        Q5 call = new Q5();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        call.table(x,y);
    }
}
