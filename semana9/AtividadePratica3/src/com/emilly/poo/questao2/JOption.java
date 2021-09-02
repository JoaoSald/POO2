package com.emilly.poo.questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class JOption extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOption frame = new JOption();
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
	public JOption() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 300, 300);
		contentPane = new JPanel();
		contentPane.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
				JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][]"));
		
		JLabel labelTempo = new JLabel();
		labelTempo.setFont(new Font("Arial", Font.BOLD, 12));
		contentPane.add(labelTempo, "cell 0 1");
	
	    Timer timer = new Timer();

	    	timer.scheduleAtFixedRate(new TimerTask() {
	    		int i = 50;

	            public void run() {
	            	labelTempo.setText("" + i);
	                i--;

	                if (i < 0) {
	                    timer.cancel();
	                    labelTempo.setText("Tempo esgotado");
	                }
	            }
	        }, 0, 1000);
	}
}