package questao02;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClasseServidor {

    public static void main(String[] args) {
        try {
        	ClasseServidor servidor = new ClasseServidor(6789);
            servidor.executar();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    private final int porta;

    public ClasseServidor(int porta) throws IOException {
        this.porta = porta;
    }

    public void executar() throws IOException {
        ServerSocket servidor = new ServerSocket(porta);
        System.out.println("----SERVIDOR-----");
        System.out.println("Ouvindo a porta " + porta);

        Socket cliente = null;
        while ((cliente = servidor.accept()) != null) {
            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());

            DataOutputStream saida = new DataOutputStream(cliente.getOutputStream());
            DataInputStream entrada = new DataInputStream(cliente.getInputStream());


            int opr = entrada.readInt(); //
            int num01 = entrada.readInt();
            int num02 = entrada.readInt();

         
            @SuppressWarnings("unused")
			String operacao = null;
            @SuppressWarnings("unused")
			double resultado = 0;
            switch (opr) {
                case 1:
                    operacao = "+";
                    resultado = num01 + num02;
                    break;
                case 2:
                    operacao = "-";
                    resultado = num01 - num02;
                    break;
                case 3:
                    operacao = "*";
                    resultado = num01 * num02;
                    break;
                case 4:
                    operacao = "/";
                    resultado = num01 / (double) num02;
                    break;
            }

            // enviar mensagem para o cliente
            String mensagem = num01 + operacao + num02+"= "+ resultado;
            saida.writeUTF(mensagem);
            saida.flush();
            
           
            saida.close();
            entrada.close();
        }
        servidor.close();
    }
}