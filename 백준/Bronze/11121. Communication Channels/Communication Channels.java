import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < len; i++) {
            String[] arr = scan.nextLine().split(" ");
            BigInteger n1 = new BigInteger(arr[0]);
            BigInteger n2 = new BigInteger(arr[1]);

            System.out.println(arr[0].equals(arr[1]) && n1.compareTo(n2) == 0 ? "OK" : "ERROR");
        }
    }
}