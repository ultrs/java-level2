package com.mentoring.level2.homework3.stringHW;
/*
Дана строка.
Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
Результат привести к верхнему регистру.

Например:
"abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {

    public static void main(String[] args) {
        String input = "abc Cpddd Dio OsfWw";
        result(input);
    }

    private static void result(String input) {
        char[] string = input.toUpperCase().replace(" ", "").toCharArray();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < string.length; i++) {
            if (i == 0) {
                output.append(string[i]);
            } else if (string[i] != string[i - 1]) {
                output.append(string[i]);
            }
        }
        System.out.println(output);
    }
}
