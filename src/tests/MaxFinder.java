package tests;

public class MaxFinder {



    public static int findMax (int [] numbers){
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max = numbers[0];
        for(int num : numbers){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}
