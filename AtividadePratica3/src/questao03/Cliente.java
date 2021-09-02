package questao03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	
	  public static void main(String[] args) {

	        System.out.println("----------Cliente foi inciado--------\n");

	        try {
	            Scanner leitura = new Scanner(System.in);

	            @SuppressWarnings("resource")
				Socket skt = new Socket("localhost", 6543);
	            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));


	            System.out.println("\n data e hora: "+in.readLine());

	            System.out.println("\n digite qualquer coisa para o fim da operação\n");
	            leitura.nextLine();

	            in.close();
	            leitura.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
