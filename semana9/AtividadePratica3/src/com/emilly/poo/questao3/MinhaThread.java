package com.emilly.poo.questao3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MinhaThread extends Thread {

	private Socket socket;
	private ServerSocket server;

	LocalDateTime agora = LocalDateTime.now();

	DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	String data = dataFormatada.format(agora);

	DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss");
	String hora = horaFormatada.format(agora);

	public void run() {
		try {
			server = new ServerSocket(6543);
			while (true) {
				System.out.println("Aguardando conexao");
				socket = server.accept();
				System.out.println("\nConexao estabelecida com cliente: " + socket.getInetAddress().getHostName());
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				System.out.println("Enviando...>");
				out.println("Data e hora atual: " + data + " " + hora);
				out.flush();
				socket.close();
				out.close();
				System.out.println("Conexao encerrada com o cliente: " + socket.getInetAddress().getHostName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
