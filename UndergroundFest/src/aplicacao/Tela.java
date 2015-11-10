package aplicacao;

import java.util.Scanner;

public class Tela {
	
	public static int menu(Scanner sc) {
		System.out.println("\n1 - 2.1: Cadastrar um novo espetáculo e as participações dele");
		System.out.println("2 - 2.2: Mostrar os dados de um espetáculo (nome, preço total e participações)");
		System.out.println("3 - 3.1: Pesquisar bandas por faixa de preço");
		System.out.println("4 - Sair");
		return Integer.parseInt(sc.nextLine());
	}

}
