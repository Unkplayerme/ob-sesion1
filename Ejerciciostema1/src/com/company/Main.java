package com.company;

public class Main {
    public static void main(String[] args) {

        //Enteros
        System.out.println("ENTEROS");
        byte miByte = 1;
        short miShort = 10;
        int miInt = 39780;
        long miLong = 1596000;

        System.out.println("byte: " + miByte + "\n" + "short: " + miShort + "\n" + "int: " + miInt + "\n" + "long: " + "\n" + miLong + "\n");


        //Decimales
        System.out.println("DECIMALES");
        float miFloat = 5.56F;
        double miDouble = 21.7D;

        System.out.println("float: " + miFloat + "\n" + "double: " + miDouble + "\n");

        //Booleanos
        System.out.println("BOOLEANS");
        boolean miYes = true;
        boolean miNot = false; System.out.println();

        System.out.println("boolean: " + miYes + "\n" + "boolean: " + miNot + "\n");

        //Texto
        System.out.println("TEXTO");
        char miChar = 'a';
        String miString = "abcdefghijklmnñopqrstuvwxyz";

        System.out.println("char: " + miChar + "\n" + "String: " + miString);
    }
}