package questao03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClasseServidor {
public static void main(String[] args) {
	ServerSocket server;
	Socket socketS;
	
	System.out.println("\n\n----SERVIDOR-----");
	try {
		server= new ServerSocket(7080);
		
		while(true)
		{
			System.out.println("\nAguardando conexões....");
			socketS= server.accept();
			System.out.println("Conexão estabelecida com cliente:"+server.getInetAddress().getHostName());
			BufferedReader in = new BufferedReader(new InputStreamReader(socketS.getInputStream()));//Para entrada de dados do cliente 
			PrintWriter out = new PrintWriter(socketS.getOutputStream());//Enviar dados para cliente
			
			System.out.println("\n Recebendo mensagem>>>>>"+in.readLine());
			socketS.close();
			out.close();
			in.close();
			System.out.println("\nConexão encerrada com o cliente: "+server.getInetAddress().getHostName());
			
			
			
		}
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}

