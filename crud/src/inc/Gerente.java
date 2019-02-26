package inc;

import model.Funcionario;

public class Gerente extends Funcionario{
	
	public Gerente () {}
	
	public double bonificacao(double salario) {
		int porcentagem = 10;
		salario+= porcentagem * salario /100;
		
		return salario;
	}
	
	
}
