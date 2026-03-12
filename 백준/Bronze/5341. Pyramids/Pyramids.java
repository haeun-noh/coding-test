import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int num = scan.nextInt();

            if ( num == 0 ) break;

            int result = factorial(num);
            System.out.println(result);
        }
    }

    public static int factorial(int num) {
        if ( num == 1 ) return 1;

        return factorial(num-1) + num;
    }
}