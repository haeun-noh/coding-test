import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxSum = 0;
        int maxIdx = 1;
        
        for (int i = 0; i < 5; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" "))
                               .mapToInt(Integer::parseInt)
                               .toArray();
            int sum = arr[0] + arr[1] + arr[2] + arr[3];

            if ( maxSum <= sum ) {
                maxSum = sum;
                maxIdx = i+1;
            }
        }

        System.out.println(maxIdx+" "+maxSum);
    }
}