public class Main {
    public static void main(String[] args) {

        iPhone meuiPhone = new iPhone();

        System.out.println("🍎 === DEMONSTRAÇÃO DO iPHONE (2007) ===\n");


        System.out.println("🎵 === REPRODUTOR MUSICAL ===");
        meuiPhone.selecionarMusica("Time to Dance - The Sounds");
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.tocar();

        System.out.println();


        System.out.println("📞 === APARELHO TELEFÔNICO ===");
        meuiPhone.ligar("(22) 99999-8888");
        meuiPhone.atender();
        meuiPhone.desligarChamada();
        meuiPhone.iniciarCorreioVoz();

        System.out.println();


        System.out.println("🌐 === NAVEGADOR INTERNET ===");
        meuiPhone.exibirPagina("https://www.apple.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.exibirPagina("https://www.google.com");
        meuiPhone.atualizarPagina();


        meuiPhone.exibirStatus();

        System.out.println("✅ Demonstração concluída! iPhone funcionando perfeitamente.");
        System.out.println("🚀 \"Today, Apple is going to reinvent the phone!\" - Steve Jobs");


        System.out.println("\n🔄 === DEMONSTRANDO POLIMORFISMO ===");

        ReprodutorMusical reprodutor = meuiPhone;
        AparelhoTelefonico telefone = meuiPhone;
        NavegadorInternet navegador = meuiPhone;

        reprodutor.selecionarMusica("Another Brick in the Wall - Pink Floyd");
        telefone.ligar("0800-123-4567");
        navegador.exibirPagina("https://www.dio.me");

        System.out.println("✨ Um único dispositivo, múltiplas funcionalidades!");
    }
}