package Funcionalidades;
import Interfaces.Galeria;
public class Imagens implements Galeria {

    @Override
    public void tirar() {
        System.out.println("Tirar foto.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagar foto.");
    }

    @Override
    public void exibir() {
        System.out.println("Exibir foto.");
    }
}
