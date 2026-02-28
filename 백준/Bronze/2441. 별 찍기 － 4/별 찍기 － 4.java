import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for ( int i = 0; i < num; i++ ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print(" ");
            }
            for ( int j = num - i - 1; j >= 0; j-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}