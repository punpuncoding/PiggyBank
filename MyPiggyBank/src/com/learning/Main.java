package com.learning;

public class Main {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank("Pun pun");
        piggy.addMoney(50);
        piggy.addMoney(20);
        piggy.showMoney();
    }
}
