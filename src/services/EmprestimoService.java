package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class EmprestimoService {
    
    public static Biblioteca efetuarEmprestimo(Scanner in, Biblioteca library){
        System.out.println(
            "Usuário é assinante?\n"
            + "1 - sim ou 0 - não"
        );
        boolean isSubscriber = (in.nextInt() == 1) ? true : false;
        Usuario user = new Usuario(in.nextLine(), in.nextLine(), in.nextLine(), isSubscriber);
        List<Livro> books = locarLivros(in, library.getLivros());
        List<Artigo> articles = locarArtigos(in, library.getArtigos());
        Emprestimo emp = new Emprestimo(in.nextInt(), user, books, articles);
        library.setEmprestimo(emp);
        return library;
    }

    private static List<Livro> locarLivros(Scanner in, List<Livro> allBooks) {
        List<Livro> livros = new ArrayList<>();
        System.out.println("Informe os livros:\n");
        for (Livro livro : allBooks) {
            if(livro.isDisponivel()) {
                System.out.println(livro.getId() + " - " + livro.getNome() + " " + livro.getAutor() + "\n");
            }
        }
        int op = 0;
        while (true) {
            System.out.println("Informe o livro:\n");
            if((op = in.nextInt()) == 0) break; //vai ler o id do livro enquanto for diferente de 0
            Livro bookSelected = allBooks.get(op);
            bookSelected.setDisponivel(false);
            livros.add(bookSelected);
        };

        return livros;
    }

    private static List<Artigo> locarArtigos(Scanner in, List<Artigo> allArticles) {
        List<Artigo> artigos = new ArrayList<>();
        System.out.println("Informe os livros:\n");
        for (Artigo artigo : allArticles) {
            if(artigo.isDisponivel()) {
                System.out.println(artigo.getId() + " - " + artigo.getTitulo() + " " + artigo.getAutor() + " " + artigo.getAnoPublicacao() + "\n");
            }
        }
        int op = 0;
        while (true) {
            System.out.println("Informe o livro:\n");
            if((op = in.nextInt()) == 0) break; //vai ler o id do livro enquanto for diferente de 0
            Artigo articleSelected = allArticles.get(op);
            articleSelected.setDisponivel(false);
            artigos.add(articleSelected);
        };

        return artigos;
    }

    //user, String nome, String matricula, String senha, boolean assinante;
    //book, String nome, int numero, String autor, String genero;
    //article, String titulo, String autor, int anoPublicacao;
}