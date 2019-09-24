package services;

import java.util.Scanner;

import model.Biblioteca;
import model.Livro;

public class AdministradorService {

    public static Biblioteca menu(Biblioteca library) {
        int op = 0;
        
        do {
            Scanner in = new Scanner(System.in);
            System.out.println
            (
                "\t***Administrador***\n"
                + "1-Cadastrar livro\n"
                + "2-Cadastrar artigo\n"
                + "3-Gerar relatório de emprestimos\n"
                + "0-Sair\n"
            );
            op = in.nextInt();
            switch (op) {
                case 1:
                    library = cadastrarLivro(library);
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 0:
					break;

				default:
					System.out.println("Operação inválida!!!\n");
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
        // in.nextLine();
        //int id = (library != null) ? library.getLivros().size()+1 : 1;
        Livro livro = new Livro(1, nome, numero, autor, genero, true);
        library.setLivro(livro);
        // in.close();
        return library;
    }

    //user, String nome, String matricula, String senha, boolean assinante;
    //book, String nome, int numero, String autor, String genero;
    //article, String titulo, String autor, int anoPublicacao;
    
}