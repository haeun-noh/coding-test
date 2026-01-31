import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int caseCnt = scan.nextInt();
            
        for (int i = 1; i <= caseCnt; i++ ) {
            int numCnt = scan.nextInt();

            int sum = 0;
            for (int j = 1; j <= numCnt; j++ ) {
                sum += scan.nextInt();
            }

            System.out.println(sum);
        }
    }
}