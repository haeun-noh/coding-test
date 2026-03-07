import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = 1;

        while(true) {
            String str = scan.nextLine();

            if ( str.equals("0") ) break;

            System.out.println("Case "+ (index++) +": Sorting... done!");
        }
    }
}