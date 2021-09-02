package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class TelaLoggin extends JFrame {
	private JPasswordField passwordFieldUser;
	private JTextField fieldNomeUser;

	/**
	 * Create the frame.
	 */
	public TelaLoggin() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLoggin.class.getResource("/figuras/59481_login_icon.png")));
		setTitle("Loggin");
		getContentPane().setBackground(new Color(128, 128, 128));
		getContentPane().setLayout(new MigLayout("", "[108.00][grow]", "[][][][][grow][35][35][][][::10]"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBorder(null);
		splitPane.setBackground(new Color(0, 0, 0));
		splitPane.setResizeWeight(1.0);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(splitPane, "cell 0 0 2 10,grow");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		splitPane.setRightComponent(panel);
		panel.setLayout(new MigLayout("", "[100:n][366.00]", "[30:n][30:n][20]"));
		
		JLabel lblNomeUser = new JLabel("Usu\u00E1rio");
		panel.add(lblNomeUser, "cell 0 0,alignx right");
		lblNomeUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		fieldNomeUser = new JTextField();
		panel.add(fieldNomeUser, "cell 1 0,growx");
		fieldNomeUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fieldNomeUser.setColumns(20);
		
		JLabel lblSenhaUser = new JLabel("Senha");
		panel.add(lblSenhaUser, "cell 0 1,alignx right");
		lblSenhaUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		passwordFieldUser = new JPasswordField();
		panel.add(passwordFieldUser, "cell 1 1,growx");
		passwordFieldUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordFieldUser.setColumns(20);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.setIcon(new ImageIcon(TelaLoggin.class.getResource("/figuras/37263_monitor_erase_icon.png")));
		panel.add(btnNewButton_1, "cell 0 2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setIcon(new ImageIcon(TelaLoggin.class.getResource("/figuras/59481_login_icon.png")));
		panel.add(btnNewButton, "flowx,cell 1 2,alignx center,growy");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 128));
		splitPane.setLeftComponent(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TelaLoggin.class.getResource("/figuras/24252_cryptography_lock_password_secret_icon.png")));
		lblNewLabel.setBounds(165, 11, 138, 155);
		panel_1.add(lblNewLabel);

	}
}
