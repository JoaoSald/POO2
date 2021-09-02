package com.emilly.poo.questao3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {

		Socket socket;

		System.out.println("Cliente");

		try {
			socket = new Socket("localhost", 6543);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("\nRecebendo>> " + in.readLine());

			socket.close();
			in.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
