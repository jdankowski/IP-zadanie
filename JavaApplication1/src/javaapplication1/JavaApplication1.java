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
        Uczen U1=new Uczen("Jakub","Dankowski", 20);
        Uczen U2=new Uczen("Jan", "Kowalski", 6);
        
        System.out.println(U1.klasa);
        System.out.println(U2.klasa);
        U1.przypiszDoKlasy(8);
        System.out.println(U1.klasa);
        U2.przypiszDoKlasy(1);
        System.out.println(U2.klasa);
    }   
    
}
