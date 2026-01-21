import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= len; i++) {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println(String.format("Case #%d: %d + %d = %d", i, num1, num2, (num1+num2)));
        }
    }
}