package problems;

public class InvertPositionElementsArray {

    private static void invert(int[] array, int index) {
        if (index < array.length / 2) {
            int temp = array[array.length - 1 - index];
            array[array.length - 1 - index] = array[index];
            array[index] = temp;
            invert(array, index + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Before: ");

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("} ");

        System.out.println("After: ");

        invert(array, 0);

        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("} ");
    }

}
