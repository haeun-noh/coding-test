import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        for ( int i = 0; i < num; i++ ) {
            int n = scan.nextInt();

            list.add(n);
        }

        list.sort(Comparator.naturalOrder());

        System.out.println(list.get(0)+" "+list.get(list.size()-1));
    }
}