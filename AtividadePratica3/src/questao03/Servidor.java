package questao03;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

        @SuppressWarnings("unused")
		Socket coneCli = null;
        int numCliente = 0;

        try {
            @SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(6543);

            System.out.println("\n-----servidor--------");

            System.out.println("\n -------Aguardando conexão------");
            while(true){
                numCliente++;

              
                coneCli = server.accept();


                ThreadServ ts = new ThreadServ(coneCli, numCliente);
                ts.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        
        
    }

	
	
}
