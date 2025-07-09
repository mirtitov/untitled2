package lambda;

import java.util.Arrays;

public class ConverterDemo {
    public static int[] convertArray(int[] array, Converter converter){
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = converter.convert(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int [] squeres = convertArray(array, x -> x*x);
        System.out.println("Квадраты чисел массива: " + Arrays.toString(squeres));
    }
}
