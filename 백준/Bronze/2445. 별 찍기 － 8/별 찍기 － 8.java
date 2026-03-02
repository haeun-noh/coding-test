import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for ( int i = 0; i < num; i++ ) {
            for ( int j = 0; j <= i; j++ ) {
                System.out.print("*");
            }
            for ( int j = 0; j <= num - i - 2; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 0; j <= num - i - 2; j++ ) {
                System.out.print(" ");
            }
            for ( int j = 0; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
        for ( int i = num - 1; i > 0; i-- ) {
            for ( int j = i - 1; j >= 0; j-- ) {
                System.out.print("*");
            }
            for ( int j = (num - i) * 2 - 1; j >= 0; j-- ) {
                System.out.print(" ");
            }
            for ( int j = i - 1; j >= 0; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}