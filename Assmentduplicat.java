import java.util.Arrays;

import static pacakage2212.duplicatarrey.removeDuplicates;

public class Assmentduplicat {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 2, 4, 5, 1};
        int[] uniqueArray = removeDuplicates(originalArray);

        System.out.println(Arrays.toString(uniqueArray));
    }}
