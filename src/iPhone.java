public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    private String musicaAtual;
    private String paginaAtual;
    private boolean chamadaAtiva;
    private boolean musicaTocando;

    public iPhone() {
        this.musicaAtual = "";
        this.paginaAtual = "";
        this.chamadaAtiva = false;
        this.musicaTocando = false;
    }

    @Override
    public void tocar() {
        if (!musicaAtual.isEmpty()) {
            musicaTocando = true;
            System.out.println("▶️ Tocando música: " + musicaAtual);
        } else {
            System.out.println("❌ Nenhuma música selecionada");
        }
    }

    @Override
    public void pausar() {
        if (musicaTocando) {
            musicaTocando = false;
            System.out.println("⏸️ Música pausada");
        } else {
            System.out.println("❌ Nenhuma música está tocando");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("🎵 Música selecionada: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        chamadaAtiva = true;
        System.out.println("📞 Ligando para: " + numero);
        System.out.println("🔊 Chamada em andamento...");
    }

    @Override
    public void atender() {
        if (chamadaAtiva) {
            System.out.println("📱 Chamada atendida!");
        } else {
            System.out.println("❌ Não há chamadas para atender");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📧 Iniciando correio de voz...");
        System.out.println("🎤 Grave sua mensagem após o sinal...");
    }

    @Override
    public void exibirPagina(String url) {
        this.paginaAtual = url;
        System.out.println("🌐 Exibindo página: " + url);
        System.out.println("📱 Página carregada com sucesso!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("➕ Nova aba adicionada");
        System.out.println("📑 Você agora tem múltiplas abas abertas");
    }

    @Override
    public void atualizarPagina() {
        if (!paginaAtual.isEmpty()) {
            System.out.println("🔄 Atualizando página: " + paginaAtual);
            System.out.println("✅ Página atualizada!");
        } else {
            System.out.println("❌ Nenhuma página para atualizar");
        }
    }

    public void desligarChamada() {
        if (chamadaAtiva) {
            chamadaAtiva = false;
            System.out.println("📵 Chamada encerrada");
        }
    }

    public void exibirStatus() {
        System.out.println("\n📊 === STATUS DO iPHONE ===");
        System.out.println("🎵 Música atual: " + (musicaAtual.isEmpty() ? "Nenhuma" : musicaAtual));
        System.out.println("🎶 Tocando: " + (musicaTocando ? "Sim" : "Não"));
        System.out.println("📞 Chamada ativa: " + (chamadaAtiva ? "Sim" : "Não"));
        System.out.println("🌐 Página atual: " + (paginaAtual.isEmpty() ? "Nenhuma" : paginaAtual));
        System.out.println("========================\n");
    }
}