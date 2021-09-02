package atividade01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClasseRemetente {

	public static void main(String[] args) {
		
		InetAddress inet = null;
		try {
			inet = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Digite uma mensagem para enviar ao destinatario: ");
		Scanner leitura = new Scanner(System.in);
		
		byte buff[] = leitura.nextLine().getBytes();
		
		DatagramPacket pacote = new DatagramPacket(buff, buff.length, inet, 7080);
		DatagramSocket dataSock = null;
		
		try {
			 dataSock = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  try {
			dataSock.send(pacote);
			dataSock.close();
			leitura.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
