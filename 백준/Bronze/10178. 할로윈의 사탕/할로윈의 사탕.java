import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());

        for ( int i = 0; i < len; i++ ) {
            int[] arr = Arrays.stream(scan.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            System.out.println("You get " + (arr[0] / arr[1]) + " piece(s) and your dad gets " + (arr[0] % arr[1]) + " piece(s).");
        }
    }
}