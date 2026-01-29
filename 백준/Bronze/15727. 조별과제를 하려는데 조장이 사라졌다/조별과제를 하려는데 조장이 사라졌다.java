import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int distance = Integer.parseInt(scan.next());

        System.out.println((int)Math.ceil(distance/5.0));
    }
}