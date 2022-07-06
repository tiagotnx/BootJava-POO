package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Aluno2Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Data de nascimento (dd/mm/aaaa): ");
		String nascimento = sc.next();
		sc.nextLine();
		System.out.println("Data de matricula (dd/mm/aaaa): ");
		String matricula = sc.next();

		Aluno aluno = new Aluno(nome, nascimento, matricula);
		System.out.println(aluno);

		sc.close();
	}

}
