import java.util.ArrayList;

public class Equipe {
    private String nome;
    private ArrayList<Usuario> membros;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        membros.add(usuario);
    }

    public void listarMembros() {
        System.out.println("Equipe: " + nome);
        for (Usuario u : membros) {
            System.out.println("- " + u.getNome());
        }
    }
}