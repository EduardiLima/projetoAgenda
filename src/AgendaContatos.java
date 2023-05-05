
import java.util.ArrayList;
import java.util.Scanner;;

public class AgendaContatos {
    private ArrayList<Pessoa> contatos;
    private int maxContatos;

    public AgendaContatos(int maxContatos) {
        this.maxContatos = maxContatos;
        this.contatos = new ArrayList<Pessoa>();
    }

    public void incluirPessoa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.next();
        System.out.println("Digite o sobrenome da pessoa:");
        String sobrenome = sc.next();
        System.out.println("Digite o telefone da pessoa:");
        String telefone = sc.next();

        Pessoa pessoa = new Pessoa(nome, sobrenome, telefone);
        if (contatos.size() < maxContatos) {
            contatos.add(pessoa);
            System.out.println("Pessoa adicionada com sucesso! ");
        }  else {
            System.out.println("Limite maximo de contatos atingido!");
        }

        sc.close();
    }

    public void listarContatos() {
    }
}
