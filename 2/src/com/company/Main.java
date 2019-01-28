package com.company;

import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) - 50;
        }
        Arrays.sort(arr);
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        int[] newArr = sqrArray(arr);

        System.out.println();
        System.out.println("Сортированный массив квадратов:");
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] sqrArray(int[] inputArr) {

        int[] outputArr = new int[inputArr.length];
        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = inputArr[i] * inputArr[i];
        }

        for(int i = outputArr.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(outputArr[j] > outputArr[j+1]) {
                    int tmp = outputArr[j];
                    outputArr[j] = outputArr[j + 1];
                    outputArr[j + 1] = tmp;
                }
            }
        }
        return outputArr;
    }
}
