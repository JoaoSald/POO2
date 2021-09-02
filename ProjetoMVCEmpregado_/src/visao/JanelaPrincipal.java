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

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField fieldCPF;
	private JTextField fieldEndereco;
	private JTextField fieldSalario;
	private JTextField fieldNome;
	private JButton buttonCadastrar;
	private JButton buttonAtualizar;
	private JButton buttonRemover;
	private JButton buttonConsultar;

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
		setBounds(100, 100, 586, 204);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][56.00,grow][80.00,grow][53.00,grow][97.00,grow][grow][][]", "[][][][20px][]"));
		
		JLabel lblNewLabel = new JLabel("CPF");
		contentPane.add(lblNewLabel, "cell 0 0,alignx left");
		
		fieldCPF = new JTextField();
		contentPane.add(fieldCPF, "flowx,cell 1 0,growx");
		fieldCPF.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		contentPane.add(lblNewLabel_1, "cell 0 1,alignx left");
		
		fieldEndereco = new JTextField();
		contentPane.add(fieldEndereco, "cell 1 1 7 1,growx");
		fieldEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sal\u00E1rio");
		contentPane.add(lblNewLabel_2, "cell 0 2,alignx left");
		
		fieldSalario = new JTextField();
		contentPane.add(fieldSalario, "cell 1 2,growx");
		fieldSalario.setColumns(10);
		
		JLabel labelNome = new JLabel("Nome");
		contentPane.add(labelNome, "flowx,cell 2 0 7 1,alignx left");
		
		fieldNome = new JTextField();
		contentPane.add(fieldNome, "cell 2 0,growx");
		fieldNome.setColumns(10);
		
		buttonCadastrar = new JButton("Cadastrar");
		contentPane.add(buttonCadastrar, "cell 1 4,growx");
		
		buttonAtualizar = new JButton("Atualizar");
		contentPane.add(buttonAtualizar, "cell 2 4,growx");
		
		buttonRemover = new JButton("Remover");
		contentPane.add(buttonRemover, "cell 3 4,growx");
		
		buttonConsultar = new JButton("Consultar");
		contentPane.add(buttonConsultar, "cell 4 4,growx");
	}

	public JTextField getFieldCPF() {
		return fieldCPF;
	}

	public void setFieldCPF(JTextField fieldCPF) {
		this.fieldCPF = fieldCPF;
	}

	public JTextField getFieldEndereco() {
		return fieldEndereco;
	}

	public void setFieldEndereco(JTextField fieldEndereco) {
		this.fieldEndereco = fieldEndereco;
	}

	public JTextField getFieldSalario() {
		return fieldSalario;
	}

	public void setFieldSalario(JTextField fieldSalario) {
		this.fieldSalario = fieldSalario;
	}

	public JTextField getFieldNome() {
		return fieldNome;
	}

	public void setFieldNome(JTextField fieldNome) {
		this.fieldNome = fieldNome;
	}

	public JButton getButtonCadastrar() {
		return buttonCadastrar;
	}

	public void setButtonCadastrar(JButton buttonCadastrar) {
		this.buttonCadastrar = buttonCadastrar;
	}

	public JButton getButtonAtualizar() {
		return buttonAtualizar;
	}

	public void setButtonAtualizar(JButton buttonAtualizar) {
		this.buttonAtualizar = buttonAtualizar;
	}

	public JButton getButtonRemover() {
		return buttonRemover;
	}

	public void setButtonRemover(JButton buttonRemover) {
		this.buttonRemover = buttonRemover;
	}

	public JButton getButtonConsultar() {
		return buttonConsultar;
	}

	public void setButtonConsultar(JButton buttonConsultar) {
		this.buttonConsultar = buttonConsultar;
	}
	
	public void limpaTela()
	{
		fieldCPF.setText("");
		fieldNome.setText("");
		fieldEndereco.setText("");
		fieldSalario.setText("");
	}

}