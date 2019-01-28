package com.company;

public class Main {

    public static void main(String[] args) {

        String input = "asDDfffRRRtt_3289KKK";

        System.out.println("Исходная строка:");
        System.out.println(input);

        System.out.println();
        System.out.println("Форматированная строка:");
        System.out.println(myLowerCase(input));
    }

    private static String myLowerCase(String input) {

        int magicNumber = 32;
        int codeOfA = 65;
        int codeOfZ = 90;
        String newStr = "";
        int[] tmp = new int[input.length()];

        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) input.charAt(i);
            if (tmp[i] >= codeOfA && tmp[i] <= codeOfZ) {
                tmp[i] += magicNumber;
            }
            newStr += (char) tmp[i];
        }
        return newStr;
    }
}
