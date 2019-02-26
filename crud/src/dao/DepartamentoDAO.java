package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import inc.Departamento;

public class DepartamentoDAO {

	public void salvar(Departamento departamento) throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		String sql = "insert into departamento" + "(id, codigo, funcionarios, telefones)" + "values(?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setLong(1, departamento.getId());
		stmt.setLong(2, departamento.getCodigo());
		stmt.setString(3, departamento.getFuncionarios());
		stmt.setString(4, departamento.getTelefones());
		
		stmt.execute();
		stmt.close();
		
		System.out.println("gravado");
		con.close();		
	}
	
	public void listar() throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
	    PreparedStatement stmt = con.prepareStatement("select * from departamento");
	    
	    ResultSet rs = stmt.executeQuery();
	    
	    while ( rs.next()) {
	    	String codigo = rs.getString("codigo");
	    	String funcionario = rs.getString("funcionarios");
	    	String telefone = rs.getString("telefones");
	    	
	    	System.out.println(codigo + ", " + funcionario + ", " + telefone );
	    }
	    
	    rs.close();
	    stmt.close();
	    con.close();
	    
	}
	
}
