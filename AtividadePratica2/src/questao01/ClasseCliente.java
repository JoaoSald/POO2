package questao01;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClasseCliente {
public static void main(String[] args) {
	Socket socketC;
	
	try {
		socketC= new Socket("localhost", 7080);
		ObjectOutputStream out = ObjectOutputStream(socketC.getOutputStream());//saida
		ObjectInputStream in = ObjectInputStream(socketC.getInputStream()); //Entrada
		
		System.out.println("Informe o raio para o calculo?");
		Scanner teclado = new Scanner(System.in);
		
		int raio =0;
		raio = Integer.parseInt(teclado.nextLine());
		out.writeInt(raio);
	    out.flush();
	     
	     String mensagem = in.readUTF();
	     System.out.println(mensagem);
		
	    
	     out.close();
	     in.close();
	     teclado.close();
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

private static ObjectInputStream ObjectInputStream(InputStream inputStream) {
	// TODO Auto-generated method stub
	return null;
}

private static ObjectOutputStream ObjectOutputStream(OutputStream outputStream) {
	// TODO Auto-generated method stub
	return null;
}
}
