import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();

        System.out.println(isEqualEightOrNine(num1) && isEqualEightOrNine(num4) && num2 == num3 ? "ignore" : "answer");
    }

    static boolean isEqualEightOrNine(int num) {
        return num == 8 || num == 9;
    }
}