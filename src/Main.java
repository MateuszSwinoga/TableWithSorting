import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element1, element2, element3, element4, element5, select;
        System.out.println("Enter five numbers for table(separated by enter)");

        element1 = scanner.nextInt();
        element2 = scanner.nextInt();
        element3 = scanner.nextInt();
        element4 = scanner.nextInt();
        element5 = scanner.nextInt();

        int[] table = {element1, element2, element3, element4, element5};
        System.out.println("Display table:\n1.added sequence\n2.ascending\n3.decreasing");
        select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Table before sorting: " + Arrays.toString(table));
                break;

            case 2:

                    Arrays.sort(table);
                    System.out.println("Table after soring - ascending: " + Arrays.toString(table));

                break;

            case 3:

                Arrays.sort(table, (x,y) -> {
                    return x-y;
                });



        }

    }
}