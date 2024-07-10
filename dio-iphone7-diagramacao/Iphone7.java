public class Iphone7 {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorNaInternet navegadorNaInternet;

    public Iphone7() {
        this.reprodutorMusical = new ReprodutorMusicalImpl();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorNaInternet = new NavegadorNaInternet();
    }

public void tocarMusica() {
    reprodutorMusical.tocar();
}

public void fazerLigacao(String numero) {
    aparelhoTelefonico.ligar(numero);
}

public void navegarNaWeb(String url) {
    navegadorNaInternet.exibirPagina(url);
}
}