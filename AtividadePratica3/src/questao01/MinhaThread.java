package questao01;

import java.util.Scanner;

public class MinhaThread {
	private Ordenacao ord;
	private String nomeT;
	
	@SuppressWarnings("static-access")
	public MinhaThread(Ordenacao orden, String nome) 
	{
		
		super();
		this.ord = orden;
		this.nomeT = nome;
	
	}

	public synchronized void run() 
	{
		
			try {
				ord.ordenar();
				wait();
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}

	public Ordenacao getO()
	{
		return ord;
	}


	public void setO(Ordenacao o) 
	{
		this.ord = o;
	}

	public String getNomeThread() 
	{
		return nomeT;
	}

	public void setNomeThread(String nomeThread)
	{
		this.nomeT= nomeThread;
	}	
	


	public static void main(String[] args) 
	{
		Scanner leitura = new Scanner(System.in);
		
		
		System.out.println("Digite o tamanho do vetor \n");
		Ordenacao ord = new Ordenacao(leitura.nextInt());
		MinhaThread t1 = new MinhaThread(ord, "Array1");
		MinhaThread t2 = new MinhaThread(ord, "Array2");
		MinhaThread t3 = new MinhaThread(ord, "Array3");
		MinhaThread t4 = new MinhaThread(ord, "Array4");
		MinhaThread t5 = new MinhaThread(ord, "Array5");
		
		
		//Colocando para executar as 5 Threads
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		leitura.close();
	}

	
	
	private void start() {
		// TODO Auto-generated method stub
		
	}

}
