package exemplo01;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class ExibeImagem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibeImagem frame = new ExibeImagem();
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
	public ExibeImagem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	//METODO PAINT
	public void paint(Graphics g)
	{
		//CHAMANDO O OBJETO GRAPHICS 2D 
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//CARREGANDO A IMAGEM PELO MEIO DO TOOLKIT
		Image img= Toolkit.getDefaultToolkit().getImage(ExibeImagem.class.getResource("/figuras/excel.png"));
		//DESENHANDO
		g2.drawImage(img, 100,30, this);
		g2.dispose();
	}
	
}
