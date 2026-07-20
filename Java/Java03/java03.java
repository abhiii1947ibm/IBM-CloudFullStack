package Java03;

import java.time.LocalDate;
import java.util.Arrays;

public class java03 {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        int[] arr2 = {1,9,3,6,5};
        arr1[0] = 1;
        arr1[0] = 2;
        arr1[0] = 3;
        arr1[0] = 4;
        arr1[0] = 5;

        Arrays.sort(arr2);

        System.out.println(arr1);
        System.out.println(arr2);

        for (int i : arr2) {
            System.out.print(i);
        }

        System.out.println();

        LocalDate ld = LocalDate.now();

        System.out.print(ld);
        
    }
}
