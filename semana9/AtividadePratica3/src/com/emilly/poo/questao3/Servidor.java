package com.emilly.poo.questao3;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Servidor {

	public static void main(String[] args) {

		MinhaThread myRunnable = new MinhaThread();
		myRunnable.start();
	}
}
