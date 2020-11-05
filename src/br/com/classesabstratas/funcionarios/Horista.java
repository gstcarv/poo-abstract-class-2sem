package br.com.classesabstratas.funcionarios;

public class Horista extends Empregado {

	private double precoHora, horasTrabalhadas;
	
	public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
		super(nome, sobrenome, cpf);
		this.precoHora = precoHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	@Override
	public double vencimento() {
		return this.getPrecoHora() * this.getHorasTrabalhadas();
	}
	
}
