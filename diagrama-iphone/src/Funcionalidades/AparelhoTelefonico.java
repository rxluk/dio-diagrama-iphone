package Funcionalidades;
import Interfaces.Ligacao;

public class AparelhoTelefonico implements Ligacao {
    @Override
    public void ligar() {
        System.out.println("Ligar.");
    }

    @Override
    public void atender() {
        System.out.println("Atender.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciar Correio de voz.");
    }
}
