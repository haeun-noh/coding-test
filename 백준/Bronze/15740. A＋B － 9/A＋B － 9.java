import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger num1 = new BigInteger(scan.next());
        BigInteger num2 = new BigInteger(scan.next());

        System.out.println(num1.add(num2));
    }
}