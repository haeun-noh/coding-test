import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for ( int i = 1; i <= num; i++ ) {
            if ( i == num ) {
                for ( int j = 0; j < i * 2 - 1; j++ ) {
                    System.out.print("*");
                }
            } else {
                for ( int j = 0; j < num - i; j++ ) {
                    System.out.print(" ");
                }
                for ( int j = 0; j < i * 2 - 1; j++ ) {
                    if ( j != 0 && j != (i * 2 - 1 - 1) )
                        System.out.print(" ");
                    else 
                        System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}