package br.com.alura.screenmatch.modelos;

public class Filme {

    private String nome;
    private int anoDeLancamento, duracaoEmMinutos;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println( "Nome do filme: " + nome);
        System.out.println( "Ano de Lançamento: " + anoDeLancamento);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
