
package ohtu;

public class Sovelluslogiikka {
    
    public Sovelluslogiikka() {
        
    }
 
    private int tulos;
 
    public void plus(int luku) {
        tulos += luku;
    }
     
    public void miinus(int luku) {
        tulos -= luku;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }
    
    
}
