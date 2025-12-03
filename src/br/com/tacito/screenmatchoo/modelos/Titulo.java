package br.com.tacito.screenmatchoo.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluindoNoPlano() {
        return incluindoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }
    public void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }
    public double obterMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.tacito.screenmatchoo.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

}