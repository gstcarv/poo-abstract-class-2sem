package br.com.classesabstratas.funcionarios;

public class Assalariado extends Empregado {

	private double salario;
	
	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	@Override
	public double vencimento() {
		return salario;
	}

}
