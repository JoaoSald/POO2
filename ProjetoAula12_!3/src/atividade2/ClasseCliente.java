package atividade2;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

@SuppressWarnings("unused")
public class ClasseCliente {

	public static void main(String[] args) {
		
		Socket socketC;
		
		
		System.out.println("\n\nCLIENTE - Aguardando Mensagem.......\n");
		try {
			socketC= new Socket("localhost", 7080);
			DataInputStream in = new DataInputStream(socketC.getInputStream());//LE MENAGEM DO SERVIDOR 
			System.out.println(in.readUTF());
			System.out.println("\nConexão encerrada com o servidor");
			socketC.close();
			in.close();
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
