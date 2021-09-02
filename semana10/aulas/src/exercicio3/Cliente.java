package exercicio3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class Cliente{
    public static void main(String[] args) {

        System.out.println("\n=====CLIENTE INICIADO====\n");

        try {

            Scanner leitura = new Scanner(System.in);

            Socket s = new Socket("localhost", 6543);
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));


            System.out.println("\nData e horário enviado pelo servidor: "+in.readLine());

            System.out.println("\nDigite algo para finalizar\n");
            leitura.nextLine();

            in.close();
            leitura.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}