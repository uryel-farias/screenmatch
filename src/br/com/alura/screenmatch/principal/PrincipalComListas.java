package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Matrix", 2000);
        meuFilme.avalia(7);
        Filme meuFilme2 = new Filme("Avatar", 2010);
        meuFilme2.avalia(8);
        var novoFilme = new Filme("Transformers 8", 2025);
        novoFilme.avalia(10);
        Serie lost = new Serie("Lost" , 2000);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(novoFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme ) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }

    }
}