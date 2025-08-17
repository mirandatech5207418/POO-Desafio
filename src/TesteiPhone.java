public class TesteiPhone {
    public static void main(String[] args) {

        iPhone meuiPhone = new iPhone();

        System.out.println("🍎 === TESTANDO O iPHONE (2007) ===\n");


        System.out.println("🎵 === REPRODUTOR MUSICAL ===");
        meuiPhone.selecionarMusica("Time to Dance - The Sounds");
        meuiPhone.tocar();
        meuiPhone.pausar();
        meuiPhone.tocar();

        System.out.println();

        System.out.println("📞 === APARELHO TELEFÔNICO ===");
        meuiPhone.ligar("(11) 99999-8888");
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

        System.out.println("✅ Teste concluído! iPhone funcionando perfeitamente.");
        System.out.println("🚀 Revolução da tecnologia móvel iniciada!");
    }
}