package atividade01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClasseConexaoMSQL {

	private static Connection con;
	@SuppressWarnings("unused")
	private static String status;
	
	public ClasseConexaoMSQL() 
	{
		
	}
	
	public static void abrirConexao()
	{
		String serverName="localhost";
		String database="meubanco";
		String url="jdbc::mysql://"+serverName+":3306/"+database+"?useTimezone=true&serverTime=UTC";
		String userName="joao";
		String password="poo2";
		
		try {
			con=DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(con != null)
		{
			status="status--------->Conectado com sucesso";
		}else{
			status="status--------->Não foi possivel realizar a conexão";
		}
		
	}
	
	public static boolean fecharConexao()
	{
		
		try {
		con.close();
		System.out.println("conexao encerrada!");
		return true;
	} catch (SQLException e) {
		e.printStackTrace();
		return false;
	 }
	}
	
	public static void obterStatusConexao()
	{
		System.out.println(status);
	}
	public static void main(String[] args) {
		ClasseConexaoMSQL.abrirConexao();
		ClasseConexaoMSQL.obterStatusConexao();
		ClasseConexaoMSQL.fecharConexao();
	}

	}