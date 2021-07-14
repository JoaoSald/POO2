package exemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class JTabbedPaneDemo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTabbedPaneDemo frame = new JTabbedPaneDemo();
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
	public JTabbedPaneDemo() {
		setTitle("JTabbed Pane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP); // JTabbedPane.TOP FICA NA PARTE SUPERIOR E JTabbedPane.BOTTOM FICA NA PARTE INFERIOR
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Guia 1", null, panel, "primeira guia");
		panel.setLayout(new MigLayout("", "[][grow]", "[]"));
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		panel.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		textField = new JTextField();
		panel.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Guia 2", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Clicar");
		panel_1.add(btnNewButton, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		tabbedPane.addTab("Guia 3", null, panel_2, null);
		tabbedPane.setBackgroundAt(2, Color.PINK);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Guia 4", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Guia 5", null, panel_4, null);
	}

}
