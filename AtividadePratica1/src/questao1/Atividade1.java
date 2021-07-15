package questao1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

@SuppressWarnings({ "serial", "unused" })
public class Atividade1 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNasc;
	private JTextField textFieldEndereco;
	private JTextField textFieldNumr;
	private JTextField textFieldBairro;
	private JTextField textFieldCep;
	private JTextField textFieldUF;
	private JTextField textFieldEmail;
	private JTextField textFieldFone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Atividade1 frame = new Atividade1();
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
	public Atividade1() {
		setTitle("Prontu\u00E1rio M\u00E9dico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu jMenu = new JMenu("Clique para sair");
		menuBar.add(jMenu);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/clean.png")));
		jMenu.add(menuItemSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		tabbedPane.addTab(" Dados Pessoais ", new ImageIcon(Atividade1.class.getResource("/figuras/People.png")), panel, null);
		panel.setLayout(new MigLayout("", "[40px,grow][4px][58px][46px][4px][26px][3px][73px][10px][32px][10px][7px][13px][12px][4px][30px][4px][31px]", "[19px][19px][19px][19px][13px][81px,grow]"));
		
		JLabel labelNome = new JLabel("Nome:");
		panel.add(labelNome, "cell 0 0,alignx left,aligny center");
		
		textFieldNome = new JTextField();
		panel.add(textFieldNome, "cell 2 0 2 1,growx,aligny top");
		textFieldNome.setColumns(10);
		
		JLabel labelCPF = new JLabel("CPF:");
		panel.add(labelCPF, "cell 5 0,alignx right,aligny center");
		
		textFieldCPF = new JTextField();
		panel.add(textFieldCPF, "cell 7 0 3 1,growx,aligny top");
		textFieldCPF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data de nascimento: ");
		panel.add(lblNewLabel_1, "cell 0 1 3 1,alignx left,aligny center");
		
		textFieldDataNasc = new JTextField();
		panel.add(textFieldDataNasc, "cell 3 1 3 1,growx,aligny top");
		textFieldDataNasc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o:");
		panel.add(lblNewLabel_2, "cell 7 1,alignx right,aligny center");
		
		textFieldEndereco = new JTextField();
		panel.add(textFieldEndereco, "cell 9 1 9 1,growx,aligny top");
		textFieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("N\u00FAmero:");
		panel.add(lblNewLabel_3, "cell 0 2,alignx left,aligny center");
		
		textFieldNumr = new JTextField();
		panel.add(textFieldNumr, "cell 2 2,growx,aligny top");
		textFieldNumr.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Bairro: ");
		panel.add(lblNewLabel_4, "cell 3 2,alignx right,aligny center");
		
		textFieldBairro = new JTextField();
		panel.add(textFieldBairro, "cell 5 2 9 1,growx,aligny top");
		textFieldBairro.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CEP:");
		panel.add(lblNewLabel_5, "cell 15 2,alignx right,aligny center");
		
		textFieldCep = new JTextField();
		panel.add(textFieldCep, "cell 17 2,growx,aligny top");
		textFieldCep.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("UF:");
		panel.add(lblNewLabel_6, "cell 0 3,alignx left,aligny center");
		
		textFieldUF = new JTextField();
		panel.add(textFieldUF, "cell 2 3,growx,aligny top");
		textFieldUF.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("E-mail");
		panel.add(lblNewLabel_7, "cell 3 3,alignx center,aligny center");
		
		textFieldEmail = new JTextField();
		panel.add(textFieldEmail, "cell 5 3 9 1,growx,aligny top");
		textFieldEmail.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Fone:");
		panel.add(lblNewLabel_8, "cell 11 0 3 1,alignx left,aligny center");
		
		textFieldFone = new JTextField();
		panel.add(textFieldFone, "cell 15 0 3 1,growx,aligny top");
		textFieldFone.setColumns(10);
		
		JLabel labelObs = new JLabel("Observa\u00E7\u00F5es:");
		panel.add(labelObs, "cell 0 4 3 1,alignx left,aligny top");
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JEditorPane editorPane = new JEditorPane();
		panel.add(editorPane, "cell 0 5 8 1,grow");
		btnEnviar.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/ok1.png")));
		panel.add(btnEnviar, "cell 13 5 5 1,alignx left,aligny bottom");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		tabbedPane.addTab("Ananmnese", new ImageIcon(Atividade1.class.getResource("/figuras/List.png")), panel_1, null);
		panel_1.setLayout(new MigLayout("", "[grow][][][][grow]", "[][][][][][][grow]"));
		
		JLabel lblNewLabel = new JLabel("Levantamento de sintomas:");
		panel_1.add(lblNewLabel, "cell 0 0,alignx center");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dores de cabe\u00E7a");
		panel_1.add(rdbtnNewRadioButton, "cell 1 0");
		
		JLabel lblNewLabel_10 = new JLabel("Cargo ou fun\u00E7\u00E3o no trabalho:");
		panel_1.add(lblNewLabel_10, "cell 2 0,alignx left");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Tonturas");
		panel_1.add(rdbtnNewRadioButton_1, "cell 1 1");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 2 1,growx");
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Problemas Intestinais");
		panel_1.add(rdbtnNewRadioButton_2, "cell 1 2");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Desmaios");
		panel_1.add(rdbtnNewRadioButton_3, "cell 1 3");
		
		JLabel lblNewLabel_9 = new JLabel("Area para escrever:");
		panel_1.add(lblNewLabel_9, "cell 0 5");
		
		JEditorPane editorPane_1 = new JEditorPane();
		panel_1.add(editorPane_1, "cell 0 6 2 1,grow");
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Save.png")));
		panel_1.add(btnNewButton, "flowx,cell 2 6");
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Redo.png")));
		panel_1.add(btnNewButton_1, "cell 2 6");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.CYAN);
		tabbedPane.addTab("Exames", new ImageIcon(Atividade1.class.getResource("/figuras/About.png")), panel_2, null);
		panel_2.setLayout(new MigLayout("", "[][grow][grow]", "[][][][][][]"));
		
		JLabel lblNewLabel_11 = new JLabel("Nome do Paciente:");
		panel_2.add(lblNewLabel_11, "cell 0 0,alignx trailing");
		
		textField_1 = new JTextField();
		panel_2.add(textField_1, "flowx,cell 1 0,growx");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("C\u00F3digo:");
		panel_2.add(lblNewLabel_12, "cell 1 0");
		
		textField_2 = new JTextField();
		panel_2.add(textField_2, "cell 2 0,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Selecione o exame:");
		panel_2.add(lblNewLabel_13, "cell 0 1");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Hemograma");
		panel_2.add(chckbxNewCheckBox, "cell 1 1");
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Colesterol");
		panel_2.add(chckbxNewCheckBox_1, "cell 2 1");
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Teste Covid-19");
		panel_2.add(chckbxNewCheckBox_4, "cell 1 2");
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Exames de Urina");
		panel_2.add(chckbxNewCheckBox_3, "cell 2 2");
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Glicemia");
		panel_2.add(chckbxNewCheckBox_2, "cell 1 3");
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Papanicolau");
		panel_2.add(chckbxNewCheckBox_5, "cell 2 3");
		
		JButton btnNewButton_2 = new JButton("Socilitar");
		btnNewButton_2.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Create.png")));
		panel_2.add(btnNewButton_2, "flowx,cell 1 5");
		
		JButton btnNewButton_3 = new JButton("Sair");
		btnNewButton_3.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Delete.png")));
		panel_2.add(btnNewButton_3, "cell 1 5");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		tabbedPane.addTab("Tratamentos", new ImageIcon(Atividade1.class.getResource("/figuras/Retort.png")), panel_3, null);
		panel_3.setLayout(new MigLayout("", "[grow][grow][]", "[][][grow]"));
		
		JLabel lblCdigoDoPaciente = new JLabel("C\u00F3digo do paciente:");
		panel_3.add(lblCdigoDoPaciente, "flowx,cell 0 0,alignx left");
		
		JLabel lblNewLabel_14 = new JLabel("Descreva o tratamento");
		panel_3.add(lblNewLabel_14, "cell 0 1");
		
		JEditorPane editorPane_2 = new JEditorPane();
		panel_3.add(editorPane_2, "cell 0 2,grow");
		
		JButton btnNewButton_4 = new JButton("Imprimir");
		btnNewButton_4.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Print.png")));
		panel_3.add(btnNewButton_4, "cell 1 2");
		
		JButton btnNewButton_5 = new JButton("Cancelar");
		btnNewButton_5.setIcon(new ImageIcon(Atividade1.class.getResource("/figuras/Abort.png")));
		panel_3.add(btnNewButton_5, "cell 2 2");
		
		textField_3 = new JTextField();
		panel_3.add(textField_3, "cell 0 0,growx");
		textField_3.setColumns(10);
	}

}
