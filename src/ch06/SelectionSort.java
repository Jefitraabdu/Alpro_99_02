package ch06;
public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int i = 0; i < array.length-1; i++){
            int max = i;
            for(int j = i; j < array.length; j++){
                if(array[j]<array[max]){
                    max = j;
                }
            }
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
