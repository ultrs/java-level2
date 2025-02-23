package com.mentoring.level2.homework4.encapsulation;

public class ATM {
    private int nominal10;
    private int nominal20;
    private int nominal50;

    private static final int NOMINAL_10 = 10;
    private static final int NOMINAL_20 = 20;
    private static final int NOMINAL_50 = 50;

    public ATM(int nominal10, int nominal20, int nominal50) {
        this.nominal10 = nominal10;
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
    }

    public void addNominal10(int nominal10) {
        this.nominal10 += nominal10;
    }

    public void addNominal20(int nominal20) {
        this.nominal20 += nominal20;
    }

    public void addNominal50(int nominal50) {
        this.nominal50 += nominal50;
    }
    public int getATMBalance() {
        return this.nominal10 * NOMINAL_10 + this.nominal20 * NOMINAL_20 + this.nominal50 * NOMINAL_50;
    }

    private void operation(int sum) {
        int count50 = Math.min(sum / NOMINAL_50, nominal50);
        int count20 = Math.min((sum - (count50 * NOMINAL_50)) / NOMINAL_20, nominal20);
        int count10 = Math.min((sum - (count50 * NOMINAL_50) - (count20 * NOMINAL_20)) / NOMINAL_20, nominal10);
        this.nominal50 -= count50;
        this.nominal20 -= count20;
        this.nominal10 -= count10;
    }

    public boolean isCorrectOperation(int sum) {
        if (sum <= this.getATMBalance()) {
            operation(sum);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ATM{" +
                "nominal10=" + nominal10 +
                ", nominal20=" + nominal20 +
                ", nominal50=" + nominal50 +
                '}';
    }
    //    public int getNominal10() {
//        return nominal10;
//    }
//
//    public int getNominal20() {
//        return nominal20;
//    }
//
//    public int getNominal50() {
//        return nominal50;
//    }



    //    public boolean isCorrectSum(int Sum) {
//        return Sum <= this.getATMBalance();
//    }

}
