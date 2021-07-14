package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel  labelDirecaoPendente;
	private static JanelaPrincipal frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new JanelaPrincipal();
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
	public JanelaPrincipal() {
		setTitle("JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 labelDirecaoPendente = new JLabel("Dire\u00E7\u00E3o Pendente");
		labelDirecaoPendente.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelDirecaoPendente.setBounds(21, 31, 233, 33);
		contentPane.add(labelDirecaoPendente);
		
		JButton buttonMostraDialogo = new JButton("Mostrar Dialogo");
		buttonMostraDialogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDialogDemo jd= new JDialogDemo (frame);
				
			}
		});
		buttonMostraDialogo.setBounds(32, 96, 130, 23);
		contentPane.add(buttonMostraDialogo);
		
		JButton buttonRedefinirDialogo = new JButton("Redefinir Dialogo");
		buttonRedefinirDialogo.setBounds(195, 96, 146, 23);
		contentPane.add(buttonRedefinirDialogo);
	}

	public JLabel getLabelDirecaoPendente() {
		return labelDirecaoPendente;
	}

	public void setLabelDirecaoPendente(JLabel labelDirecaoPendente) {
		this.labelDirecaoPendente = labelDirecaoPendente;
	}
	
}
