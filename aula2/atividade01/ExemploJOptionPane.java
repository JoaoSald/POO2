package atividade01;

import javax.swing.JOptionPane;

public class ExemploJOptionPane {

	public static void main(String[] args) {
		
		
		//dialogo de mensagem
		//JOptionPane.showMessageDialog(null, "emitindo uma mensagem");
		
		
//COM ICONE
//JOptionPane.showMessageDialog(null, "emitindo um alerta!", "Titulo da cixa", 2, new ImageIcon(ExemploJOptionPane.class.getReasource("/figuraas/alert.png");
		//JOptionPane.showMessageDialog(null, "emitindo um alerta!", "Titulo da cixa", 2, null);
		
		
		//Dialogo de Entrada
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "informe sua idade")) ;
		System.out.println(idade);
		
		
		
	//	Object[] listap= {"professor", "mecanico", "médico"};
	//String prof= (String) JOptionPane.showInputDialog(null, "selecione sua profissão", "seletor de profissão", 3, null, listap, "professor");
	//	System.out.println(prof);
		
		
		//Dialogo para confirmação
	//	JOptionPane.showConfirmDialog(null, "confirma o cadastro?", "confirmação da operação", 0, 3, null);
		int opt =JOptionPane.showConfirmDialog(null, "confirma o cadastro?", "confirmação da operação", 1, 3, null);
		
		switch (opt) {
		case 0:
			System.out.println("sim");
			
			break;
		case 1:
			System.out.println("não");
			
			break;
		case 2:
			System.out.println("cancelar");
			
			break;
			default:
			System.out.println("nenhuma opt");
				break;
		}
		
		//Dialogo de Opt
		Object [] bot = {"bt1", "bt2", "bt3"};
		JOptionPane.showOptionDialog(null, "clique em algum botão", "exemplo", 1, 3, null, bot, "bt2"); 
		
		
		
		
		
		
	}
	
	
}
