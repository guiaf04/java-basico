import sistema.*;;

public class Iphone{
    public static void main(String[] args) throws Exception {
        Ios ios = new Ios();

        ios.tocar();
        ios.atender();
        ios.atualizarPagina();
        ios.adicionarNovaAba("youtube");
        ios.ligar("dio");
        ios.iniciarCorreioVoz();
    }
}
