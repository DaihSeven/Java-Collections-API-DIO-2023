package main.java.set.Pesquisa;
import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contato c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Jean", 123456789);
        agendaContatos.adicionarContato("Samira", 987654321);
        agendaContatos.adicionarContato("Fernando", 59999995);
        agendaContatos.adicionarContato("Paula", 88222299);
        agendaContatos.adicionarContato("Fernando Silva", 77771111);
        agendaContatos.adicionarContato("Helena", 55554444);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Samira"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Helena", 99993333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
}
