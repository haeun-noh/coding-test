import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        String str1 = "";
        for ( int i = 0; i < num1; i++ ) {
            str1 += "1";
        }

        String str2 = "";
        for ( int i = 0; i < num2; i++ ) {
            str2 += "1";
        }

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
    }
}