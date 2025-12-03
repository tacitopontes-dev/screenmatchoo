package br.com.tacito.screenmatchoo.modelos;

import br.com.tacito.screenmatchoo.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) obterMedia()/2;
    }
}
