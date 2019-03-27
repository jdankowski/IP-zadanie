/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author jdankowski
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Uczen U2=new Uczen("Jan", "Kowalski", 6);
        
        
        
        
       
        
        System.out.println(U2.klasa);
        
        Uczen U3=new Uczen ("Adam", "Malysz", 3);
        
        System.out.println(U3.imie);
        U3.nadajImie("Zdzisław");
        System.out.println(U3.imie);
    }  
   
    
}
