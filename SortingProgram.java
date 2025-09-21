import java.util.Arrays;

class SortingProgram {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4};
        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
