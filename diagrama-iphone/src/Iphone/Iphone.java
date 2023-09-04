package Iphone;
import Funcionalidades.ReprodutorMusical;
import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.Imagens;
import Funcionalidades.NavegadorNaInternet;

public class Iphone {

    public static void main(String[] args) {

        Imagens cam = new Imagens();
        AparelhoTelefonico tel = new AparelhoTelefonico();
        ReprodutorMusical music = new ReprodutorMusical();
        NavegadorNaInternet nav = new NavegadorNaInternet();

        System.out.println("Utilizando a camera:");
        cam.tirar();
        cam.exibir();
        cam.apagar();
        System.out.println(" ");
        System.out.println("Utilizando o reprodutor musical: ");
        music.selecionarMusica();
        music.tocar();
        music.pausar();
        System.out.println(" ");
        System.out.println("Utilizando o aparelho telefonico: ");
        tel.atender();
        tel.iniciarCorreioDeVoz();
        tel.ligar();
        System.out.println(" ");
        System.out.println("Utilizando o navegador na internet: ");
        nav.adicionarNovaAba();
        nav.exibirPagina();
        nav.atualizarPagina();
    }
}
