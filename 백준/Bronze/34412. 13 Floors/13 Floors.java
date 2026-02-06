import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int num = scan.nextInt();

        System.out.println(num >= 13 ? num + 1 : num);
    }
}