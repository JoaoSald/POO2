package atividade01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClasseCliente {
	
public static void main(String[] args) {
	Socket socketC;
	
	System.out.println("\n\n-----Cliente-----");
	try {
		socketC= new Socket("localhost", 7080);
		BufferedReader in = new BufferedReader(new InputStreamReader(socketC.getInputStream()));//para entrada 
		PrintWriter out = new PrintWriter(socketC.getOutputStream());//para saida
		System.out.println("\n\nEnviando>>>");
		Scanner leitura= new Scanner(System.in);
		out.println(leitura.nextLine());
		out.flush();
		System.out.println("\n\nRecebendo>>>>"+in.readLine());
		socketC.close();
		in.close();
		out.close();
		leitura.close();
		System.out.println("conexão encerrada com o servidor");
		
		
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
