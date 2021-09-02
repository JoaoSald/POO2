package com.emilly.poo.questao1;

import java.util.Arrays;

public class Ordenacao {

	private Integer numero;

	public Ordenacao(int num) {
		this.numero = num;
	}

	public synchronized void ordenar() {

		double vet[] = new double[numero];

		for (int i = 0; i < numero; i++) {
			vet[i] = Math.random() * numero;
		}

		Arrays.sort(vet);

		for (int i = 0; i < numero; i++) {
			System.out.println("Imprimindo Elemento " + i + " " + vet[i] + " " + Thread.currentThread().getName());
		}
	}
	
	

}
