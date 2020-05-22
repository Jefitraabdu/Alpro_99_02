package ch06;
public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (array[j] > array[j - 1]) {
                    break;
                }
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}