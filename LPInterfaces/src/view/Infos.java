package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Infos {
	private static String nome;
	private static String cpf;
	private static String email;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infos window = new Infos(nome,cpf,email);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Infos(String nome, String cpf, String email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Nome = new JLabel(this.nome);
		Nome.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		Nome.setBounds(142, 36, 282, 28);
		panel.add(Nome);
		
		JLabel Cpf = new JLabel(this.cpf);
		Cpf.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		Cpf.setBounds(132, 79, 292, 28);
		panel.add(Cpf);
		
		JLabel Email = new JLabel(this.email);
		Email.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		Email.setBounds(132, 118, 235, 28);
		panel.add(Email);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setBounds(46, 118, 46, 28);
		panel.add(lblNewLabel_2);
		
		JLabel titulo = new JLabel("Informações");
		titulo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		titulo.setBounds(132, 0, 141, 25);
		panel.add(titulo);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(46, 36, 66, 28);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(46, 79, 46, 28);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(142, 195, 120, 36);
		panel.add(btnNewButton);
	}
}
