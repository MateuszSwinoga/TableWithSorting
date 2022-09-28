import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] table = new int[]{2,5,4,3,1};

        for (int i=0; i< table.length; i++){
            System.out.println("Table before sorting: " + table[i]);

        }
        for (int i=0; i< table.length; i++) {
            Arrays.sort(table);

            System.out.println("Table after soring - ascending: " + table[i]);
        }
        for (int i=0; i< table.length; i++) {
            Arrays.sort(table, (x,y) -> y - x);
            System.out.println("Table after sorting - descending: " + table[i]);

        }


    }
}