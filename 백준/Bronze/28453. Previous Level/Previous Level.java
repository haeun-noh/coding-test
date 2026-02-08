import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < len; i++) {
            int score = scan.nextInt();

            if ( score < 250 )
                System.out.print(4);
            else if ( score < 275)
                System.out.print(3);
            else if ( score < 300 )
                System.out.print(2);
            else if ( score == 300 ) 
                System.out.print(1);
            System.out.print(" ");
        }
    }
}