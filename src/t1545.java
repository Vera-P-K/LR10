import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(scanner.nextLine());
        }

        String k = scanner.nextLine();
        List<String> newarray = new ArrayList<>();

        for (String i : array) {
            if (i.startsWith(k)) {
                newarray.add(i);
            }
        }

        for (String i : newarray) {
            System.out.println(i);
        }

        scanner.close();
    }
}


