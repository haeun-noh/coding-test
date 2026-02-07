import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int S = 0;
        int T = 0;
        for (int i = 0; i < 4; i++) {
            S += scan.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            T += scan.nextInt();
        }

        System.out.println(S >= T ? S : T);
    }
}