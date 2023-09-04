package Funcionalidades;
import Interfaces.Navegador;
public class NavegadorNaInternet implements Navegador {


    @Override
    public void exibirPagina() {
        System.out.println("Exibir pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina.");
    }
}
