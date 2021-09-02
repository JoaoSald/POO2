package exercicio3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class ThreadServidor extends Thread{

    private Socket socli;
    private  int numeroCliente;

    public ThreadServidor(Socket s, int numeroCliente){
        this.socli = s;
        this.numeroCliente = numeroCliente;

    }


    public void run(){

        PrintWriter ou = null;
        try {
            System.out.println("Conexão recebida do cliente ");
            ou = new PrintWriter(this.socli.getOutputStream(), true);
            ou.write(LocalDateTime.now().toString());
            ou.flush();
            ou.close();
            System.out.println("Enviado data e hora para o cliente "+numeroCliente);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
