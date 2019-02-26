package view;

import java.sql.SQLException;

import dao.DepartamentoDAO;
import inc.Departamento;

public class View {

	public static void main(String[] args) throws SQLException {
		
		Departamento d = new Departamento ();
		DepartamentoDAO daoDepartamento = new DepartamentoDAO();
		
		
		daoDepartamento.listar();
	}
}