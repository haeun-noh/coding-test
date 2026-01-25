import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            String[] arr = scan.next().split("");

            if ( arr[0].equals("0") ) break;
            
            String result = "yes";
            for (int i = 0; i <= arr.length / 2; i++) {
                if ( !arr[i].equals(arr[arr.length-1-i]) ) {
                    result = "no";
                    break;
                }
            }

            System.out.println(result);
        }
    }
}