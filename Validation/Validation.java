/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import java.util.Scanner;

/**
 *
 * @author ga87rif
 */
public class Validation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // TODO code application logic here
    /**
     * @param args the command line arguments
     */
    Scanner input = new Scanner(System.in);
    Calculator Calculator = new Calculator();

    double answer = 0;
    int number1 = 0, number2 = 0;
    double operator;
    boolean Valid;
    boolean error = false;
    
    // this is to request the choice of the operation (add/substract/multiply/divide)
   do{
    Valid = true;
        System.out.println("Operation Number:");
        System.out.println("Add = 1");
        System.out.println("Substract = 2");
        System.out.println("Multiply = 3");
        System.out.println("Divide = 4");
        System.out.println("Please enter the operation number: ");
        operator = input.nextInt();
        if (operator > 4 || operator < 1)
        {
        System.out.println("Please enter an operation number between 1 and 4");
        Valid = false;
        }
    } while (Valid == false);     

   // this is to validate that number1 is integer, if not, a message will appear
    do{
    Valid = true;
    System.out.println("Please enter first number:  ");
    if(!input.hasNextInt()) {
            System.out.println("Invalid input!");
            System.out.print("Enter a valid integer number: ");
            input.next();
            Valid = false;
        }
      else number1 = input.nextInt();
    } while (Valid == false);  

    // this is to validate that number2 is integer, if not, a message will appear
   do{
    Valid = true;
     System.out.println("Please enter second number: ");
     if(!input.hasNextInt()) {
            System.out.println("Invalid input!");
            System.out.print("Enter a valid integer number: ");
            input.next();
            Valid = false;
        }
        else number2 = input.nextInt();
     } while (Valid == false);  
     
     
     // this if else function is used to call the operation from the class "Calculator"
        if (operator == 1) 
            {
                answer = Calculator.Add(number1, number2);
                }
        else if (operator == 2)  {
                answer = Calculator.Substract(number1, number2);
                }
        else if (operator == 3)   { 
                answer = Calculator.Multiply(number1, number2);
                }
        else if (operator == 4)  {  
                answer = Calculator.Divide(number1, number2);
                }
        System.out.println(answer);         
    }
    
}
