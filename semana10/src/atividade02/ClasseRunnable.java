package atividade02;

public class ClasseRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Thread.currentThread().setName("B");
		System.out.println(Thread.currentThread().getName() + "- Fazendo atividade");
		

	}
	
	


}
