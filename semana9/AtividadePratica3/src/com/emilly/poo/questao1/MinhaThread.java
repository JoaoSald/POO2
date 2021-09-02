package com.emilly.poo.questao1;

import java.util.Scanner;

public class MinhaThread extends Thread {

	private Ordenacao ordenacao;
	private String nomeThread;

	public MinhaThread(Ordenacao ordenacao, String nomeThread) {
		this.ordenacao = ordenacao;
		this.nomeThread = nomeThread;
	}

	@Override
	public void run() {

		synchronized (ordenacao) {
			System.out.println("Nome da thread ativa: " + nomeThread);
			ordenacao.ordenar();
		}

	}

	public static void main(String[] args) {

		Integer numeroElementos = 0;
		Scanner scanner = new Scanner(System.in);

		numeroElementos = scanner.nextInt();

		Ordenacao ordenacao = new Ordenacao(numeroElementos);

		MinhaThread t1 = new MinhaThread(ordenacao, "Array1");
		MinhaThread t2 = new MinhaThread(ordenacao, "Array2");
		MinhaThread t3 = new MinhaThread(ordenacao, "Array3");
		MinhaThread t4 = new MinhaThread(ordenacao, "Array4");
		MinhaThread t5 = new MinhaThread(ordenacao, "Array5");

		t1.start();
		try {
			t1.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		t2.start();
		try {
			t2.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

		t3.start();
		try {
			t3.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		t4.start();
		try {
			t4.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
		t5.start();
		try {
			t5.join();
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}

	}

}
