
package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {
    
    private JTextField tulos;
    private JTextField syote;
    private Sovelluslogiikka sovellus;
    
    public Erotus(Sovelluslogiikka sovellus, JTextField tulos, JTextField syote) {
        this.sovellus = sovellus;
        this.tulos = tulos;
        this.syote = syote;
    }

    @Override
    public void suorita() {
        String text = syote.getText();
        int t = Integer.parseInt(text);
        sovellus.miinus(t);
        
        tulos.setText("" + sovellus.tulos());
    }

    @Override
    public void peru() {
        String text = syote.getText();
        int t = Integer.parseInt(text);
        sovellus.plus(t);
        
        tulos.setText("" + sovellus.tulos());
    }
    
}

