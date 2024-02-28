import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Avatar");
        //meuFilme.setNome("Avatar");
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme("Matrix");
        //meuFilme2.setNome("Matrix");
        meuFilme2.setDuracaoEmMinutos(120);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(7);
        lost.setEpisodioPorTeporada(10);
        lost.setMinutosPorEpisodio(15);
        //lost.exibeFichaTecnica();
        //System.out.println("Duração para maratonar essa serie: " + lost.getDuracaoEmMinutos());

        var novoFilme = new Filme("Transformers 8");
        //novoFilme.setNome("Transformers 8");
        novoFilme.setDuracaoEmMinutos(220);
        novoFilme.setAnoDeLancamento(2025);
        novoFilme.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);

        System.out.println(listaDeFilmes);
        System.out.println("O primeiro filme da lista é: " + listaDeFilmes.get(0).toString());




    }
}
