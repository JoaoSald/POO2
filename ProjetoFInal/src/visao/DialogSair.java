package visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogSair {
public static void main(String[] args) {
	
	//  Caixa de confirma��o para o item sair da janela Principal 
	
	int opt = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "confirma��o", 1, 3, new ImageIcon(DialogSair.class.getResource("/figuras/alert.png")));
	
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
}
}
