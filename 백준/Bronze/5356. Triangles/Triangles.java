import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());

        for ( int i = 0; i < len; i++ ) {
            String[] arr = scan.nextLine().split(" ");

            int dep = Integer.parseInt(arr[0]);
            char ch = arr[1].charAt(0);

            for ( int j = 0; j < dep; j++ ) {
                for ( int k = 0; k < (j+1); k++ ) {
                    System.out.print(ch);
                }
                ch = (char)('A' + (ch - 'A' + 1) % 26);
                System.out.println();
            }
            System.out.println();
        }
    }
}