package atividade02;

public class ProgramaMultiTrhead {

	public static void main(String[] args) {
		
		ClasseThread t1 = new ClasseThread("A");
		
		ClasseRunnable r= new ClasseRunnable();
		Thread t2= new Thread(r); 
		
		ClasseThread t3 = new ClasseThread("C");
		
		
		
		System.out.println("Iniciando Thread main");
		t1.start();
		
		/*
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  AS OUTRAS ESPERAM T1 TERMINAR
		*/ 
		
		t2.start();
		t3.start();
		
		
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Finalizando Thread main");
	}
	
	
}
