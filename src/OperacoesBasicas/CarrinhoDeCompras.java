package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> ItemList;

    public CarrinhoDeCompras() {
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        ItemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item item : ItemList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        ItemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double somaTotal = 0;
        for(Item item : ItemList){
            somaTotal += (item.getPreco() * item.getQuantidade());
        }
        return somaTotal;
    }

    public void exibirItens(){
        for(Item item : ItemList){
            System.out.println("Item: " + item.getNome() + ", " + item.getPreco() + ", " + item.getQuantidade() );
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();

        // Testar os métodos aqui!
    }
}