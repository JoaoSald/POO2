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
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;

import java.awt.Point;
import java.awt.Dimension;
import javax.swing.JSlider;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JToggleButton;
import javax.swing.JFormattedTextField;
import java.awt.Button;


@SuppressWarnings({ "serial", "unused" })
public class TelaTermoCompromisso extends JPanel {
	private JTextField fieldAreaEstagio;
	private JTextField fieldBeneficios;
	private JTextField fieldPrincAtiv;
	private JTextField fieldNomeAluno;
	private JTextField fieldNomeCurso;
	private JTextField fieldNomeOrientador;
	private JTextField fieldNomeUni;
	private JTextField fieldNomeRepUni;
	private JTextField fieldRazaoSoc;
	private JTextField fieldNomeRepCur;
	private JTextField fieldInfo;
	
	/**
	 * Create the panel.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public TelaTermoCompromisso() {
		setBackground(new Color(204, 204, 255));
		setLayout(new MigLayout("", "[::180,left][250,grow][150][150,grow,right]", "[::5][35][10][30][30][30][30][30][30][30][30][30][30][][40]"));
		setBounds(100, 100, 750, 500);
		
		JLabel lblTituloTdC = new JLabel("Termo de Compromisso");
		lblTituloTdC.setBackground(Color.WHITE);
		lblTituloTdC.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Text preview.png")));
		lblTituloTdC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		add(lblTituloTdC, "flowx,cell 0 1 4 1");
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setLocation(new Point(0, 1));
		separator_1.setForeground(Color.DARK_GRAY);
		add(separator_1, "cell 0 2 4 1,growx");
		
		JLabel labelNomeAluno = new JLabel("Nome do aluno:");
		labelNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeAluno, "cell 0 3,alignx right");
		
		fieldNomeAluno = new JTextField();
		fieldNomeAluno.setEditable(false);
		fieldNomeAluno.setColumns(10);
		add(fieldNomeAluno, "cell 1 3,growx");
		//labelFimEstagio.setLabelFor(fieldFimEstagio);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/About.png")));
		add(btnNewButton, "flowx,cell 2 3");
		
		JLabel labelCPFAluno = new JLabel("CPF do aluno:");
		labelCPFAluno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelCPFAluno, "cell 2 3,alignx trailing,aligny center");
		
		JFormattedTextField formattedCPFAluno = new JFormattedTextField();
		add(formattedCPFAluno, "cell 3 3,growx");
		
		//mascara
		MaskFormatter mascaraCPF = null;
			try {
				mascaraCPF = new MaskFormatter("###.###.###-##");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		mascaraCPF.install(formattedCPFAluno);
		/////////
		
		JLabel labelNomeCurso = new JLabel("Nome do curso:");
		labelNomeCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeCurso, "cell 0 4,alignx trailing");
		
		fieldNomeCurso = new JTextField();
		fieldNomeCurso.setEditable(false);
		fieldNomeCurso.setColumns(10);
		add(fieldNomeCurso, "cell 1 4,growx");
		
		JLabel labelCNPJEmpresa = new JLabel("CNPJ da empresa:");
		labelCNPJEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelCNPJEmpresa, "cell 2 4,alignx trailing");
		
		JFormattedTextField formattedCJPJEmpresa = new JFormattedTextField();
		add(formattedCJPJEmpresa, "cell 3 4,growx");
		
		//mascara
		MaskFormatter mascaraCNPJ = null;
			try {
				mascaraCNPJ = new MaskFormatter("##.###.###/0001-##.");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		mascaraCNPJ.install(formattedCJPJEmpresa);
		/////////
		
		JLabel labelNomeOrientador = new JLabel("Nome do orientador:");
		labelNomeOrientador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeOrientador, "cell 0 5,alignx trailing");
		
		fieldNomeOrientador = new JTextField();
		fieldNomeOrientador.setEditable(false);
		fieldNomeOrientador.setColumns(10);
		add(fieldNomeOrientador, "cell 1 5,growx");
		
		JLabel labelRazaoSoc = new JLabel("Raz\u00E3o social (empresa):");
		labelRazaoSoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelRazaoSoc, "cell 2 5,alignx trailing");
		
		fieldRazaoSoc = new JTextField();
		fieldRazaoSoc.setColumns(15);
		add(fieldRazaoSoc, "cell 3 5,growx");
		
		JLabel labelNomeUni = new JLabel("Nome da universidade:");
		labelNomeUni.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeUni, "cell 0 6,alignx trailing");
		
		fieldNomeUni = new JTextField();
		fieldNomeUni.setEditable(false);
		fieldNomeUni.setColumns(10);
		add(fieldNomeUni, "cell 1 6,growx");
		
		JLabel labelNomeRepCur = new JLabel("Nome do rep. (curso):");
		labelNomeRepCur.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Help symbol.png")));
		labelNomeRepCur.setToolTipText("rep - representante");
		labelNomeRepCur.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeRepCur, "cell 2 6,alignx trailing");
		
		fieldNomeRepCur = new JTextField();
		fieldNomeRepCur.setColumns(15);
		add(fieldNomeRepCur, "cell 3 6,growx");
		
		JLabel labelNomeRepUni = new JLabel("Nome do rep. (uni):");
		labelNomeRepUni.setToolTipText("rep - representante; uni - universidade");
		labelNomeRepUni.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Help symbol.png")));
		labelNomeRepUni.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelNomeRepUni, "cell 0 7,alignx trailing");
		
		fieldNomeRepUni = new JTextField();
		fieldNomeRepUni.setEditable(false);
		fieldNomeRepUni.setColumns(10);
		add(fieldNomeRepUni, "cell 1 7,growx");
		
		JLabel labelInfo = new JLabel("Informa\u00E7\u00F5es compl:");
		labelInfo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelInfo, "cell 2 7,alignx trailing");
		
		fieldInfo = new JTextField();
		fieldInfo.setColumns(15);
		add(fieldInfo, "cell 3 7,growx");
		
		JLabel labelInicioEstagio = new JLabel("In\u00EDcio do est\u00E1gio:");
		labelInicioEstagio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelInicioEstagio, "flowx,cell 0 8,alignx right,aligny center");
		
		JButton buttonLimparTela = new JButton("Limpar Tela");
		buttonLimparTela.setFont(new Font("Tahoma", Font.PLAIN, 13));
		buttonLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonLimparTela.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/37263_monitor_erase_icon.png")));
		add(buttonLimparTela, "cell 2 8,alignx center,growy");
		
		JLabel labelCHDiaria = new JLabel("CH di\u00E1ria:");
		labelCHDiaria.setToolTipText("CH - Carga Hor\u00E1ria (N\u00E3o pode ser maior do que 6 horas)");
		labelCHDiaria.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Help symbol.png")));
		labelCHDiaria.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelCHDiaria, "cell 0 9,alignx right,aligny center");
		
		JLabel labelValBolsa = new JLabel("Valor da bolsa:");
		labelValBolsa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelValBolsa, "flowx,cell 2 9,alignx trailing,growy");
		
		JFormattedTextField formattedValBolsa = new JFormattedTextField();
		add(formattedValBolsa, "cell 3 9,growx");
		
		JLabel labelHorarioInicio = new JLabel("Hor\u00E1rio de in\u00EDcio:");
		labelHorarioInicio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelHorarioInicio, "cell 0 10,alignx trailing");
		
		JLabel labelAreaEstagio = new JLabel("\u00C1rea do est\u00E1gio:");
		labelAreaEstagio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelAreaEstagio, "cell 2 10,alignx right,aligny center");
		
		fieldAreaEstagio = new JTextField();
		add(fieldAreaEstagio, "cell 3 10,growx");
		fieldAreaEstagio.setColumns(10);
		labelAreaEstagio.setLabelFor(fieldAreaEstagio);
		
		JLabel labelBeneficios = new JLabel("Benef\u00EDcios:");
		labelBeneficios.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelBeneficios, "flowx,cell 0 11,alignx right,aligny center");
		
		fieldBeneficios = new JTextField();
		add(fieldBeneficios, "cell 1 11,growx,aligny center");
		fieldBeneficios.setColumns(10);
		
		JLabel labelPrincAtiv = new JLabel("Principais atividades:");
		labelPrincAtiv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelPrincAtiv, "cell 2 11,alignx right,aligny center");
		
		fieldPrincAtiv = new JTextField();
		add(fieldPrincAtiv, "cell 3 11,growx");
		fieldPrincAtiv.setColumns(10);
		labelPrincAtiv.setLabelFor(fieldPrincAtiv);
		
		JLabel labelOperacoesCRUD = new JLabel("Opera\u00E7\u00F5es");
		labelOperacoesCRUD.setBackground(new Color(255, 255, 255));
		labelOperacoesCRUD.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Database.png")));
		labelOperacoesCRUD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(labelOperacoesCRUD, "cell 0 13 4 1,alignx center");
		
		JToolBar toolBarOpCRUDTC = new JToolBar();
		toolBarOpCRUDTC.setBackground(new Color(153, 153, 255));
		toolBarOpCRUDTC.setRollover(true);
		toolBarOpCRUDTC.setEnabled(false);
		toolBarOpCRUDTC.setFloatable(false);
		add(toolBarOpCRUDTC, "cell 0 14 4 1,grow");
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalStrut_3.setBackground(new Color(135, 206, 250));
		toolBarOpCRUDTC.add(verticalStrut_3);
		
		JButton buttonCriarTC = new JButton("  Criar  ");
		buttonCriarTC.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonCriarTC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		buttonCriarTC.setToolTipText("");
		buttonCriarTC.setBackground(new Color(220, 220, 220));
		toolBarOpCRUDTC.add(buttonCriarTC);
		buttonCriarTC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buttonCriarTC.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Create.png")));
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		toolBarOpCRUDTC.add(verticalStrut_2);
		
		JButton butonLerTC = new JButton("  Ler  ");
		butonLerTC.setAlignmentX(Component.CENTER_ALIGNMENT);
		butonLerTC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		butonLerTC.setBackground(new Color(220, 220, 220));
		toolBarOpCRUDTC.add(butonLerTC);
		butonLerTC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		butonLerTC.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/List.png")));
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		toolBarOpCRUDTC.add(verticalStrut_1);
		
		JButton buttonFazerUpTC = new JButton("  Atualizar  ");
		buttonFazerUpTC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		buttonFazerUpTC.setBackground(new Color(220, 220, 220));
		buttonFazerUpTC.setAlignmentX(Component.CENTER_ALIGNMENT);
		toolBarOpCRUDTC.add(buttonFazerUpTC);
		buttonFazerUpTC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buttonFazerUpTC.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Download.png")));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		toolBarOpCRUDTC.add(verticalStrut);
		
		JButton buttonRemoverTC = new JButton("  Remover  ");
		buttonRemoverTC.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		buttonRemoverTC.setBackground(new Color(220, 220, 220));
		toolBarOpCRUDTC.add(buttonRemoverTC);
		buttonRemoverTC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buttonRemoverTC.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Remove.png")));
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		toolBarOpCRUDTC.add(verticalStrut_4);
		
		JFormattedTextField formattedHInicio = new JFormattedTextField();
		add(formattedHInicio, "flowx,cell 1 10,growx");
		
		Component horizontalStrut_4_3_5_1_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_4_3_5_1_1_1.setPreferredSize(new Dimension(0, 0));
		add(horizontalStrut_4_3_5_1_1_1, "cell 1 10");
		
		JLabel labelHorarioSaida = new JLabel("Hor\u00E1rio de sa\u00EDda:");
		labelHorarioSaida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelHorarioSaida, "cell 1 10");
		
		JFormattedTextField formattedCHDiaria = new JFormattedTextField();
		add(formattedCHDiaria, "flowx,cell 1 9,growx");
		
		Component horizontalStrut_4_3_5_1_1_2 = Box.createHorizontalStrut(20);
		horizontalStrut_4_3_5_1_1_2.setPreferredSize(new Dimension(0, 0));
		add(horizontalStrut_4_3_5_1_1_2, "cell 1 9");
		
		Component horizontalStrut_4_3_5_1_1_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4_3_5_1_1_4.setPreferredSize(new Dimension(0, 0));
		add(horizontalStrut_4_3_5_1_1_4, "cell 1 9");
		
		Component horizontalStrut_4_3_5_1_1_3 = Box.createHorizontalStrut(20);
		horizontalStrut_4_3_5_1_1_3.setPreferredSize(new Dimension(0, 0));
		add(horizontalStrut_4_3_5_1_1_3, "cell 1 9");
		
		JLabel labelCHSemanal = new JLabel("CH semanal:");
		labelCHSemanal.setIcon(new ImageIcon(TelaTermoCompromisso.class.getResource("/figuras/Help symbol.png")));
		labelCHSemanal.setToolTipText("CH - Carga Hor\u00E1ria (N\u00E3o pode ser maior do que 30 horas)");
		labelCHSemanal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelCHSemanal, "cell 1 9,alignx right,aligny center");
		
		JFormattedTextField formattedInicioEstagio = new JFormattedTextField();
		add(formattedInicioEstagio, "flowx,cell 1 8,growx");
		
		Component horizontalStrut_4_3_5_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_4_3_5_1_1.setPreferredSize(new Dimension(0, 0));
		add(horizontalStrut_4_3_5_1_1, "cell 1 8");
		
		JLabel labelFimEstagio = new JLabel("Fim do est\u00E1gio:");
		labelFimEstagio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		add(labelFimEstagio, "cell 1 8,alignx right,aligny center");
		
		JFormattedTextField formattedFimEstagio = new JFormattedTextField();
		add(formattedFimEstagio, "cell 1 8,growx");
		
		JFormattedTextField formattedCHSemanal = new JFormattedTextField();
		add(formattedCHSemanal, "cell 1 9,growx");
		
		JFormattedTextField formattedHSaida = new JFormattedTextField();
		add(formattedHSaida, "cell 1 10,growx");
		buttonRemoverTC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//mascara
		MaskFormatter mascaraData = null;
			try {
				mascaraData = new MaskFormatter("(##/##/####)");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		mascaraData.install(formattedInicioEstagio);
		mascaraData.install(formattedFimEstagio);
		/////////
		
		//mascara
		MaskFormatter mascaraHoras = null;
			try {
				mascaraHoras = new MaskFormatter("##:## (h:m)");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		mascaraHoras.install(formattedCHDiaria);
		mascaraHoras.install(formattedCHSemanal);
		mascaraHoras.install(formattedHInicio);
		mascaraHoras.install(formattedHSaida);
		/////////
		
		//mascara
		MaskFormatter valorBolsa = null;
			try {
				valorBolsa = new MaskFormatter("####,## R$");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			valorBolsa.install(formattedValBolsa);
		/////////

	}

}
