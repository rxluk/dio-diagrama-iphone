package Funcionalidades;
import Interfaces.Musica;

public class ReprodutorMusical implements Musica {
    @Override
    public void tocar() {
        System.out.println("Tocar musica.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar musica.");
    }
}
