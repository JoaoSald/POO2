package atividade01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ClasseDestinataria {
	
	public static void main(String[] args) {
		
		DatagramSocket dataSock = null;
		
		try {
			 dataSock = new DatagramSocket(7080);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Destinataro aguardando mensagem...\n");
		byte buff[] = new byte[5];
		
		DatagramPacket pacote = new DatagramPacket(buff, buff.length);
	    try {
			dataSock.receive(pacote);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	    System.out.println("Mensagem recebida: "+new String(pacote.getData()).trim() );
	    System.out.println("Endereço do Remetente "+pacote.getAddress());
	    
	    dataSock.close();
	 
	}

}
