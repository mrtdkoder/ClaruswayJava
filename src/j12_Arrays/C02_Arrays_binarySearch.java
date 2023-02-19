package j12_Arrays;

import java.util.Arrays;

public class C02_Arrays_binarySearch {
    public static void main(String[] args) {
        int sayiArray[] = {2, 46, 31, 80, 44, 63, 27,21,79};
        System.out.println("Arrays.toString(sayiArray) = " + Arrays.toString(sayiArray));
        Arrays.sort(sayiArray);
        System.out.println("Arrays.toString(sayiArray) = " + Arrays.toString(sayiArray));
        int searchIndex = Arrays.binarySearch(sayiArray,46);
        System.out.println("searchIndex = " + searchIndex);
    }
}
