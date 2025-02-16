package com.mentoring.level2.homework3.stringHW;
/*
Дана строка с текстом, в котором есть цифры от 0 до 9.

Написать 2 метода:

- возвращающий массив цифр из переданной строки
- возвращающий сумму цифр из переданного целочисленного массива

Посчитать сумму всех чисел из строки

Например:
“Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {

    public static void main(String[] args) {
        String input = "Привет 9, как 0 2 твои дела? Может4, сделать 3 дело?";
        for (int i : getNumbersOnly(input)) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sumOfNumbers(getNumbersOnly(input)));
//        System.out.println((char) 2);
    }

    private static int[] getNumbersOnly(String input){
        //48-57, можно переделать перебор каждой цифры
        String inputLength = input.replace("0","").replace("1","")
                .replace("2","").replace("3","")
                .replace("4","").replace("5","")
                .replace("6","").replace("7","")
                .replace("8","").replace("9","");
        char[] charString = input.toCharArray();
        int[] result = new int[input.length() - inputLength.length()];
        int index = 0;
        for (char element : charString) {
            if (element == '0' || element == '1' || element == '2' || element == '3' || element == '4'
                    || element == '5' || element == '6' || element == '7' || element == '8' || element == '9') {
                result[index] = Character.getNumericValue(element);
//                result[index] = Integer.parseInt(element+"");
//                result[index] = element;
                index++;
            }
        }
        return result;
    }

    private static int sumOfNumbers(int[] numbersArray) {
        int sum = 0;
        for (int element : numbersArray) {
            sum += element;
        }
        return sum;
    }
    //
}
