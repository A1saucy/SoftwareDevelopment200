/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primitives;

/**
 *
 * @author soitguest
 */
public class Primitives {


    public static void main(String[] args) {
        byte b1 = 123;
        short s1 = 14567;
        int i = 145678;
        long big = 1234567898765L;
        
        double dub = 12.0/3.0;
        float flt = 1.07f;
        boolean otherFlag = false;
        char startOfAlphabet = 'A';
        String someWords = "Hello World";
        
        //math: + - ^ * / %
        
        //division
        
        int x, y;
        double w, v;
        
        x = 4;
        y = 3;
        w = 2.34;
        v = 5.76;
        
        System.out.println(x/y);
        System.out.println(w/v);
        System.out.println(x/w);
        System.out.println(x/3.0); //If you want fractional part include decimals
        System.out.println((double)x/y);
        
        
        System.out.println("8 bits of data to store " + b1 + ".");
        System.out.println("16 bits of data to store " + s1 + ".");
        System.out.println("32 bits of data to store "+ i + ".");
        System.out.println("64 bits of data to store "+ big + ".");
        System.out.println("A 64 bit real number "+ dub + ".");
        System.out.println("A 32 bit float number " + flt + ".");
        System.out.println("A single letter: " + startOfAlphabet + ".");
        System.out.println("A string: " + someWords + ".");
        
        
        
        
    }
    
}
