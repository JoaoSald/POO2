package dao;
//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//Início da classe de conexão//
public class ConexaoMySQL {
	private static String status = "Não conectou...";
	private static Connection connection=null;

	// Método Construtor da Classe//
	public ConexaoMySQL()
	{}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		ConexaoMySQL.connection = connection;
	}

	// Método de Conexão//
	public static Connection abrirConexaoMySQL(){
		connection = null; //atributo do tipo Connection
		try {
			// Carregando o JDBC Driver padrão
			String driverName = "com.mysql.cj.jdbc.Driver";
			//Faz o registro do driver jdbc (não obrigatório a partir do JDBC 4).
			Class.forName(driverName);
			// Configurando a nossa conexão com um banco de dados//
			String serverName = "localhost"; //caminho do servidor do BD
			String mydatabase ="meubanco"; //nome do seu banco de dados
			String url = "jdbc:mysql://localhost:3306/meubanco";
			String username = "luciano"; //nome de um usuário de seu BD 
			String password = "POO2"; //sua senha de acesso
			connection = DriverManager.getConnection(url, username, password);
			
			
			//Testa sua conexão//  
			if (connection != null) {
				status = ("STATUS--->Conectado com sucesso!");
			}
			else {
				status = ("STATUS--->Não foi possivel realizar conexão");
			}
			
			return connection;
			
		}
	    catch (ClassNotFoundException e) { //Driver não encontrado
	    	 System.out.println("O driver especificado nao foi encontrado.");
	    	 return null;
	    }
	    catch (SQLException e) {
	    	//Não conseguindo se conectar ao banco
	    	System.out.println("Nao foi possivel conectar ao Banco de Dados.");

	    	return null;
	    }

	}

	// Método que retorna o status da sua conexão//
	public static void obterStatusConexao() {
		System.out.println(status);
	}

	// Método que fecha sua conexão//
	public static boolean fecharConexao() {

		try {

			connection.close();

			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	// Método que reinicia sua conexão//
	public static Connection ReiniciarConexao() {
		fecharConexao();
		return ConexaoMySQL.abrirConexaoMySQL();
	}
	
		

}