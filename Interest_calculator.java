/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest_calculator;
import java.util.*;
/**
 *
 * @author semasuka
 */
public class Interest_calculator {

   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double principle;
        double rate= .07;
        double amount;
        int year;
        
        System.out.println("enter your principle:");
        principle=input.nextDouble();
        for(year=1;year<=10;year++){
            amount= principle * Math.pow(1+rate, year);
            System.out.printf("\nfor year "+year+" the amout to be payback is Ksh "+"%.3f",amount);
        }
    }
    
}
