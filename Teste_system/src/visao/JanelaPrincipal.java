package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.ControleTelaPrincipal;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.CardLayout;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

	private JPanel contentPaneFundo;
	
	private CardLayout cardFundo;
	
	private PanelPrincipalDeFundo PanelPrincipalDeFundo;
	private TelaConcedente telaConcedente;
	private TelaCurso telaCurso;
	private TelaEstagiario telaEstagiario;
	private TelaLoggin telaLoggin;
	private TelaTermoCompromisso telaTermoCompromisso;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipal.class.getResource("/figuras/Computer 16x16.png")));
		setBackground(Color.LIGHT_GRAY);
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 450);		
		setLocationRelativeTo(null);

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JMenuLogon = new JMenu("Logon");
		menuBar.add(JMenuLogon);
		
		JMenuItem menuItemAutenticar = new JMenuItem("Autenticar");
		
		JMenuLogon.add(menuItemAutenticar);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		JMenuLogon.add(menuItemSair);
		
		JMenu JMenuGerenciar = new JMenu("Gerenciar");
		menuBar.add(JMenuGerenciar);
		
		JMenuItem menuItemEstagiario = new JMenuItem("Estagi\u00E1rio");
		JMenuGerenciar.add(menuItemEstagiario);
		
		JMenuItem menuItemCurso = new JMenuItem("Curso");
		JMenuGerenciar.add(menuItemCurso);
		
		JMenuItem menuItemConcedente = new JMenuItem("Concedente");
		JMenuGerenciar.add(menuItemConcedente);
		
		JMenuItem menuItemTermoCompromisso = new JMenuItem("Termo de Compromiso");
		JMenuGerenciar.add(menuItemTermoCompromisso);
		
		contentPaneFundo = new JPanel();
		contentPaneFundo.setBackground(SystemColor.controlHighlight);
		contentPaneFundo.setForeground(Color.LIGHT_GRAY);
		contentPaneFundo.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPaneFundo);
		contentPaneFundo.setLayout(new CardLayout(0, 0));
		
		//	icones
		menuItemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Key.png")));
		menuItemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Exit.png")));
		menuItemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/User group.png")));
		menuItemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Notes.png")));
		menuItemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Company.png")));
		menuItemTermoCompromisso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Text preview.png")));

		//--------
		menuItemAutenticar.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemAutenticar();
				telaLoggin.setVisible(true);
			}
			
		});
		
		menuItemSair.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemSair();
			}
			
		});
		
		menuItemEstagiario.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemEstagiario();
				cardFundo.show(contentPaneFundo, "telaEstagiario");
			}
			
		});
		
		menuItemCurso.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemCurso();
				cardFundo.show(contentPaneFundo, "telaCurso");
			}
			
		});
		
		menuItemConcedente.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemConcedente();
				cardFundo.show(contentPaneFundo, "telaConcedente");
			}
			
		});
		
		menuItemTermoCompromisso.addActionListener(new java.awt.event.ActionListener() 
		{

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				ControleTelaPrincipal.itemTermoCompromisso();
				cardFundo.show(contentPaneFundo, "telaTermoCompromisso");
			}
			
		});
		//---------------------
		
		cardFundo = new CardLayout( 0, 0 );
		contentPaneFundo.setLayout(cardFundo);
		
		PanelPrincipalDeFundo = new PanelPrincipalDeFundo();
		telaConcedente = new TelaConcedente();
		telaCurso = new TelaCurso();
		telaEstagiario = new TelaEstagiario();
		telaLoggin = new TelaLoggin();
		telaTermoCompromisso = new TelaTermoCompromisso();

		contentPaneFundo.add(PanelPrincipalDeFundo, "PanelPrincipalDeFundo");
		contentPaneFundo.add(telaConcedente, "telaConcedente");
		contentPaneFundo.add(telaCurso, "telaCurso");
		contentPaneFundo.add(telaEstagiario, "telaEstagiario");
		contentPaneFundo.add(telaTermoCompromisso, "telaTermoCompromisso");
		
	}
	
	//	Getters e Setters
	public CardLayout getCardFundo() {
		return cardFundo;
	}

	public void setCardFundo(CardLayout cardFundo) {
		this.cardFundo = cardFundo;
	}

	public TelaConcedente getTelaConcedente() {
		return telaConcedente;
	}

	public void setTelaConcedente(TelaConcedente telaConcedente) {
		this.telaConcedente = telaConcedente;
	}

	public TelaCurso getTelaCurso() {
		return telaCurso;
	}

	public void setTelaCurso(TelaCurso telaCurso) {
		this.telaCurso = telaCurso;
	}

	public TelaEstagiario getTelaEstagiario() {
		return telaEstagiario;
	}

	public void setTelaEstagiario(TelaEstagiario telaEstagiario) {
		this.telaEstagiario = telaEstagiario;
	}

	public TelaLoggin getTelaLoggin() {
		return telaLoggin;
	}

	public void setTelaLoggin(TelaLoggin telaLoggin) {
		this.telaLoggin = telaLoggin;
	}

	public TelaTermoCompromisso getTelaTermoCompromisso() {
		return telaTermoCompromisso;
	}

	public void setTelaTermoCompromisso(TelaTermoCompromisso telaTermoCompromisso) {
		this.telaTermoCompromisso = telaTermoCompromisso;
	}

	public PanelPrincipalDeFundo getPanelPrincipalDeFundo() {
		return PanelPrincipalDeFundo;
	}

	public void setPanelPrincipalDeFundo(PanelPrincipalDeFundo panelPrincipalDeFundo) {
		PanelPrincipalDeFundo = panelPrincipalDeFundo;
	}
	//-------------------

}
