package br.com.alura.AudioApp.metodos;

public class MinhasFavoritas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >=8){
            System.out.println( audio.getTitulo()  + "  está entre as mais curtidas");
        }else{
            System.out.println(audio.getTitulo()  + " entre as melhores");
        }
    }
}
