public class Main {
    public static void main(String[] args) {

        // Criando usuários
        Usuario u1 = new Usuario("Maicon", "123456", "maicon@email.com", "Gerente");
        Usuario u2 = new Usuario("João", "789101", "joao@email.com", "Colaborador");

        // Criando projeto
        Projeto projeto = new Projeto("Sistema de Gestão", "Controle de projetos", "Em andamento");

        // Criando equipe
        Equipe equipe = new Equipe("Equipe TI");
        equipe.adicionarMembro(u1);
        equipe.adicionarMembro(u2);

        // Exibindo dados
        u1.exibirDados();
        projeto.exibirProjeto();
        equipe.listarMembros();

        System.out.println("Sistema executado com sucesso!");
    }
}