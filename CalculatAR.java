package CalculatorAR;
import java.io.IOException;
import java.util.Scanner;

public class CalculatAR {
    static Scanner scan = new Scanner(System.in);
    static int a, c;
    static char b;
    static int result;

    public static void main(String[] args) throws IOException {
        System.out.println("ВВедите выражение");
        String str = scan.nextLine();
        String[] ar = str.split(" ");
        if(ar.length > 3){
            throw new IOException();
        }
        String num1 = ar[0];
        String oper = ar[1];
        String num2 = ar[2];
        a = Rome.convert(num1);
        c = Rome.convert(num2);
        char b = oper.charAt(0);
        if (a < 0 && c < 0) {
            result = 0;
        } else {
            result = Arab.calc1(a, b, c);
            if(result <= 0) {
                throw new IOException();
            }else {
            String roman = Rome.convertRoman(result);
                System.out.println(roman);
            }
        } try {
            a = Integer.parseInt(num1);
            c = Integer.parseInt(num2);
            if (a > 10 || c > 10 || a < 0 || c < 0 ) {
                throw new IOException();
            } else {
                result = Arab.calc1(a, b, c);
                System.out.println(result);
            }
          }catch (NumberFormatException e){

        }
    }
}

