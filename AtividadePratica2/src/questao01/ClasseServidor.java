package questao01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClasseServidor {
	public static void main(String[] args) {
		
		ServerSocket server;
		Socket socketS;
		
		System.out.println("---SERVIDOR----");
		try {
			server = new ServerSocket(7080);
			
			while(true) {
				System.out.println("\nAguardando Conexão");
				socketS= server.accept(); //Aguardando coexão
				System.out.println("Conexão obtidade: "+socketS.getInetAddress().getHostName());
				
				ObjectInputStream in = ObjectInputStream(socketS.getInputStream()); //Entrada
				ObjectOutputStream out = ObjectOutputStream(socketS.getOutputStream());//saida
				
				 int raio = in.readInt(); // o cliente enviou com writeInt, então leio com readInt
				 
				 int mensagem = (int) ((raio * raio)* 3.14) ;
		         out.writeInt(mensagem);
				 out.flush();
				 
				 socketS.close();
				 in.close();
				 out.close();
				
					
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	private static ObjectOutputStream ObjectOutputStream(OutputStream outputStream) {
		// TODO Auto-generated method stub
		return null;
	}

	private static ObjectInputStream ObjectInputStream(InputStream inputStream) {
		// TODO Auto-generated method stub
		return null;
	}

}
