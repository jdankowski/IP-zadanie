/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jakubdankowskiiwm;

/**
 *
 * @author jdankowski
 */
public class JakubDankowskiIwM {

    public class KlasaPensjonariusz {
    String imie;
    String typTerapii;
    int wiek;
    
    KlasaPensjonariusz(String imie, String typTerapii, int wiek){
        this.imie=imie;
        this.typTerapii=typTerapii;
        this.wiek=wiek;
    }
    
    void nadajImie(String imie) {
        
        
        this.imie=imie;
    
        
}
    void nadajtypTerapii(String typTerapii){
        this.typTerapii=typTerapii;
}
    void nadajwiek (int wiek){
        this.wiek=wiek;
    }    
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
