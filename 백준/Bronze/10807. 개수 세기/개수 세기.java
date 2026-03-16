import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int num = Integer.parseInt(scan.nextLine());

        int cnt = 0;
        for ( int i = 0; i < arr.length; i++ ){
            if ( arr[i] == num ) cnt++;
        }

        System.out.println(cnt);
    }
}