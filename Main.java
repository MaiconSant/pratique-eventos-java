import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sistema sistema = new Sistema();

        while (true) {
            System.out.println("\n1 - Cadastrar evento");
            System.out.println("2 - Listar eventos");
            System.out.println("3 - Participar");
            System.out.println("4 - Cancelar participação");
            System.out.println("5 - Meus eventos");
            System.out.println("0 - Sair");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("Categoria: ");
                    String categoria = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Data (AAAA-MM-DDTHH:MM): ");
                    String data = sc.nextLine();

                    LocalDateTime horario = LocalDateTime.parse(data);

                    Evento evento = new Evento(nome, endereco, categoria, horario, descricao);
                    sistema.cadastrarEvento(evento);
                    break;

                case 2:
                    sistema.listarEventos();
                    break;

                case 3:
                    System.out.print("Index do evento: ");
                    int i = sc.nextInt();
                    sistema.participarEvento(i);
                    break;

                case 4:
                    System.out.print("Index: ");
                    int j = sc.nextInt();
                    sistema.cancelarParticipacao(j);
                    break;

                case 5:
                    sistema.meusEventos();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}