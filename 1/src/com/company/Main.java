package com.company;

public class Main {

    public static void main(String[] args) {

        String jevels = "asdf";
        String stones = "ifgreagijseaieaerffa";

        System.out.println("Результат: " + jevelCounter(jevels, stones));
    }

    private static int jevelCounter(String jevels, String stones){

        int count = 0;

        char[] jevelToChar = new char[jevels.length()];
        for (int i = 0; i < jevelToChar.length; i++) {
            jevelToChar[i] = jevels.charAt(i);
        }

        char[] stoneToChar = new char[stones.length()];
        for (int i = 0; i < stoneToChar.length; i++) {
            stoneToChar[i] = stones.charAt(i);
        }

        for (int i = 0; i < jevelToChar.length; i++) {
            for (int j = 0; j < stoneToChar.length; j++) {
                if (jevelToChar[i] == stoneToChar[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
