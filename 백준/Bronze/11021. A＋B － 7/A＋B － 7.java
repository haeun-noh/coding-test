import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= len; i++) { 
            System.out.println(String.format("Case #%d: %d", i, (scan.nextInt() + scan.nextInt())));
        }
    }
}