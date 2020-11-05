package br.com.classesabstratas.funcionarios;

public class Comissionado extends Empregado {

	private double totalVenda, taxaComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	@Override
	public double vencimento() {
		return (totalVenda * taxaComissao) / 100;
	}

}
