package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Matrix", 2000);
        meuFilme.avalia(7);
        Filme meuFilme2 = new Filme("Avatar", 2010);
        meuFilme2.avalia(8);
        var novoFilme = new Filme("Transformers 8", 2025);
        novoFilme.avalia(10);


        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(novoFilme);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme ) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Uryel Farias ");
        buscaPorArtista.add("Paulo");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);


        System.out.println("Lista de Titulos: " + lista);
        Collections.sort(lista);
        System.out.println("Lista de Titulos Ordenados por NOME: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista de Titulos Ordenados pos ANO: " + lista);



    }
}
