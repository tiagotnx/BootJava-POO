package entidades;

public class Produto {
	public String nome;
	public double valorUnitario;
	public int quantidade;

	public Produto() {

	}

	public Produto(String nome, double valorUnitario, int quantidade) {
		this.nome = nome;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public double valorImposto() {
		double imposto = 0.0;
		if (valorUnitario < 1000) {
			imposto = valorUnitario * 0.06;
		} else {
			imposto = valorUnitario * 0.12;
		}
		return imposto;
	}

	public double valorEstoque() {
		return (valorUnitario + valorImposto()) * quantidade;
	}

}
