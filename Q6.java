package assignment_5;

public class Q6 {
    public static void main (String [] args) {
//        (a) *
//            * *
//            * * *
//            * * * *
//            * * * * *
        for (int i = 1 ; i < 6 ;i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

//        (b) 1
//            2 2
//            3 3 3
//            4 4 4 4
//            5 5 5 5 5

        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j <= i ; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();

//        (c) 1
//            2 3
//            4 5 6
//            7 8 9 10
//            11 12 13 14 15
        int k = 0;
        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(++k + " ");
            }
            System.out.println();
        }
        System.out.println();


//        (d) 1
//            1 2
//            1 2 3
//            1 2 3 4
//            1 2 3 4 5

        for (int i = 1 ; i < 6 ; i++) {
            for (int j = 1 ; j <= i ; j++ ) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
