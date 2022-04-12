package CalculatorAR;

import java.io.IOException;
import java.util.Scanner;

public class Rome {
    static String convertRoman (int numArab) throws IOException {
        String[] x = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        String s = x[numArab];
        return s;
    }
    public static int convert(String x) throws IOException{
        try {
            if (x.equals("I")) {
                return 1;
            } else if (x.equals("II")) {
                return 2;
            } else if (x.equals("III")) {
                return 3;
            } else if (x.equals("IV")) {
                return 4;
            } else if (x.equals("V")) {
                return 5;
            } else if (x.equals("VI")) {
                return 6;
            } else if (x.equals("VII")) {
                return 7;
            } else if (x.equals("VIII")) {
                return 8;
            } else if (x.equals("IX")) {
                return 9;
            } else if (x.equals("X")) {
                return 10;
            }
        }catch (Exception e){

        }
        return -1;
    }
}