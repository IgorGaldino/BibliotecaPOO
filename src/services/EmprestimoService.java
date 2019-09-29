package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.*;

public class EmprestimoService {
    
    public static Biblioteca efetuarEmprestimo(Biblioteca library){
        Scanner in = new Scanner(System.in);
        List<Livro> books = null;

        System.out.println(
            "Usuário é assinante?\n"
            + "1 - sim ou 0 - não"
        );
        boolean isSubscriber = (in.nextInt() == 1) ? true : false;
        in.nextLine(); //clear buffer
        System.out.println("\t***Dados do usuário***");
        System.out.println("Informe o nome");
        String name = in.nextLine();
        System.out.println("Informe a matricula");
        String registration = in.nextLine();
        System.out.println("Informe a senha");
        String password = in.nextLine();

        Usuario user = new Usuario(name, registration, password, isSubscriber);
        System.out.println("Deseja locar algum livro?\n1-Sim ou 0-Não");
        if(in.nextInt() == 1)
            books = locarLivros(library.getLivros());
        in.nextLine(); //clear buffer
        int prazo = isSubscriber ? 12 : 3;
        Emprestimo emp = new Emprestimo(prazo, user, books);
        library.setEmprestimo(emp);
        return library;
    }

    public static Biblioteca devolucao(Biblioteca library){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe sua matrícula");
        String registration = in.nextLine();
        System.out.println("Informe sua senha");
        String password = in.nextLine();
        for(Emprestimo emp : library.getEmprestimos()) {
            if(emp.getUsuario().getMatricula().equals(registration) && emp.getUsuario().getSenha().equals(password)) {
                devolverLivros(emp.getLivros());
                library.removeEmprestimo(emp);
                break;
            }
            else {
                System.out.println("####################");
                System.out.println("#Dados incorreto!!!#");
                System.out.println("####################");
            }
        }

        return library;
    }

    private static void devolverLivros(List<Livro> livros) {
        for(Livro book : livros)
            book.setDisponivel(true);
    }

    private static List<Livro> locarLivros(List<Livro> allBooks) {
        Scanner in = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        int op = 0;
        while (true) {
            if(allBooks.isEmpty()) { //Verifica se a lista de livros está vazia
                System.out.println("\t***************************");
                System.out.println("\t**Nenhum livro cadastrado**");
                System.out.println("\t***************************");
                break;
            }
            System.out.println("Informe os livros:\n");
            for (Livro livro : allBooks) {
                if(livro.isDisponivel()) {
                    System.out.println(livro.getId() + " - " + "Nome:" + livro.getNome() + " " + "Autor: " + livro.getAutor() + "\n");
                }
            }
            System.out.println("Informe o código do livro ou 0 - Terminar de locar\n");
            if((op = in.nextInt()) == 0) break; //vai ler o id do livro enquanto for diferente de 0
            Livro bookSelected = allBooks.get(op-1);
            bookSelected.setDisponivel(false);
            livros.add(bookSelected);
        };

        return livros;
    }

    //user, String nome, String matricula, String senha, boolean assinante;
    //book, String nome, int numero, String autor, String genero;
}