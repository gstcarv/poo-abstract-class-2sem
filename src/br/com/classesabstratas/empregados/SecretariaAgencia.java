package br.com.classesabstratas.empregados;

public class SecretariaAgencia extends Secretaria {

	@Override
	String obterCargo() {
		return "Secret�ria da Ag�ncia";
	}

	@Override
	double obterSalario() {
		return 1000;
	}

	@Override
	double getBonificacao() {
		return this.obterSalario() * 5 / 100;
	}

}
