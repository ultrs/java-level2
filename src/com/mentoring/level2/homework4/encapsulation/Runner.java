package com.mentoring.level2.homework4.encapsulation;
/*
Создать класс, описывающий банкомат.

Банкомат задается тремя свойствами:
- количеством купюр номиналом 10, 20 и 50.

Создать конструктор с тремя параметрами - количеством купюр каждого номинала.

Сделать методы для добавления денег в банкомат.

Сделать метод, снимающий деньги: он принимает сумму денег, а возвращает булево значение - успешность выполнения операции.

При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат
будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные
варианты выдачи наличных, чтобы не усложнять алгоритм).
 */

public class Runner {

    public static void main(String[] args) {
        ATM atm1 = new ATM(10, 10, 10);
        System.out.println(atm1.toString());
        System.out.println(atm1.getATMBalance());
        atm1.addNominal50(5);
        System.out.println(atm1.toString());
        System.out.println();
        System.out.println(atm1.isCorrectOperation(400));
        System.out.println(atm1.toString());
        System.out.println();
        System.out.println(atm1.isCorrectOperation(630));
        System.out.println(atm1.toString());
        System.out.println();
        System.out.println(atm1.isCorrectOperation(100));
        System.out.println(atm1.toString());
    }
}
