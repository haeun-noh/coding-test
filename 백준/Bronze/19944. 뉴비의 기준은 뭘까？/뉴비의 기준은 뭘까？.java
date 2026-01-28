import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        if (arr[1] == 1 || arr[1] == 2)
            System.out.println("NEWBIE!");
        else if (arr[1] <= arr[0])
            System.out.println("OLDBIE!");
        else
            System.out.println("TLE!");
    }
}