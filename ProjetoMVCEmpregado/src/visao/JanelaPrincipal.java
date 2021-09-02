package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCPF;
	private JTextField textFieldNome;
	private JLabel labelEndereco;
	private JTextField textField;
	private JLabel labelSalario;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
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
		setTitle("Empregado CRUD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][grow][][][][][grow][]", "[][][][][]"));
		
		JLabel labelCPF = new JLabel("CPF");
		contentPane.add(labelCPF, "cell 0 0,alignx left");
		
		textFieldCPF = new JTextField();
		contentPane.add(textFieldCPF, "cell 1 0 3 1,growx");
		textFieldCPF.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "cell 7 0,alignx trailing");
		
		textFieldNome = new JTextField();
		contentPane.add(textFieldNome, "cell 8 0 2 1,growx");
		textFieldNome.setColumns(10);
		
		labelEndereco = new JLabel("Endere\u00E7o");
		contentPane.add(labelEndereco, "cell 0 1,alignx left");
		
		textField = new JTextField();
		textField.setText("");
		contentPane.add(textField, "cell 1 1 9 1,growx");
		textField.setColumns(10);
		
		labelSalario = new JLabel("Sal\u00E1rio");
		contentPane.add(labelSalario, "cell 0 2,alignx left");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 2,growx");
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Cadastrar");
		contentPane.add(btnNewButton, "cell 1 4");
		
		btnNewButton_2 = new JButton("Remover");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_1 = new JButton("Atualizar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_1, "cell 2 4");
		contentPane.add(btnNewButton_2, "cell 3 4");
		
		btnNewButton_3 = new JButton("Consultar");
		contentPane.add(btnNewButton_3, "cell 4 4");
	}

}
