package atividade02;

public class ClasseThread extends Thread{

	public ClasseThread(String nomeT) {
		// TODO Auto-generated constructor stub
		super(nomeT);
	}
	
	public void run () {
		System.out.println(getName()+ "- Fazendo atividade");
		
	}
	
	
}
