import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int len = Integer.parseInt(scan.nextLine());

        int[] arr = Arrays.stream(scan.nextLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}