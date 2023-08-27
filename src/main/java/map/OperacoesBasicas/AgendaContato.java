package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContatos = new AgendaContato();

        agendaContatos.adicionarContato("Heitor", 123456);
        agendaContatos.adicionarContato("Daiane", 5665);
        agendaContatos.adicionarContato("Daih Barbosa", 1111111);
        agendaContatos.adicionarContato("Jean", 654987);
        agendaContatos.adicionarContato("André", 1111111);
        agendaContatos.adicionarContato("Camila", 44422);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("André");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Daiane"));
    }
}

