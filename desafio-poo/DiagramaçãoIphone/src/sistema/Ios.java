package sistema;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Ios implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{
    public void ligar(String contato) {
        System.out.println("Ligando para " + contato);
    }

    public void atender() {
        pausar();
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Enviando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo pagina atual");
    }

    public void adicionarNovaAba(String aba) {
        System.out.println("Adicionando " + aba + " a lista de abas abertas");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    public void tocar() {
        System.out.println("Tocando musica atual");
    }

    public void pausar() {
        System.out.println("Pausando musica atual");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Tocando " + musica);
    }
}
