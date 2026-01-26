import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < len; i++ ) {
            String[] arr = scan.nextLine().split("");
            System.out.println(arr[arr.length/2 - 1].equals(arr[arr.length/2]) ? "Do-it" : "Do-it-Not");
        }
    }
}