import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            int[] arr = Arrays.stream(scan.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            if ( arr[0] == 0 && arr[1] == 0 ) break;

            System.out.println(arr[0]+arr[1]);
        }
    }
}