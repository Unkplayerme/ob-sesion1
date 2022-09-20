package com.example;

public class Main {
    public static void main(String[] args) {
        double price = 100.0;
        System.out.println("Total a pagar IVA incluido: " + getIVA(price));
    }

    private static double getIVA(double price) {
        return price + (price * (21.0/100.0));
    }
}