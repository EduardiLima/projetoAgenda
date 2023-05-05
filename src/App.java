
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opção = 0;

        AgendaContatos agenda = new AgendaContatos(100);

        while (opção != 3) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Incluir pessoa");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Sair");
            opção = sc.nextInt();

            switch (opção) {
                case 1:
                agenda.incluirPessoa();
                break;
            case 2:
                agenda.listarContatos();
                break;
            case 3:
                System.out.println("Encerrando programa...");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;   
            }
        }

        sc.close();
    }
}
