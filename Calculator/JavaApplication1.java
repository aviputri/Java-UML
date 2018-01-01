/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ga87rif
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number1, number2, number3, result, a;
        number1 = 14;
        number2 = 12;
        number3 = 3;
        result = number1 + number2 * number3;
        System.out.println("Result: " + result);
        a = Add(number1, number2);
        System.out.println("Result: " + a);
    }
    public static double Add(double number1, double number2){
        return number1+number2;
    }
    public static double Substract(double number1, double number2){
        return number1-number2;
    }
    public static double Multiply(double number1, double number2){
        return number1*number2;
    }
    public static double Divide(double number1, double number2){
        return number1/number2;
    }
}
