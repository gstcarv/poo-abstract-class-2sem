package br.com.classesabstratas.empregados;

public class Gerente extends Funcionario {

	@Override
	String obterCargo() {
		return "Gerente";
	}

	@Override
	double obterSalario() {
		return 2000;
	}

	@Override
	double getBonificacao() {
		return this.obterSalario() * 20 / 100;
	}

}
