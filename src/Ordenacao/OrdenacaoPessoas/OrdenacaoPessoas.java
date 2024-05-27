package Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoas(){
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listPessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public void ordenarPorAltura(double altura) {

    }

    public static void main(String[] args) {
        OrdenacaoPessoas op = new OrdenacaoPessoas();
        op.adicionarPessoa("Filipe", 21, 1.79);
        op.adicionarPessoa("Gabriela", 22, 1.79);
        op.adicionarPessoa("Daniel", 10, 1.79);
        op.adicionarPessoa("Karla",43, 1.79);

        System.out.println(op.ordenarPorIdade());
    }
}