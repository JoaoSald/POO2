package atividade2;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JLabel;
public class JDialogDemo {

	private JanelaPrincipal jan;
	
	public JDialogDemo(JanelaPrincipal j) {
		// TODO Auto-generated constructor stub
		this.jan=j;
		JDialog diag= new JDialog(jan, true);
		diag.setTitle("Dire\u00E7\u00E3o");
		diag.setBounds(100, 100, 300, 150);
		diag.getContentPane().setLayout(null);
		
		JButton buttonUP = new JButton("UP");
		buttonUP.setBounds(25, 33, 89, 23);
		diag.getContentPane().add(buttonUP);
		
		JButton buttonDown = new JButton("Down");
		buttonDown.setBounds(141, 33, 89, 23);
		diag.getContentPane().add(buttonDown);
		
		JLabel labelMenssagem = new JLabel("Pressione um bot\u00E3o");
		labelMenssagem.setBounds(76, 67, 116, 14);
		diag.getContentPane().add(labelMenssagem);
		
		
		diag.setVisible(true);
	}
	
}
