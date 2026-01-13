import java.util.Scanner;
import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[2];
        strs[0] = scanner.next();
        strs[1] = scanner.next();

        int[] inputs = Arrays.stream(strs)
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print(inputs[1]-inputs[0]+" ");
        System.out.print(inputs[1]);

    }
}
