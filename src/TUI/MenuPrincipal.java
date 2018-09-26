package TUI;

import java.util.Scanner;

public class MenuPrincipal {


	public static void main(String[] args) {

		int key = 0;
		switch (key) {
		case 1:
			CadClienteTUI.cadastrar();
			break;
		case 2:
			CadClienteTUI.atualizar();
			break;
		case 4:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}

}
