package org.example;

public class ReprodutoFacade {

    private ReprodutorAudio reprodutorAudio;
    private Codec codec;

    public ReprodutoFacade() {
        this.reprodutorAudio = new ReprodutorAudio();
        this.codec = new Codec();
    }

    public void reproduzirAudio(String nomeArquivo) {
        codec.decodificar(nomeArquivo);
        reprodutorAudio.reproduzir(nomeArquivo);
    }

}
