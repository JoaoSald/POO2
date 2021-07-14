package atividade3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFileChooser extends JFrame {

	private JPanel contentPane;
	private static JFileChooser frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new JFileChooser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFileChooser() {
		setTitle("JFileChooser");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAbrirCaixaDialogo = new JButton("Abrir caixa de dialogo");
		btnAbrirCaixaDialogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser jf= new JFileChooser();
				
				int opt =jf.showOpenDialog(frame);
				
				if(opt == JFileChooser.APROVE_OPTION) 
				{
					
				}
			}
		});
		btnAbrirCaixaDialogo.setBounds(10, 33, 157, 23);
		contentPane.add(btnAbrirCaixaDialogo);
		
		JLabel labelCaminhoArquivo = new JLabel("Caminho Absoluto do Arquivo");
		labelCaminhoArquivo.setBounds(10, 78, 157, 14);
		contentPane.add(labelCaminhoArquivo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(56, 130, 290, 30);
		contentPane.add(lblNewLabel);
	}
}
