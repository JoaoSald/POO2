package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Empregado;

public class EmpregadoDAO {

	private Connection con=null;
	
	public EmpregadoDAO() 
	{
		
		
		
	}
	//metodo de consulta de Empregado
	public boolean consultaEmpregado (Empregado e) 
	{
		String nome=null, end=null;
		double sal=0;
	 ClasseConexaoMSQL.abrirConexao();
	 con=ClasseConexaoMSQL.getCon();
	 
	 String sql = "select * from Empregado where cpf like ?";
	 
	 PreparedStatement  prepS;
	 
	  try {
		  prepS= con.prepareStatement(sql);
		prepS.setString(1, sql);
		  ResultSet res = prepS.executeQuery();
		  
		 while (res.next()) 
		 {
			nome=res.getString(2);
			end=res.getString(3);
			sal=res.getDouble(4);
		}
		  e.setNome(nome);
		  e.setEndereco(end);
		  e.setSalario(sal);
		  con.close();
		  
		  return true;
		  
		  
	} catch (Exception e2) {
		// TODO: handle exception
		try {
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();}
	}
	return false;
		
		
	}
	
	 public boolean cadastrarEmpregado(Empregado e)
	 {
		 ClasseConexaoMSQL.abrirConexao();
		 ClasseConexaoMSQL.getCon();
		 
		 if(con != null)
		 {
			 String aql ="insert into Empregado values(?,?,?,?)";
			 
			 PreparedStatement prepS=null;
			 
			 try {
				prepS = con.prepareStatement(aql);
				prepS.setString(1, e.getCpf());
				prepS.setString(2, e.getNome());
				prepS.setString(3, e.getEndereco());
				prepS.setDouble(4, e.getSalario());
				
				int res= prepS.executeUpdate();
				
				if(res==1)
				{
					ClasseConexaoMSQL.fecharConexao();
					return true;
				}else {
					ClasseConexaoMSQL.fecharConexao();
					return false;
				}
				
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 
			 return false;
			 
			 
		 }
		return false;
		 
	 }
	
}
