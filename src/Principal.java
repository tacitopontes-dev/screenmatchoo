import br.com.tacito.screenmatchoo.calculos.CalculadoraDeTempo;
import br.com.tacito.screenmatchoo.calculos.FiltroRecomendacao;
import br.com.tacito.screenmatchoo.modelos.Episodio;
import br.com.tacito.screenmatchoo.modelos.Filme;
import br.com.tacito.screenmatchoo.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Batman o Cavaleiro das Trevas");
        meuFilme.setAnoDeLancamento(2008);
        meuFilme.setDuracaoEmMinutos(152);


        Serie serie1 = new Serie();
        serie1.setNome("Prison Break");
        serie1.setAnoDeLancamento(2005);
        serie1.setMinutosPorEpisodio(44);
        serie1.setTemporadas(5);
        serie1.setEpisodiosPorTemporada(18);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.obterMedia());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Até o Ultimo Homen");
        meuFilme2.setAnoDeLancamento(2016);
        meuFilme2.setDuracaoEmMinutos(139);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(serie1);
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var meuFilme3 = new Filme();
        meuFilme3.setNome("Marley e Eu");
        meuFilme3.setAnoDeLancamento(2008);
        meuFilme3.setDuracaoEmMinutos(115);
        meuFilme3.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(meuFilme3);
        System.out.println("Tamanho da lista:  " + listaDeFilmes.size());
        System.out.println("Primeiro Filme : " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);




    }
}
