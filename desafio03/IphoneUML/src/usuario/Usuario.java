package usuario;

import iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iPhone = new Iphone();

        iPhone.desbloquearIphone();

        //Atender ligacao
        iPhone.atender();
        //ligação caiu mas teve um recado 
        iPhone.iniciarCorreioVoz();
        //Precisou ligar para joazinho
        iPhone.ligar("(15) 9999-9999");
        
        //Quis ouvir musica
        iPhone.selecionarMusica("Uma musica qualquer");
        //Pausou par ai almoçar
        iPhone.pausar();
        //voltou a tocar a música
        iPhone.tocar();

        //Quis ver as noticias para matar o tempo
        iPhone.exibirPagina("https://noticias.xpto");

        //aproveitou para ver a temperatura em uma nova aba
        iPhone.adicionarNovaAba();
        iPhone.exibirPagina("https://temperatura.xpto");

        //atualizou a página depois de 10 min para ver a temperatura de novo (começou a chover)
        iPhone.atualizarPagina();

        //Chega por hoje
        iPhone.pausar();
        iPhone.bloquearIphone();
    }
}
