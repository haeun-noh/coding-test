import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = 0;
        int index = 1;
        for ( int i = 1; i <= 9; i++ ) {
            int num = Integer.parseInt(scan.nextLine());

            if ( num > max ) {
                max = num;
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}