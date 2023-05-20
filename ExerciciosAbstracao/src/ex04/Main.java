package ex04;

public class Main {
    public static void main(String[] args) {
        ArquivoTexto arquivoTexto = new ArquivoTexto();
        arquivoTexto.abrir();
        arquivoTexto.fechar();

        ArquivoImagem arquivoImagem = new ArquivoImagem();
        arquivoImagem.abrir();
        arquivoImagem.fechar();

        ArquivoAudio arquivoAudio = new ArquivoAudio();
        arquivoAudio.abrir();
        arquivoAudio.fechar();
    }
}
