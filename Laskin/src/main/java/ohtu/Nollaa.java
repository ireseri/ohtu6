
package ohtu;

import javax.swing.JTextField; 


public class Nollaa implements Komento {
    
    private JTextField tulos;
    private JTextField syote;
    private String tulostalteen;
    private Sovelluslogiikka sovellus;
    
    public Nollaa(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus = sovellus;
        this.tulos = tulos;
        this.syote = syote;
        this.tulostalteen = "";
    }

    @Override
    public void suorita() {
        tulostalteen = tulos.getText();
        sovellus.nollaa();

        tulos.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() { 
        int t = Integer.parseInt(tulostalteen);
        sovellus.plus(t);
        
        tulos.setText("" + sovellus.tulos());
    }
    
}

