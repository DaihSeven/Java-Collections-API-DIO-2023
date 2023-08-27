package main.java.list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

        public OrdenacaoPessoas() {
            this.pessoaList = new ArrayList<>();
        }

        public void adicionarPessoa(String nome, int idade, double altura) {
            pessoaList.add(new Pessoa(nome, idade, altura));
        }

        public List<Pessoa> ordenarPorIdade() {
            List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
            if (!pessoaList.isEmpty()) {
                Collections.sort(pessoasPorIdade);
                return pessoasPorIdade;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
        }

        public List<Pessoa> ordenarPorAltura() {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            if (!pessoaList.isEmpty()) {
                Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
                return pessoasPorAltura;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
        }

        public static void main(String[] args) {

            OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

            ordenacaoPessoas.adicionarPessoa("Lucca", 20, 1.80);
            ordenacaoPessoas.adicionarPessoa("Bryan", 45, 1.77);
            ordenacaoPessoas.adicionarPessoa("Caterine", 33, 1.70);
            ordenacaoPessoas.adicionarPessoa("Damon", 43, 1.79);

            System.out.println(ordenacaoPessoas.pessoaList);

            System.out.println(ordenacaoPessoas.ordenarPorIdade());

            System.out.println(ordenacaoPessoas.ordenarPorAltura());
        }
}
