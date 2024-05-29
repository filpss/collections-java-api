package list.CatalogoLivros;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        livrosList = livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) throws ParseException {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro livro : livrosList){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public void exibirLivros() {
        int count = 1;
        for(Livro livro : livrosList) {
            System.out.println(livro.toString());
            count++;
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
            if(!livrosList.isEmpty()){
            for(Livro livro : livrosList) {
            for(int i = anoInicial; i <= anoFinal; i++) {
                    if(livro.getAnoPublicacao() == i) {
                        livrosPorIntervaloAnos.add(livro);
                    }
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro l = null;
        if(!livrosList.isEmpty()) {
            for(Livro livro : livrosList) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    l = livro;
                    break;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) throws ParseException {
        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro("Conhecendo a si mesmo","FILIPE PINHO",1980);
        cl.adicionarLivro("O nome da Rosa", "UMBERTO ECO", 1999);
        cl.adicionarLivro("Misery", "STEPHEN KING", 2003);
        cl.adicionarLivro("It", "STEPHEN KING", 2019);
        cl.adicionarLivro("It", "STEPHEN KING", 2000);


        System.out.println(cl.pesquisarPorTitulo("It"));
    }
}