package br.com.tacito.screenmatchoo.calculos;
import br.com.tacito.screenmatchoo.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {

        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }



}
