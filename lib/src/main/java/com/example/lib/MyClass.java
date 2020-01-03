package com.example.lib;


import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversion conversion = new Conversion();
        conversion.DecimalConversion();
        conversion.BinaryConversion();
        conversion.HexadecimalConversion();

    }
}