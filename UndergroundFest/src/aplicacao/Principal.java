package aplicacao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import dominio.Banda;
import dominio.Espetaculo;
import servico.BandaServico;
import servico.EspetaculoServico;
import servico.ParticipacaoServico;
import servico.ServicoFactory;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op;
		BandaServico bandaServico = ServicoFactory.criarBandaServico();
		EspetaculoServico espetaculoServico = ServicoFactory.criarEspetaculoServico();
		ParticipacaoServico participacaoServico = ServicoFactory.criarParticipacaoServico();

		do {
			op = Tela.menu(sc);

			switch (op) {
			case 1:
				System.out.println("2.1: Cadastrar um novo espetáculo e as participações dele");
				break;

			case 2:
				System.out.println("2.2: Mostrar os dados de um espetáculo (nome, preço total e participações)");
				System.out.println("Digite o nome do espetaculo: ");
				String nome = sc.nextLine();
		
				break;

			case 3:
				System.out.println("3.1: Pesquisar bandas por faixa de preço");
				System.out.println("Digite o preço minimo: ");
				String precoMinimoBigDecimal = sc.nextLine();
				BigDecimal precoMinimo = null;
				if (!precoMinimoBigDecimal.equals(""))
					precoMinimo = new BigDecimal(precoMinimoBigDecimal);
				
				System.out.println("Digite o preço máximo: ");
				String precoMaximoBigDecimal = sc.nextLine();
				BigDecimal precoMaximo = null;
				if (!precoMaximoBigDecimal.equals(""))
					precoMaximo = new BigDecimal(precoMaximoBigDecimal);

				List<Banda> lista2 = bandaServico.buscarTodos();
				System.out.println("Resultado da pesquisa:");
				for (Banda x : lista2) {
					System.out.println(x.getNome()+", "+x.getPreco());
				}
				
				break;

			case 4:
				System.out.println("Fim do programa!");
				break;

			default:
				System.out.println("Opção inválida!");
			}

		} while (op != 4);

		sc.close();

	}

}
