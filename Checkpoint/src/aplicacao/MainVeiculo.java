package aplicacao;

import java.util.Scanner;

import entidade.Veiculo;

public class MainVeiculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pas;
		double tanque, consumo, km, valor;

		System.out.println("\nQuantidade de passageiros: ");
		pas = sc.nextInt();
		System.out.println("Capacidade do tanque do veiculo: ");
		tanque = sc.nextDouble();
		System.out.println("Qual consumo por litro do veiculo: ");
		consumo = sc.nextDouble();
		System.out.println("Distancia em Km: ");
		km = sc.nextDouble();
		System.out.println("Valor do combustivel: ");
		valor = sc.nextDouble();

		Veiculo gurgel = new Veiculo(pas, tanque, consumo);
		System.out.println(gurgel.toString());

		double tanques = gurgel.tanqueViagem(km);
		double rateio = gurgel.dividirDespesas(km, valor);

		System.out.printf("\nPara a viagem vamos precisar de "
				+ "%.1f tanques\ne cada passageiro contribuir� com "
				+ "R$ %.2f", tanques, rateio);

		sc.close();
	}

}
