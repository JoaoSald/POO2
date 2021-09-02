package exercicio2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class Contador extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Contador frame = new Contador();
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "Seja bem-vindo");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Contador() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250, 250, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblGameTime = new JLabel();
        lblGameTime.setBounds(10, 10, 10, 14);
        contentPane.add(lblGameTime);
       

        int intervaloMilissegundos = 1000;

        Runnable runner = new Runnable() {
            Timer timer;
            public void run() {
                ActionListener actionListener = new ActionListener() {
                    private int contador = 0;
                    
                    @Override
                    public void actionPerformed(ActionEvent event) {
                    	
                        lblGameTime.setText(String.format("%d", contador));
                        
                        contador++;
                    }
                };

                // executa o actionListener a cada 1000 ms
                timer = new Timer(intervaloMilissegundos, actionListener);
                timer.setInitialDelay(0);
                timer.start();
            }
        };

        EventQueue.invokeLater(runner);
    }
}