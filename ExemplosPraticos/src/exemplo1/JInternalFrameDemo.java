package exemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JInternalFrameDemo extends JFrame {

	private JPanel contentPane;
	//deixar o  desktopPane como global
	private JDesktopPane desktopPane; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameDemo frame = new JInternalFrameDemo();
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
	public JInternalFrameDemo() {
		setTitle("JIternal Frame Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 937, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Clicar");
		btnNewButton.addActionListener(new ActionListener() {
			//PASSO 01
			public void actionPerformed(ActionEvent e) {
				
				JInternalFrame ji = new JInternalFrame("Minha primeira janela interna",true );
				ji.setBounds(10, 10, 250, 180);
				ji.setVisible(true);
				 desktopPane.add(ji);
				 ji.setMaximizable(true);
				 ji.setClosable(true);
				
			}
		});
		panel.add(btnNewButton);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
	}
}
