package assignment_5;

public class Q7 {
    public static void main (String [] args) {
//        (a) A
//            A B
//            A B C
//            A B C D
//            A B C D E
        int k = 'A'-1;
        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(((char)(k+j)) + " ");
            }
            System.out.println();
        }
        System.out.println();

//        (b) $ $ $ $ $
//            $ $ $ $
//            $ $ $
//            $ $
//            $

        for (int i = 0 ; i < 6 ; i++) {
            for (int j = 6-1-i ; j >= 1 ; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }
//        (c) 1
//            2 2
//            3 3 3
//            4 4 4 4
//            5 5 5 5 5

        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j <= i ; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
