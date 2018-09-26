package TUI;

import java.util.Scanner;

import domain.Cliente;


public class CadClienteTUI {
	private static Scanner scanner = new Scanner(System.in);

	public static void cadastrar() {
		System.out.println(" _ CADASTRAR CLIENTE _ ");

		System.out.println("Informe:");
		System.out.print("Nome:");
		String nome = scanner.nextLine();
		System.out.print("Endereço:");
		String endereco = scanner.nextLine();
		System.out.print("Cpf:");
		String cpf = scanner.nextLine();


		Cliente cliente = new Cliente(nome, endereco,cpf);
	}

	public static void atualizar() {
		// TODO Auto-generated method stub

	}


}
