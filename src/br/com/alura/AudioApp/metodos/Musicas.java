package br.com.alura.AudioApp.metodos;

public class Musicas extends Audio {
    private String pais;
    private int anoFormacao;
    private String genero;
    private String banda;


    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnoFormacao(int i) {
        return anoFormacao;
    }

    public void setAnoFormacao(int anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 200) {
            return 10;
        }else{
            return 7;
        }

    }
}
