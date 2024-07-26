package assignment_5;
//WAP to check whether a number is twisted prime or not. Twisted prime is a number if the
//        number and its reverse both are prime then it is called twisted prime.
import java.util.*;
public class Q2 {
    int rev(int n){
        String s = "";
        for (n = n ; n != 0 ; n = n/10){
            s = s + (n%10);
        }
        int rev = Integer.valueOf(s);
        return rev;
    }
    boolean twisted(int n) {
        int c = 0;
        for (int i = 2 ; i < n ; i++ ){
            if (n%i == 0)
                c = 1 + c;
        }
        if (c == 0)
            return true;
        else
            return false;
    }

    public static void main (String [] args){
        Q2 call = new Q2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int x = sc.nextInt();
        int y = call.rev(x);
        boolean b1 = call.twisted(x);
        boolean b2 = call.twisted(y);

        if (b1 == true && b2 == true){
            System.out.println("twisted prime");
        }
        else {
            System.out.println("not a twisted prime ");
        }
    }
}
