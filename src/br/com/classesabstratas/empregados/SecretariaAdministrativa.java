package br.com.classesabstratas.empregados;

public class SecretariaAdministrativa extends Secretaria {

	@Override
	String obterCargo() {
		return "Secretária Administrativa";
	}

	@Override
	double obterSalario() {
		return 1500;
	}

	@Override
	double getBonificacao() {
		return this.obterSalario() * 10 / 100;
	}

}
