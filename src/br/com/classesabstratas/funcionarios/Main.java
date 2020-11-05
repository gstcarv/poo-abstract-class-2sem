package br.com.classesabstratas.funcionarios;

public class Main {
	public static void main(String[] args) {
		Empregado[] empregados = new Empregado[] {
			new Assalariado("Jonas", "Ferreira", "111.111.111-11", 1300),
			new Comissionado("Juliana", "Silva", "222.222.222-22", 100000, 30),
			new Horista("Matheus", "Augusto", "333.333.333-33", 45, 160)
		};
		
		for(Empregado e : empregados) {
			System.out.println(e.getNome() + " " + e.getSobrenome() + " - " + "R$ " + e.vencimento());
		}
		
	}
}
