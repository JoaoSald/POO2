package controle;

import javax.swing.JOptionPane;

public class ControleItemAutenticar 
{

	public static void botaoLimparAutenticacao() 
	{
		// TODO Auto-generated method stub
		System.out.println("campos limpados");
		
	}
	
	public static void botaoConfirmarAutenticacao() 
	{
		// TODO Auto-generated method stub
		System.out.println("autentica��o confirmada");
		
		JOptionPane.showMessageDialog(
				null,
				"Autentica��o realizada com sucesso.",
				"Status Autentica��o",
    			JOptionPane.INFORMATION_MESSAGE
				);
		
	}
	
}
