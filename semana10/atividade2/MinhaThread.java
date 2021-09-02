package atividade2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MinhaThread extends Thread{
	
	public JanelaPrincipal jan;
	public int cont=0;
	Thread thread= new Thread();
		
	public MinhaThread(JanelaPrincipal j) {
		this.jan=j;
	
	
}
	
	public void contador() {
		
		for (cont =0; cont < 1000; cont++) {
			try {
				this.jan.getLblSegundos().setText(Integer.toString(cont));
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	

	public void run() {
		contador();
	}
	
}
