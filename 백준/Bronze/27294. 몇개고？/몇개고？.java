import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        boolean S = (scan.nextInt() == 1) ? true : false;

        System.out.println((T >= 12 && T <= 16 && S == false) ? 320 : 280);
    }
}