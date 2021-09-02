package questao02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClasseCliente {

    public static void main(String[] args) throws UnknownHostException, IOException {
        try {
        	ClasseCliente cliente = new ClasseCliente("127.0.0.1", 6789);
            cliente.executar();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private final Scanner teclado = new Scanner(System.in);

    private final String host;
    private final int porta;

    public ClasseCliente(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public void executar() throws IOException {
        Socket cliente = new Socket(host, porta);
        System.out.println("------CLIENTE-------");
        System.out.println("O cliente se conectou ao servidor!");

        DataInputStream entrada = new DataInputStream(cliente.getInputStream());
        DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());

        int opr = 0;
        @SuppressWarnings("unused")
		int num01 = 0,num02 = 0;
   
        while (!((opr >= 1) && (opr <= 4))) {
            System.out.println("Escolha a operação: \n1 para + ; 2 para - ; 3 para * ; 4 para /");
            opr = Integer.parseInt(teclado.nextLine()); // 
            System.out.println("\n Digite um Numero:\n");
            num01 = Integer.parseInt(teclado.nextLine());
            System.out.println("Digite outro Numero:\n");
            num02 = Integer.parseInt(teclado.nextLine());
            
        }

        // enviar operação ao servidor
        saida.writeInt(opr);
        saida.writeInt(num01);
        saida.writeInt(num02);
        saida.flush();

        // ler mensagem do servidor
       String mensagem = entrada.readUTF(); 
        System.out.println(mensagem);

        // fechar streams
        entrada.close();
        saida.close();
        cliente.close();
    }
}