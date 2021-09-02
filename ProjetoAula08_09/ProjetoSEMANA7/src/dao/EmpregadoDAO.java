package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Empregado;

public class EmpregadoDAO {

	private Connection con;

	public EmpregadoDAO() {

	}

	public boolean consultaEmpregado(Empregado e) {
		PreparedStatement prepS = null;
		String nome = null, end = null;
		double sal = 0;
		ResultSet res;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();

		sql = "Select * from Empregado where cpf like ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, e.getCpf());
			res = prepS.executeQuery();

			while (res.next()) {
				nome = res.getString(2);
				end = res.getString(3);
				sal = res.getDouble(4);
			}
			
			e.setNome(nome);
			e.setEndereco(end);
			e.setSalario(sal);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return false;
		}

		ConexaoMySQL.fecharConexao();
		return true;

	}

	public boolean consultaCPF(String c) {
		PreparedStatement prepS = null;
		String cpf = null;
		ResultSet res;
		String sql;

		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();

		sql = "Select * from Empregado where cpf like ?";

		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, c);
			res = prepS.executeQuery();

			if (res.next())
			{
				ConexaoMySQL.fecharConexao();
				return true;
			}
				
			else
			{
				ConexaoMySQL.fecharConexao();
				return false;
			}
				

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;
		}
	

	}
	
	public boolean atualizaEmpregado(Empregado e)
	{
		PreparedStatement prepS = null;
		String sql;
		
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();

		sql = "Update Empregado set nome=?, endereco=?, salario=? where cpf like ?";
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, e.getNome());
			prepS.setString(2, e.getEndereco());
			prepS.setDouble(3, e.getSalario());
			prepS.setString(4, e.getCpf());
			
			prepS.executeUpdate();
			
	
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return false;
		}
		
		
		ConexaoMySQL.fecharConexao();
		return true;
		
	}
	
	public boolean cadastraEmpregado(Empregado e)
	{
		PreparedStatement prepS = null;
		String sql;
		
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		
		sql = "Insert into Empregado values(?,?,?,?)";
		
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, e.getCpf());
			prepS.setString(2, e.getNome());
			prepS.setString(3, e.getEndereco());
			prepS.setDouble(4, e.getSalario());
			
			prepS.executeUpdate();
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return false;
		}
		ConexaoMySQL.fecharConexao();
		return true;
	}
	
	public boolean removeEmpregado(String c)
	{
		PreparedStatement prepS = null;
		String sql;
		int res;
		
		ConexaoMySQL.abrirConexaoMySQL();
		con = ConexaoMySQL.getConnection();
		
		sql = "Delete from Empregado where cpf like ?";
		
		try {
			prepS = con.prepareStatement(sql);
			prepS.setString(1, c);
			res=prepS.executeUpdate();
			
			if(res==1)
			{
				ConexaoMySQL.fecharConexao();
				return true;
			}
				
			else
				return false;
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			ConexaoMySQL.fecharConexao();
			return false;
		}
		
	}
	

}
