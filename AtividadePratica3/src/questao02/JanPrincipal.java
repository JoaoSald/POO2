package questao02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JanPrincipal extends JFrame {

	private JPanel contentPane;
	private JLabel labelSegundos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanPrincipal frame = new JanPrincipal();
					frame.setVisible(true);
					ThreadContadorSegundos thread= new ThreadContadorSegundos(frame);
					thread.start();
					
					JOptionPane.showMessageDialog(null, "Seja bem-vindo!", "aviso", 2, new ImageIcon(ThreadContadorSegundos.class.getResource("/figuras/Apply.png")));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
	labelSegundos = new JLabel("Segundos");
	labelSegundos.setFont(new Font("Tahoma", Font.PLAIN, 18));
	labelSegundos.setBounds(20, 11, 97, 35);
	contentPane.add(labelSegundos);
	
	
}

public JLabel getLblSegundos() {
	// TODO Auto-generated method stub
		return labelSegundos;
}

public void setLblSegundos(JLabel labelSegundos) {
	this.labelSegundos = labelSegundos;
}



}
