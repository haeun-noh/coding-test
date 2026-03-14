import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String mbti = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        int cnt = 0;
        
        for ( int i = 0; i < num; i++ ) {
            String str = scan.nextLine();

            if ( str.equals(mbti) ) cnt++;
        }

        System.out.println(cnt);
    }
}