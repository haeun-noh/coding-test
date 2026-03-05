import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for ( int i = 0; i < num; i++ ) {
            String str = scan.nextLine();

            System.out.println(str.length() >= 6 && str.length() <= 9 ? "yes" : "no");
        }
    }
}