package atividade02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClasseServidor {

	public static void main(String[] args) {
		ServerSocket server;
		Socket socketS;
		
		
		System.out.println("\n\n---SERVIDOR-------");
		try {
			server= new ServerSocket(7080);
			while(true)
			{
			
				System.out.println("Aguardando conexão");
				socketS= server.accept();
				System.out.println("Conexão obtida de:"+socketS.getInetAddress().getHostName());
				
				ObjectInputStream in= new ObjectInputStream(socketS.getInputStream());
				ObjectOutputStream out= new ObjectOutputStream(socketS.getOutputStream());
				
				
				//double preco= new Double(Math.random()*100);
				@SuppressWarnings("removal")
				double preco = new Double(Math.random()*100);
				try {
					String acao= (String)in.readObject();
					out.writeObject("Ação "+acao+" RS"+String.valueOf(preco));
					out.flush();
					socketS.close();
					in.close();
					System.out.println("Conexão Encerrada com o cliente"+socketS.getInetAddress().getHostName()); 
	
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
