import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        for ( int i = 0; i < num; i++ ) {
            String[] arr = scan.nextLine().split("");

            System.out.println(arr[0]+arr[arr.length-1]);
        }
    }
}