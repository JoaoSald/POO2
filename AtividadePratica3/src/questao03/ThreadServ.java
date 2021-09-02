package questao03;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class ThreadServ extends Thread {
		private Socket coneCli;
		@SuppressWarnings("unused")
		private int numCliente;


	    public ThreadServ(Socket coneCli, int numCliente) {
			// TODO Auto-generated constructor stub
	    	  this.coneCli = coneCli;
		       this.numCliente = numCliente;
	    	
		}

	    public void run(){

	    	
	        PrintWriter ou = null;
	        try 
	        {
	        	
	            System.out.println("Conexão Recebida com sucesso ");
	            ou = new PrintWriter(this.coneCli.getOutputStream(), true);
	            ou.write(LocalDateTime.now().toString());
	            ou.flush();
	            ou.close();
	            
	            
	            System.out.println(" Enviando data e hora para cliente "+numCliente);

	            
	        } catch (IOException e) {
	        	
	            e.printStackTrace();
	        }


	    }
}
