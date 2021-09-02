package atividade02;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClasseCliente {
public static void main(String[] args) {
	
	Socket socketC;
	
	System.out.println("\n\n------CLIENTE------");
	try {
		socketC= new Socket("localhost", 7080);
		ObjectOutputStream out= new ObjectOutputStream(socketC.getOutputStream());
		ObjectInputStream in= new ObjectInputStream(socketC.getInputStream());
		
		System.out.println("Informe o nome da ação: ");
		Scanner leitura= new Scanner(System.in);
		out.writeObject(leitura.nextLine());
		out.flush();
		
		try {
			System.out.println("Retorno"+(String)in.readObject());
			socketC.close();
			in.close();
			out.close();
			leitura.close();

			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
