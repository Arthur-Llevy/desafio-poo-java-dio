package iphone;

import iphone.reprodutorMusical.ReprodutorMusical;
import iphone.navegadorInternet.NavegadorInternet;
import iphone.aparelhoTelefonico.AparelhoTelefonico;

public class Iphone {

    public static void main(String[] args) {
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorInternet navegadorInternet = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
        aparelhoTelefonico.ligar("9999-9999");
        
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
        navegadorInternet.exibirPagina("url");
        
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("música");
        reprodutorMusical.tocar();
    }
    
}
