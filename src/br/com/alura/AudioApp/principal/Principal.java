package br.com.alura.AudioApp.principal;

import br.com.alura.AudioApp.metodos.MinhasFavoritas;
import br.com.alura.AudioApp.metodos.Musicas;
import br.com.alura.AudioApp.metodos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musicas musica = new Musicas();
        musica.setTitulo("Desgraça do dia");
        musica.setAnoFormacao(2021);
        musica.setBanda("Feitiço Oculto");
        musica.setPais("Brasil");
        musica.setGenero("Black/Thrash Metal");


        for (int i = 0; i < 1000; i++) {
                musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();

        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Mano a Mano");
        podcast.setAssunto("Entrevista");
        podcast.setEpisodio(1);
        podcast.setLocutor("Mano Brown");

        for (int i = 0; i < 2000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 5000; i++) {
            podcast.curte();
        }

        MinhasFavoritas favoritas = new MinhasFavoritas();
        favoritas.inclui(podcast);
        favoritas.inclui(musica);

    }
}
