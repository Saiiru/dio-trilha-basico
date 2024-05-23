// Classe principal que implementa todas as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    // Métodos do Reprodutor Musical
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    // Métodos do Navegador
    @Override
    public void navegarPara(String url) {
        System.out.println("Navegando para: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    @Override
    public void adicionarFavoritos(String url) {
        System.out.println("Adicionado aos favoritos: " + url);
    }

    // Método comum
    public String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone("iPhone 12");
        meuIphone.tocarMusica("Minha Música Favorita");
        meuIphone.fazerChamada("123-456-7890");
        meuIphone.navegarPara("https://www.example.com");
    }
}