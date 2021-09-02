package visao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DialogSair {
public static void main(String[] args) {
	
	//  Caixa de confirmação para o item sair da janela Principal 
	
	int opt = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "confirmação", 1, 3,
											new ImageIcon(DialogSair.class.getResource(
											"/figuras/23651_exit_system_xfce_icon.png")));
	
	switch (opt) 
	{
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
}
}
