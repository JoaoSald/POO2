package questao3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;

import questao2.Atividade2;

@SuppressWarnings("serial")
public class TelaAtividade2 extends JPanel {
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade2 frame = new Atividade2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the panel.
	 */
	public TelaAtividade2() {
		setTitle("JSplit Task");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnSair = new JButton("Sair");
		panel.add(btnSair);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JLabel lblHomer = new JLabel("");
		lblHomer.setIcon(new ImageIcon(TelaAtividade2.class.getResource("/figuras/homer2.jpg")));
		scrollPane.setViewportView(lblHomer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome da Imagem:homer.png");
		lblNome.setBounds(10, 23, 161, 13);
		panel_1.add(lblNome);
		
		JLabel lblLargura = new JLabel("Largura da Imagem: 194");
		lblLargura.setBounds(10, 68, 134, 13);
		panel_1.add(lblLargura);
		
		JLabel lblAltura = new JLabel("Altura da Imagem: 241");
		lblAltura.setBounds(10, 126, 134, 13);
		panel_1.add(lblAltura);
		
		splitPane.setDividerLocation(190);

	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}
