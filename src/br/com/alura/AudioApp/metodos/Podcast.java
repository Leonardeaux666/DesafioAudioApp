package br.com.alura.AudioApp.metodos;

public class Podcast extends Audio {
    private String nomePodcast;
    private String locutor;
    private String assunto;
    private int temporadas;
    private int episodio;

    public String getNomePodcast() {
        return nomePodcast;
    }

    public void setNomePodcast(String nomePodcast) {
        this.nomePodcast = nomePodcast;
    }

    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }
    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 5000) {
            return 10;
        }else{
            return 7;
        }

    }
}
