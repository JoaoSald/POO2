package exercicio3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Servidor{
    public static void main(String[] args) {

        Socket socli = null;
        int numeroCliente = 0;

        try {
            ServerSocket server = new ServerSocket(6543);

            System.out.println("\n=====SERVIDOR ONLINE=====");

            System.out.println("\nAguardando solicitações de conexão...");
            while(true){
                numeroCliente++;

                //aguarda solicitações de coneção
                socli = server.accept();


                ThreadServidor ts = new ThreadServidor(socli, numeroCliente);
                ts.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}