package visao;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings({ "serial", "unused" })
public class TelaEstagiario extends JPanel {
	private JTextField fieldCPF;
	private JTextField FieldNome;
	private JTextField fieldDataNasc;
	private JTextField textField;
	private JTextField fieldEndereco;
	private JTextField textField_2;
	private JTextField fieldCurso;
	private JTextField fieldDataIngresso;
	private JTextField textField_1;
	private JTextField FieldTelCasa;

	/**
	 * Create the panel.
	 */
	public TelaEstagiario() {
		setBackground(Color.CYAN);
		setLayout(new MigLayout("", "[31px][56px][18px][44px][20px][73px][17px][22px][12px][12px][18px][25px][12px][23px][2px][10px][18px][16px][2px][24px][15px][129px]", "[19px][21px][19px][19px][19px][19px][25px]"));
		
		JLabel labelCPF = new JLabel("CPF:");
		add(labelCPF, "cell 0 0,alignx left,aligny center");
		
		JLabel labelNome = new JLabel("Nome:");
		add(labelNome, "cell 15 0 3 1,alignx left,aligny center");
		
		FieldNome = new JTextField();
		add(FieldNome, "cell 19 0 3 1,growx,aligny top");
		FieldNome.setColumns(10);
		
		JLabel labelSexo = new JLabel("Sexo:");
		add(labelSexo, "cell 0 1,alignx left,aligny center");
		
		JLabel labelDataNasc = new JLabel("Data de Nascimento:");
		add(labelDataNasc, "cell 13 2 7 1,alignx left,aligny center");
		
		fieldDataNasc = new JTextField();
		add(fieldDataNasc, "cell 11 1 11 1,growx,aligny center");
		fieldDataNasc.setColumns(10);
		
		JLabel labelCep = new JLabel("CEP:");
		add(labelCep, "cell 0 2,alignx left,aligny center");
		
		textField = new JTextField();
		add(textField, "cell 1 2 11 1,growx,aligny top");
		textField.setColumns(10);
		
		JLabel labelEndreço = new JLabel("Endere\u00E7o:");
		add(labelEndreço, "cell 7 1 3 1,alignx left,aligny center");
		
		JLabel labelBairro = new JLabel("Bairro:");
		add(labelBairro, "cell 0 3,alignx left,aligny center");
		
		JTextField fieldBairro = new JTextField();
		add(fieldBairro, "cell 1 3 11 1,growx,aligny top");
		fieldBairro.setColumns(10);
		
		JLabel labelCidade = new JLabel("Cidade:");
		add(labelCidade, "cell 13 3 3 1,alignx left,aligny center");
		
		textField_2 = new JTextField();
		add(textField_2, "cell 17 3 5 1,growx,aligny top");
		textField_2.setColumns(10);
		
		JLabel labelCurso = new JLabel("Curso:");
		add(labelCurso, "cell 0 4,alignx left,aligny center");
		
		fieldCurso = new JTextField();
		add(fieldCurso, "cell 1 4 11 1,growx,aligny top");
		fieldCurso.setColumns(10);
		
		JLabel labelDataIngreso = new JLabel("Data de Ingresso:");
		add(labelDataIngreso, "cell 13 4 7 1,alignx left,aligny center");
		
		fieldDataIngresso = new JTextField();
		add(fieldDataIngresso, "cell 21 4,growx,aligny top");
		fieldDataIngresso.setColumns(10);
		
		JLabel labelCelular = new JLabel("Telefone Celular:");
		add(labelCelular, "cell 0 5 2 1,alignx left,aligny center");
		
		textField_1 = new JTextField();
		add(textField_1, "cell 3 5 5 1,growx,aligny top");
		textField_1.setColumns(10);
		
		JLabel labelTelfoneCasa = new JLabel("Telefone de Casa:");
		add(labelTelfoneCasa, "cell 9 5 5 1,alignx right,aligny center");
		
		FieldTelCasa = new JTextField();
		add(FieldTelCasa, "cell 17 5 5 1,growx,aligny top");
		FieldTelCasa.setColumns(10);
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimparTela.setIcon(new ImageIcon(TelaEstagiario.class.getResource("/figuras/Trash.png")));
		add(buttonLimparTela, "cell 1 6 3 1,alignx left,aligny top");
		
		JRadioButton radioButtonSexo01 = new JRadioButton("M");
		add(radioButtonSexo01, "cell 1 1,alignx right,aligny top");
		
		fieldCPF = new JTextField();
		add(fieldCPF, "cell 1 0 11 1,growx,aligny top");
		fieldCPF.setColumns(10);
		
		JButton buttonRemover = new JButton("Remover");
		buttonRemover.setIcon(new ImageIcon(TelaEstagiario.class.getResource("/figuras/Remove.png")));
		add(buttonRemover, "cell 5 6,alignx left,aligny center");
		
		JButton buttonCriar = new JButton("Criar");
		buttonCriar.setIcon(new ImageIcon(TelaEstagiario.class.getResource("/figuras/Equipment.png")));
		add(buttonCriar, "cell 9 6 3 1,alignx left,aligny center");
		
		JButton butonLer = new JButton("Ler");
		butonLer.setIcon(new ImageIcon(TelaEstagiario.class.getResource("/figuras/List.png")));
		add(butonLer, "cell 13 6 5 1,alignx right,aligny center");
		
		JButton buttonFazerUp = new JButton("Fazer Update");
		buttonFazerUp.setIcon(new ImageIcon(TelaEstagiario.class.getResource("/figuras/Down.png")));
		add(buttonFazerUp, "cell 21 6,alignx center,aligny center");
		
		fieldEndereco = new JTextField();
		add(fieldEndereco, "cell 21 2,alignx right,aligny top");
		fieldEndereco.setColumns(10);
		
		JRadioButton radioButtonSexo02 = new JRadioButton("F");
		add(radioButtonSexo02, "cell 3 1,alignx right,aligny top");
		

	}

}
