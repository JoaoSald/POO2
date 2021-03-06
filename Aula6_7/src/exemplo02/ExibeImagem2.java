package exemplo02;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

@SuppressWarnings({ "unused", "serial" })
public class ExibeImagem2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExibeImagem2 frame = new ExibeImagem2();
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
	public ExibeImagem2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//feito em aula
		JLabel labelImagem = new JLabel("");
		labelImagem.setBounds(10, 10, 156, 141);
		//PASSO 1 -> labelImagem.setIcon(new ImageIcon(ImageIO.read(ExibeImagem2.class.getResource("/figuras/excel.png")))); e colocar no try catch
		//PASSO 2 -> .getScaledInstance(labelImagem.getWidth() , labelImagem.getHeight() , BufferedImage.TYPE_INT_RGB)));
		try {
			labelImagem.setIcon(new ImageIcon(ImageIO.read(ExibeImagem2.class.getResource("/figuras/excel.png")).getScaledInstance(labelImagem.getWidth() , labelImagem.getHeight() , BufferedImage.TYPE_INT_RGB)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contentPane.add(labelImagem);
	}
}
