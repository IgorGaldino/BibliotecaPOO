import java.util.Scanner;

import model.Biblioteca;
import model.Emprestimo;
import services.*;

public class Aplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Biblioteca library = new Biblioteca();
		int op = 0;

		do {
			menu();
			op = in.nextInt();
			switch (op) {
				case 1:
					library = EmprestimoService.efetuarEmprestimo(in, library);
					break;
				case 2:
					
					break;
				case 3:
					library = AdministradorService.menu(library);
					break;
				case 0:
					System.out.println("EXIT\n");
					break;

				default:
					System.out.println("Operação inválida!!!\n");
					break;
			}


		} while(op != 0);

		show(library);
		in.close();
	}

	public static void menu() {
		System.out.println
		(
			"\t***Library***\n"
			+ "1-Fazer emprestimo\n"
			+ "2-Devolução\n"
			+ "3-Administrador\n"
			+ "0-Sair\n"
		);
	}

	public static void show(Biblioteca library) {
		System.out.println(
			"Show:\n"
			+ "Emprestimos"
		);
		for(Emprestimo emp : library.getEmprestimos()) {
			System.out.println("Emp: " + emp.getUsuario());
		}
	}
}
