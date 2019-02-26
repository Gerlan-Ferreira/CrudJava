package inc;

import model.Funcionario;

public class Supervisor extends Funcionario {

	
	public double bonificacao(double salario) {
		int porcentagem = 5;
		salario+= porcentagem * salario /100;
		
		return salario;
	}
	
}
