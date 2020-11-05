package br.com.classesabstratas.empregados;

public class Presidente extends Funcionario {
	
	@Override
	String obterCargo() {
		return "Presidente";
	}

	@Override
	double obterSalario() {
		return 3000;
	}

	@Override
	double getBonificacao() {
		return this.obterSalario() * 30 / 100;
	}

}
