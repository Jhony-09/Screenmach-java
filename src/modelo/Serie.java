package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporadas;
    private int duracionPorEpisodio;

    public int getDuracionPorEpisodio() {
        return duracionPorEpisodio;
    }

    public void setDuracionPorEpisodio(int duracionPorEpisodio) {
        this.duracionPorEpisodio = duracionPorEpisodio;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracion() {
        return duracionPorEpisodio * episodiosPorTemporadas * temporadas;
    }
}
