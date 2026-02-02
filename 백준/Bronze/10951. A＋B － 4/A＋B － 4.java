import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        while(scan.hasNextInt()) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println(num1+num2);
        }
    }
}