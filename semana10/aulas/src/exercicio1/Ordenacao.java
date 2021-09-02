package exercicio1;

import java.util.Arrays;


public class Ordenacao {
	private int num;

	public Ordenacao(int num) {
		super();
		this.num = num;
	}
	
	public synchronized void ordenar() {
		
		double vetor[] = new double[this.num];
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = Math.random() * this.num;
		}
		Arrays.sort(vetor);
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("elemento " + (i+1)+": "+vetor[i]+" "+Thread.currentThread().getName());
		}
		System.out.println("\n");
	}

	public int getNum() {
		return num;
	}
	
	
	
}
