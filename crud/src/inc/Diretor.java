package inc;

import model.Funcionario;

public class Diretor extends Funcionario{

	public Diretor() {}
	
	public double bonificacao(double salario) {
		int porcentagem = 15;
		salario+= porcentagem * salario /100;
		
		return salario;
	}
}
