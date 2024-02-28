import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Serie lost = new Serie("Lost" , 2000);
        lost.setTemporadas(7);
        lost.setEpisodioPorTeporada(10);
        lost.setMinutosPorEpisodio(15);

        Filme meuFilme = new Filme("Avatar", 2010);
        meuFilme.setDuracaoEmMinutos(180);

        Filme meuFilme2 = new Filme("Matrix", 2000);
        meuFilme2.setDuracaoEmMinutos(120);


        var novoFilme = new Filme("Transformers 8", 2025);
        novoFilme.setDuracaoEmMinutos(220);
        novoFilme.avalia(8);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);

        System.out.println(listaDeFilmes);
        System.out.println("O primeiro filme da lista é: " + listaDeFilmes.get(0).toString());




    }
}
