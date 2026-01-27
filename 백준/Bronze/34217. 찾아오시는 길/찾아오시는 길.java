import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] start = Arrays.stream(scan.nextLine().split(" "))
                               .mapToInt(Integer::parseInt) 
                               .toArray();
        int[] end = Arrays.stream(scan.nextLine().split(" "))
                               .mapToInt(Integer::parseInt) 
                               .toArray();

        if (start[0] + end[0] < start[1] + end[1])
            System.out.println("Hanyang Univ.");
        else if (start[0] + end[0] > start[1] + end[1])
            System.out.println("Yongdap");
        else
            System.out.println("Either");
    }
}