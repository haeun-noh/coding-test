import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for ( int i = 0; i < num; i++ ) {
            for ( int j = 1; j < num - i; j++ ) {
                System.out.print(" ");
            }
            for ( int j = (i + 1) * 2 - 1; j > 0; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}