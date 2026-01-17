import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println(num <= 100000 && num % 2024 == 0 ? "Yes" : "No");
    }
}