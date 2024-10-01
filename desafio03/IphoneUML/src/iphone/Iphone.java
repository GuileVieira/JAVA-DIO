package iphone;
import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    private void verificaInternet(){
        System.out.println("Verificando internet");
    }

    public void bloquearIphone(){
        System.out.println("Iphone bloqueado");
    }
    
    public void desbloquearIphone(){
        System.out.println("Iphone desbloqueado");
    }

    //NAVEGADOR INTERNET
    @Override
    public void exibirPagina(String url) {
        verificaInternet();
        System.out.println("Pagina exibida: " + url);
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    @Override
    public void atualizarPagina() {
        verificaInternet();
        System.out.println("Pagina web atualizada");
    }
    //REPRODUTOR MUSICAL
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
        tocar();
    }

    //APARELHO TELEFONICO
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
