// Interface para Reprodutor Musical
public interface ReprodutorMusical {
    void tocarMusica(String musica);
    void pausarMusica();
    void selecionarMusica(String musica);
}

// Interface para Aparelho Telefônico
public interface AparelhoTelefonico {
    void fazerChamada(String numero);
    void receberChamada();
    void encerrarChamada();
}

// Interface para Navegador na Internet
public interface Navegador {
    void navegarPara(String url);
    void atualizarPagina();
    void adicionarFavoritos(String url);
}