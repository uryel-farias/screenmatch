import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(7);
        lost.setEpisodioPorTeporada(10);
        lost.setMinutosPorEpisodio(15);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar essa serie: " + lost.getDuracaoEmMinutos());



    }
}
