package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;

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
		setBackground(Color.LIGHT_GRAY);
		setTitle("Janela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 327);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu JMenuLogon = new JMenu("Logon");
		menuBar.add(JMenuLogon);
		
		JMenuItem menuItemAutenticar = new JMenuItem("Autenticar");
		menuItemAutenticar.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Apply.png")));
		JMenuLogon.add(menuItemAutenticar);
		
		JMenuItem menuItemSair = new JMenuItem("Sair");
		menuItemSair.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Erase.png")));
		JMenuLogon.add(menuItemSair);
		
		JMenu JMenuGerenciar = new JMenu("Gerenciar");
		menuBar.add(JMenuGerenciar);
		
		JMenuItem menuItemEstagiario = new JMenuItem("Estagi\u00E1rio");
		menuItemEstagiario.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Modify.png")));
		JMenuGerenciar.add(menuItemEstagiario);
		
		JMenuItem menuItemCurso = new JMenuItem("Curso");
		menuItemCurso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Notes.png")));
		JMenuGerenciar.add(menuItemCurso);
		
		JMenuItem menuItemConcedente = new JMenuItem("Concedente");
		menuItemConcedente.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Yes.png")));
		JMenuGerenciar.add(menuItemConcedente);
		
		JMenuItem menuItemTermoCompromisso = new JMenuItem("Termo de Compromiso");
		menuItemTermoCompromisso.setIcon(new ImageIcon(JanelaPrincipal.class.getResource("/figuras/Text preview.png")));
		JMenuGerenciar.add(menuItemTermoCompromisso);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[]"));
		
	}

}
