import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(fac(scan.nextInt()));
    }

    static int fac(int num) {
        if (num == 0) return 1;

        return num * fac(num-1);
    }
}