package atividade2;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



@SuppressWarnings("unused")
public class ClasseServidora {

	public static void main(String[] args) {
		
		ServerSocket server;
		Socket socketS;
		
		
		try {
			server = new ServerSocket(7080);
			
			System.out.println("\n\nSERVIDOR");
			while(true)
			{
				socketS=server.accept();
				System.out.println("Conexão recebida de: "+socketS.getInetAddress().getHostName());
				
				DataOutputStream out = new DataOutputStream(socketS.getOutputStream());//MANDA MANSEAGEM CLIENTE
				out.writeUTF("SERVIDOR>> Olá cliente!");//MANDA MENSAGEM CLIENTE
				out.flush();
				System.out.println("Conexão encerrada com o cliente: "+socketS.getInetAddress().getHostName());
				out.close();
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
