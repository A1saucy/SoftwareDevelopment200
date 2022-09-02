/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repeats;

import java.util.Scanner;


public class Repeats {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many times should this run? ");
        int counter = Integer.parseInt(keyboard.next());
        while(counter > 0){
            System.out.println("The loop is runnig " + counter);
            counter--;
        }
        
        System.out.print("How many times should this run? ");
        int timer = Integer.parseInt(keyboard.next());
        do{
            System.out.println("Counting down " + timer);
            timer--;
        }while(timer > 0);
        
        // for loops are iterable
        for (int i= 0 ; i < 11; i++){
            System.out.println("For looping..." +i);
            
        }
        
    }
            
            
            
            
            
            
}
