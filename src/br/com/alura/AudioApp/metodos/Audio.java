package br.com.alura.AudioApp.metodos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int curtidas;
    private double minutos;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getMinutos() {
        return minutos;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
