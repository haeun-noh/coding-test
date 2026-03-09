import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int R1 = scan.nextInt();
        int S = scan.nextInt();

        System.out.println(2 * S - R1);
    }
}