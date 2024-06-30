import java.util.Arrays;

public class commont {public static class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2,2, 3,4, 4, 5};


        Integer[] commonElements = Arrays.stream(array1)
                .filter(element -> Arrays.asList(array1).contains(element))
                .toArray(Integer[]::new);

        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }
}


}
