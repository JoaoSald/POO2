package atividade2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel lblSegundos;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
					MinhaThread thread= new MinhaThread(frame);
					thread.start();
					
					JOptionPane.showMessageDialog(null, "Sejam bem-vindos!!", "Aviso", 2, new ImageIcon(MinhaThread.class.getResource("/figuras/ok1.png")));
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblSegundos = new JLabel("Segundos");
		lblSegundos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSegundos.setBounds(20, 11, 97, 35);
		contentPane.add(lblSegundos);
		
		
	}

	public JLabel getLblSegundos() {
		return lblSegundos;
	}

	public void setLblSegundos(JLabel lblSegundos) {
		this.lblSegundos = lblSegundos;
	}


	

}
