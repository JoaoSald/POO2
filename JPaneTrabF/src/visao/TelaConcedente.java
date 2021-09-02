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
public class TelaConcedente extends JPanel {
	private JTextField fieldRazaoSocial;
	private JTextField fieldCnpj;
	private JTextField fieldTelefone;
	private JTextField fieldNomeRepre;
	private JTextField fieldCargoRepre;
	private JTextField fieldCep;
	private JTextField fieldEndereco;
	private JTextField FieldBairro;
	private JTextField fieldEstado;
	private JTextField fieldCidade;

	/**
	 * Create the panel.
	 */
	public TelaConcedente() {
		setBackground(Color.CYAN);
		setLayout(new MigLayout("", "[22px][9px][3px][10px][2px][15px][4px][20px][29px][3px][145px][26px][8px][6px][13px][77px][74px][15px][117px]", "[19px][19px][19px][19px][25px][21px][21px]"));
		
		JLabel labelRazãoSocial = new JLabel("Raz\u00E3o Social:");
		add(labelRazãoSocial, "cell 0 0 7 1,alignx left,aligny center");
		
		fieldRazaoSocial = new JTextField();
		add(fieldRazaoSocial, "cell 8 0 3 1,growx,aligny top");
		fieldRazaoSocial.setColumns(10);
		
		JLabel labelCnpj = new JLabel("CNPJ:");
		add(labelCnpj, "cell 11 0,alignx left,aligny center");
		
		fieldCnpj = new JTextField();
		add(fieldCnpj, "cell 13 0 3 1,alignx left,aligny top");
		fieldCnpj.setColumns(10);
		
		JLabel labelTelefone = new JLabel("Telefone:");
		add(labelTelefone, "cell 16 0,alignx right,aligny center");
		
		fieldTelefone = new JTextField();
		add(fieldTelefone, "cell 18 0,growx,aligny top");
		fieldTelefone.setColumns(10);
		
		JLabel labelNomeDoRepresentante = new JLabel("Nome do Representante:");
		add(labelNomeDoRepresentante, "cell 0 1 9 1,alignx left,aligny center");
		
		fieldNomeRepre = new JTextField();
		add(fieldNomeRepre, "cell 10 1,growx,aligny top");
		fieldNomeRepre.setColumns(10);
		
		JLabel labelCargoDoRepre = new JLabel("Cargo do Representante:");
		add(labelCargoDoRepre, "cell 11 1 5 1,alignx center,aligny center");
		
		fieldCargoRepre = new JTextField();
		add(fieldCargoRepre, "cell 16 1 3 1,growx,aligny top");
		fieldCargoRepre.setColumns(10);
		
		JLabel labelCep = new JLabel("CEP:");
		add(labelCep, "cell 0 3,alignx left,aligny center");
		
		fieldCep = new JTextField();
		add(fieldCep, "cell 2 3 9 1,growx,aligny top");
		fieldCep.setColumns(10);
		
		JLabel labelEndereço = new JLabel("Endere\u00E7o:");
		add(labelEndereço, "cell 0 2 5 1,alignx left,aligny center");
		
		fieldEndereco = new JTextField();
		add(fieldEndereco, "cell 6 2 5 1,growx,aligny top");
		fieldEndereco.setColumns(10);
		
		JLabel labelBairro = new JLabel("Bairro:");
		add(labelBairro, "cell 11 2 3 1,alignx center,aligny center");
		
		FieldBairro = new JTextField();
		add(FieldBairro, "cell 15 2 4 1,growx,aligny top");
		FieldBairro.setColumns(10);
		
		JLabel labelEstado = new JLabel("Estado:");
		add(labelEstado, "cell 0 4 3 1,alignx left,aligny center");
		
		fieldEstado = new JTextField();
		add(fieldEstado, "cell 4 4 7 1,growx,aligny top");
		fieldEstado.setColumns(10);
		
		JLabel labelCidade = new JLabel("Cidade:");
		add(labelCidade, "cell 11 3 3 1,alignx right,aligny center");
		
		fieldCidade = new JTextField();
		add(fieldCidade, "cell 15 3 4 1,growx,aligny top");
		fieldCidade.setColumns(10);
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimparTela.setIcon(new ImageIcon(TelaConcedente.class.getResource("/figuras/Trash.png")));
		add(buttonLimparTela, "cell 11 4 5 1,alignx left,aligny top");
		
		JButton buttonRemover = new JButton("Remover");
		buttonRemover.setIcon(new ImageIcon(TelaConcedente.class.getResource("/figuras/Remove.png")));
		buttonRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(buttonRemover, "cell 16 4,alignx left,aligny center");
		
		JButton buttonCriar = new JButton("Criar");
		buttonCriar.setIcon(new ImageIcon(TelaConcedente.class.getResource("/figuras/Equipment.png")));
		add(buttonCriar, "cell 0 5 7 1,alignx right,aligny top");
		
		JButton buttonFazerUp = new JButton("Fazer Update");
		buttonFazerUp.setIcon(new ImageIcon(TelaConcedente.class.getResource("/figuras/Down.png")));
		add(buttonFazerUp, "cell 0 6 9 1,alignx center,aligny top");
		
		JButton butonLer = new JButton("Ler");
		butonLer.setIcon(new ImageIcon(TelaConcedente.class.getResource("/figuras/List.png")));
		add(butonLer, "cell 8 5 3 1,alignx left,aligny top");
		

	}
}
