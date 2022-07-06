package aplicacao;

import java.util.Scanner;

import entidades.Produto;

public class ProdutoMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados do produto: ");
		System.out.println("nome: ");
		String nome = sc.next();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		System.out.println("Pre�o: ");
		double valor = sc.nextDouble();

		Produto celular = new Produto(nome, valor, quantidade);
		System.out.printf("\n%s ", celular.nome);
		System.out.printf("\n%d", celular.quantidade);
		System.out.printf("\nR$ %.2f", celular.valorUnitario);

		System.out.printf("\nImposto: R$ %.2f", celular.valorImposto());
		System.out.printf("\nTotal em estoque: R$ %.2f", celular.valorEstoque());

		sc.close();
	}

}
