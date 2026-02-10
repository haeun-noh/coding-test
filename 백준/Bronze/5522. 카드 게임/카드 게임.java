import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for ( int i = 0; i < 5; i++ ) {
            sum += scan.nextInt();
        }

        System.out.println(sum);
    }
}