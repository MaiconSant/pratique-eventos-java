public class Projeto {
    private String nome;
    private String descricao;
    private String status;

    public Projeto(String nome, String descricao, String status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public void exibirProjeto() {
        System.out.println("Projeto: " + nome);
        System.out.println("Status: " + status);
    }
}