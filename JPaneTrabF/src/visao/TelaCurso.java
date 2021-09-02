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
public class TelaCurso extends JPanel {
	private JTextField fieldCodigo;
	private JTextField FieldNomeCurso;
	private JTextField fieldRepreUni;
	private JTextField fieldRepreCord;
	private JTextField fieldCnpj;
	private JTextField fieldCidade;
	private JTextField fieldTelGeralUniversidade;
	private JTextField fieldCep;
	private JTextField fieldTelefoneCordenacao;
	private JTextField FieldNomeUniversidade;
	private JTextField FieldEstado;
	private JTextField fieldCargoRepresentante;
	private JTextField fieldBairro;
	private JTextField FIeldendereco;
	private JTextField fieldCargoRepreUni;

	/**
	 * Create the panel.
	 */
	public TelaCurso() {
		setBackground(Color.CYAN);
		setLayout(new MigLayout("", "[35px][10px][4px][57px][7px][3px][3px][7px][3px][17px][16px][43px][10px][20px][15px][39px][3px][13px][4px][16px][1px][4px][1px][42px][28px][7px][7px][15px][9px][2px][3px][30px][3px][116px]", "[19px][19px][19px][19px][22px][19px][19px][25px]"));
		
		JLabel labelNomeCurso = new JLabel("Nome do Curso:");
		add(labelNomeCurso, "cell 13 0 3 1,alignx left,aligny center");
		
		JLabel labelCodigo = new JLabel("C\u00F3digo:");
		add(labelCodigo, "cell 0 0,alignx left,aligny center");
		
		FieldNomeCurso = new JTextField();
		add(FieldNomeCurso, "cell 17 0 17 1,growx,aligny top");
		FieldNomeCurso.setColumns(10);
		
		JLabel labelCargoCordenação = new JLabel("Cargo da Cordena\u00E7\u00E3o:");
		add(labelCargoCordenação, "cell 0 2 4 1,alignx left,aligny center");
		
		FieldEstado = new JTextField();
		add(FieldEstado, "cell 2 5 5 1,growx,aligny top");
		FieldEstado.setColumns(10);
		
		JLabel labelCnpj = new JLabel("CNPJ:");
		add(labelCnpj, "cell 17 3 3 1,alignx right,aligny center");
		
		fieldRepreUni = new JTextField();
		add(fieldRepreUni, "cell 9 6 7 1,growx,aligny top");
		fieldRepreUni.setColumns(10);
		
		JLabel labelRepresentanteCord = new JLabel("Representante da Cordena\u00E7\u00E3o:");
		add(labelRepresentanteCord, "cell 17 1 13 1,alignx right,aligny center");
		
		fieldRepreCord = new JTextField();
		add(fieldRepreCord, "cell 31 1 3 1,growx,aligny top");
		fieldRepreCord.setColumns(10);
		
		JLabel labelNomeUniversidade = new JLabel("Nome da Universidade:");
		add(labelNomeUniversidade, "cell 0 3 4 1,alignx left,aligny center");
		
		JLabel labelBairro = new JLabel("Bairro:");
		add(labelBairro, "cell 17 4 5 1,alignx right,aligny center");
		
		JTextField fieldCargoCordenacao = new JTextField();
		add(fieldCargoCordenacao, "cell 5 2 11 1,growx,aligny top");
		fieldCargoCordenacao.setColumns(10);
		
		JLabel labelCidade = new JLabel("Cidade:");
		add(labelCidade, "cell 29 4 3 1,alignx left,aligny center");
		
		fieldCidade = new JTextField();
		add(fieldCidade, "cell 33 4,growx,aligny top");
		fieldCidade.setColumns(10);
		
		JLabel labelCep = new JLabel("CEP:");
		add(labelCep, "cell 31 3,alignx right,aligny center");
		
		fieldTelGeralUniversidade = new JTextField();
		add(fieldTelGeralUniversidade, "cell 27 6 7 1,growx,aligny top");
		fieldTelGeralUniversidade.setColumns(10);
		
		JLabel labelEstado = new JLabel("Estado:");
		add(labelEstado, "cell 0 5 3 1,growx,aligny center");
		
		fieldCep = new JTextField();
		add(fieldCep, "cell 33 3,growx,aligny top");
		fieldCep.setColumns(10);
		
		JLabel labelTelefoneCordenacao = new JLabel("Telefone da Cordena\u00E7\u00E3o:");
		add(labelTelefoneCordenacao, "cell 0 1 6 1,alignx left,aligny center");
		
		fieldTelefoneCordenacao = new JTextField();
		add(fieldTelefoneCordenacao, "cell 7 1 9 1,growx,aligny top");
		fieldTelefoneCordenacao.setColumns(10);
		
		JLabel labelGeralUniversidade = new JLabel("Telefone geral Universidade:");
		add(labelGeralUniversidade, "cell 17 6 11 1,alignx center,aligny center");
		
		FieldNomeUniversidade = new JTextField();
		add(FieldNomeUniversidade, "cell 6 3 10 1,growx,aligny top");
		FieldNomeUniversidade.setColumns(10);
		
		fieldCodigo = new JTextField();
		add(fieldCodigo, "cell 2 0 10 1,growx,aligny top");
		fieldCodigo.setColumns(10);
		
		fieldCnpj = new JTextField();
		add(fieldCnpj, "cell 23 3 5 1,growx,aligny top");
		fieldCnpj.setColumns(10);
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimparTela.setIcon(new ImageIcon(TelaCurso.class.getResource("/figuras/Trash.png")));
		add(buttonLimparTela, "cell 0 7 8 1,alignx right,aligny top");
		
		JButton buttonRemover = new JButton("Remover");
		buttonRemover.setIcon(new ImageIcon(TelaCurso.class.getResource("/figuras/Remove.png")));
		buttonRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(buttonRemover, "cell 11 7 3 1,alignx left,aligny center");
		
		JButton buttonCriar = new JButton("Criar");
		buttonCriar.setIcon(new ImageIcon(TelaCurso.class.getResource("/figuras/Equipment.png")));
		add(buttonCriar, "cell 15 7 3 1,alignx left,aligny bottom");
		
		JButton butonLer = new JButton("Ler");
		butonLer.setIcon(new ImageIcon(TelaCurso.class.getResource("/figuras/List.png")));
		add(butonLer, "cell 21 7 3 1,alignx left,aligny bottom");
		
		JButton buttonFazerUp = new JButton("Fazer Update");
		buttonFazerUp.setIcon(new ImageIcon(TelaCurso.class.getResource("/figuras/Down.png")));
		add(buttonFazerUp, "cell 25 7 9 1,alignx left,aligny center");
		
		JLabel lblCargoRepresentante = new JLabel("Cargo Do Representate:");
		add(lblCargoRepresentante, "cell 17 2 9 1,growx,aligny center");
		
		fieldCargoRepresentante = new JTextField();
		add(fieldCargoRepresentante, "cell 27 2 7 1,growx,aligny top");
		fieldCargoRepresentante.setColumns(10);
		
		JLabel labelRepresentanteUniversidade = new JLabel("Representante da Uniersidade");
		add(labelRepresentanteUniversidade, "cell 0 6 10 1,growx,aligny top");
		
		fieldBairro = new JTextField();
		add(fieldBairro, "cell 23 4 5 1,alignx right,aligny top");
		fieldBairro.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		add(lblEndereco, "cell 0 4 4 1,alignx left,aligny center");
		
		FIeldendereco = new JTextField();
		add(FIeldendereco, "cell 3 4 13 1,growx,aligny bottom");
		FIeldendereco.setColumns(10);
		
		JLabel labelCargoRepresentandoUni = new JLabel(" Cargo Representante da Universidade:");
		add(labelCargoRepresentandoUni, "cell 9 5 11 1,alignx left,aligny center");
		
		fieldCargoRepreUni = new JTextField();
		add(fieldCargoRepreUni, "cell 19 5 15 1,growx,aligny top");
		fieldCargoRepreUni.setColumns(10);
		

	}
}
