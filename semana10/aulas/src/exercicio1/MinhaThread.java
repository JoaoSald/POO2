package exercicio1;

import java.util.Scanner;

public class MinhaThread  extends Thread {
	private Ordenacao o;
	private String nomeThread;
	
	public MinhaThread(Ordenacao ord, String nome) {
		super();
		this.nomeThread = nome;
		this.o = ord;
	}

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		 
			try {
				o.ordenar();
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	public Ordenacao getO() {
		return o;
	}

	public void setO(Ordenacao o) {
		this.o = o;
	}

	public String getNomeThread() {
		return nomeThread;
	}

	public void setNomeThread(String nomeThread) {
		this.nomeThread = nomeThread;
	}	
	


	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor");
		Ordenacao o = new Ordenacao(leitura.nextInt());
		MinhaThread t1 = new MinhaThread(o, "Array1");
		MinhaThread t2 = new MinhaThread(o, "Array2");
		MinhaThread t3 = new MinhaThread(o, "Array3");
		MinhaThread t4 = new MinhaThread(o, "Array4");
		MinhaThread t5 = new MinhaThread(o, "Array5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		leitura.close();
	}
}
	

