package ch06;
public class BubbleShort {
    public static void main(String[] args) {
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for(int i = 0; i<array.length; i++) {
            System.out.print(" "+array[i]);
        }
        System.out.println();
        System.out.println("Bubble Sort");
        for(int j = (array.length-1); j>0; j--) {
            for(int k = 0; k<j; k++) {
                if(array[k]>array[(k+1)]) {
                    int temp = array[(k+1)];
                    array[(k+1)] = array[k];
                    array[k] = temp;
                }
            }
        }
        for(int l = 0; l<array.length; l++) {
            System.out.print(" "+array[l]);
        }
    }
}
