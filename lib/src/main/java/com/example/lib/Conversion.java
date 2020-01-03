package com.example.lib;

import java.util.Scanner;

public class Conversion {
    Scanner scanner = new Scanner(System.in);
    private String Decimal = "";
    private char Sample[][] = {{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'},
            {'0', '1'}, {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}};
    private String Binary = "";
    private String Hexadecimal = "";

    public void setDecimal(String decimal) {
        Decimal = decimal;
    }

    public void setBinary(String binary) {
        Binary = binary;
    }

    public void setHexadecimal(String hexadecimal) {
        Hexadecimal = hexadecimal;
    }

    public void DecimalConversion() {
        System.out.println("enter a Decimal");
        setDecimal(scanner.next());
        if (Judge("Decimal", Decimal) == false)
            System.out.println("error");

        else {
            int DecimalInt = Integer.parseInt(Decimal);
            Binary = Integer.toBinaryString(DecimalInt);
            Hexadecimal = Integer.toHexString(DecimalInt);
            System.out.println("Binary:"+Binary);
            System.out.println("Hexadecimal:"+Hexadecimal);
        }
    }
    public void BinaryConversion() {
        System.out.println("enter a Binary");
        setBinary(scanner.next());
        if (Judge("Binary", Binary) == false)
            System.out.println("error");

        else {
            int DecimalInt = Integer.valueOf(Binary,2);
            Decimal = Integer.toString(DecimalInt);
            Hexadecimal = Integer.toHexString(DecimalInt);
            System.out.println("Decimal:"+Decimal);
            System.out.println("Hexadecimal:"+Hexadecimal);
        }
    }
    public void HexadecimalConversion() {
        System.out.println("enter a Hexadecimal");
        setHexadecimal(scanner.next());
        if (Judge("Hexadecimal", Hexadecimal) == false)
            System.out.println("error");

        else {
            int DecimalInt = Integer.valueOf(Hexadecimal,16);
            Decimal = Integer.toString(DecimalInt);
            Binary = Integer.toBinaryString(DecimalInt);
            System.out.println("Decimal:"+Decimal);
            System.out.println("Binary:"+Binary);
        }
    }


    public boolean Judge(String Type, String Number) {
        boolean JudgeBoolean = true;
        int k = -1;
        int length = 0;
        if (Type.matches("Decimal")) {
            k = 0;
            length = 10;
        } else if (Type.matches("Binary")) {
            k = 1;
            length = 2;
        } else if (Type.matches("Hexadecimal")) {
            k = 2;
            length = 16;
        }
        if (k == 0 || k == 1 || k == 2) {
            for (int i = Number.length() - 1; i >= 0; i--) {
                int JudgeCount = 0;
                for (int j = 0; j < length; j++) {
                    if (Number.charAt(i) != Sample[k][j]) {
                        JudgeCount++;
                    }
                    if (JudgeCount == length) {
                        JudgeBoolean = false;
                    }
                }
            }
        } else
            JudgeBoolean = false;

        return JudgeBoolean;
    }

}