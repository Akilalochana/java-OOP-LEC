package week05;

import java.util.Arrays;
import java.util.Stack;

public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores));

        scores[0] = 5;
        scores[1] = 19;
        scores[3] = 7;

        System.out.println(Arrays.toString(scores));

        int[] num = {3, 7, 5, 9};

        System.out.println(Arrays.toString(num));



    }

    public static void printArray(int[] arr){
        try{
            for (int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("An error occured");
        }
    }
}
