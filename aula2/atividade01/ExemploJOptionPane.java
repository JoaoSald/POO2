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
		
		
		
	//	Object[] listap= {"professor", "mecanico", "m�dico"};
	//String prof= (String) JOptionPane.showInputDialog(null, "selecione sua profiss�o", "seletor de profiss�o", 3, null, listap, "professor");
	//	System.out.println(prof);
		
		
		//Dialogo para confirma��o
	//	JOptionPane.showConfirmDialog(null, "confirma o cadastro?", "confirma��o da opera��o", 0, 3, null);
		int opt =JOptionPane.showConfirmDialog(null, "confirma o cadastro?", "confirma��o da opera��o", 1, 3, null);
		
		switch (opt) {
		case 0:
			System.out.println("sim");
			
			break;
		case 1:
			System.out.println("n�o");
			
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
		JOptionPane.showOptionDialog(null, "clique em algum bot�o", "exemplo", 1, 3, null, bot, "bt2"); 
		
		
		
		
		
		
	}
	
	
}
