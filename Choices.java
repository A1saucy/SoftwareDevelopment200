/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package choices;

import java.util.*;

public class Choices {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Gimme a whole number!!: ");
        int userNumber = Integer.parseInt(keyboard.next());
        
        if(userNumber < 5){
            System.out.println("That's a small number");    
        }
        else if(userNumber==7){
            System.out.println("That's a seven");
        }
        else{
            System.out.println("That's a big number");
        }
        
        System.out.print("Enter a grade: ");
        char grade = keyboard.next().charAt(0);
        
        
        switch (grade){
            case 'A':
            case 'a':
                System.out.println("Great job");
                break;
            case 'B':
            case 'b':
                System.out.println("Nice");
                break;
            case 'C':
            case 'c':
                System.out.println("Not bad");
                break;
            case 'D':
            case 'd':
                System.out.println("Needs improvement");
                break;
            default:
                System.out.println("That's a problem");
                break;
                
        }
        
         /*
          * and &&
          * or ||
          * not !
          * bitwise &
          * bitwise or |
          * bitwise xor ^
          *
          */   
         
        boolean show = false;
         if(show){
             System.out.println("It shows");
         }
         else{
             System.out.println("Can't see it");
         }
         
         
    }
}
