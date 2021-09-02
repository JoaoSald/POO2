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
		System.out.println("autenticação confirmada");
		
		JOptionPane.showMessageDialog(
				null,
				"Autenticação realizada com sucesso.",
				"Status Autenticação",
    			JOptionPane.INFORMATION_MESSAGE
				);
		
	}
	
}
