package services;

import java.util.Scanner;

import model.*;

public class AdministradorService {

    public static Biblioteca menu(Biblioteca library) {
        int op = 0;
        
        do {
            Scanner in = new Scanner(System.in);
            System.out.println
            (
                "\t***Administrador***\n"
                + "1-Cadastrar livro\n"
                + "2-Gerar relatório de emprestimos\n"
                + "0-Sair\n"
            );
            op = in.nextInt();
            switch (op) {
                case 1:
                    library = cadastrarLivro(library);
					break;
				case 2:
					showEmprestimos(library);
					break;
				case 0:
					break;

                default:
                    System.out.println("########################");
					System.out.println("##Operação inválida!!!##");
                    System.out.println("########################");
                    break;
			}
        } while(op != 0);
        
        return library;

    }

    private static Biblioteca cadastrarLivro(Biblioteca library) {
        Scanner in = new Scanner(System.in);
        System.out.println("\t***Cadastro de livro***");
        System.out.println("Informe o nome: ");
        String nome = in.nextLine();
        System.out.println("Informe o numero: ");
        int numero = in.nextInt(); in.nextLine();
        System.out.println("Informe o autor: ");
        String autor = in.nextLine();
        System.out.println("Informe o gênero: ");
        String genero = in.nextLine();
        int id = (library != null) ? library.getLivros().size()+1 : 1;
        Livro livro = new Livro(id, nome, numero, autor, genero, true);
        library.setLivro(livro);
        return library;
    }

    private static void showEmprestimos(Biblioteca libratry) {
        if(libratry.getEmprestimos().isEmpty()) { //Verifica se a lista de empréstimos está vazia
            System.out.println("\t*******************************");
            System.out.println("\t**Nenhum empréstimo realizado**");
            System.out.println("\t*******************************\n");
            return;
        }
        System.out.println("\t***Lista de Emprestimos***");
        for(Emprestimo emp : libratry.getEmprestimos()) {
            System.out.println("Nome: " + emp.getUsuario().getNome());
            System.out.println("Prazo: " + emp.getPrazo() + " semana(s)");
        }

    }

    //user, String nome, String matricula, String senha, boolean assinante;
    //book, String nome, int numero, String autor, String genero;
}