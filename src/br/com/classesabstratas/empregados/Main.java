package br.com.classesabstratas.empregados;

public class Main {
	public static void main(String[] args) {
		Funcionario[] funcionarios = new Funcionario[] {
			new Presidente(),
			new Gerente(),
			new Diretor(),
			new SecretariaAgencia(),
			new SecretariaAdministrativa(),
		};
		
		for(Funcionario f : funcionarios) {
			System.out.println(f.obterCargo() + " -> Sal�rio: R$ " + f.obterSalario() + " - Bonifica��o: " + f.getBonificacao());
		}
		
	}
}
 