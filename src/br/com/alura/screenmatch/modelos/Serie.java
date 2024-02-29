package br.com.alura.screenmatch.modelos;

public class Serie extends  Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodioPorTeporada;
    private int minutosPorEpisodio;

    public Serie(String nomeDaSerie, int anoDeLancamento) {
        super(nomeDaSerie, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEpisodioPorTeporada() {
        return episodioPorTeporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodioPorTeporada(int episodioPorTeporada) {
        this.episodioPorTeporada = episodioPorTeporada;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTeporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
