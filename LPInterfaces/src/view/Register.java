package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import metodo.Metodo;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register {
	private Metodo metodo = new Metodo();
	private JFrame frame;
	private JTextField Nome;
	private JTextField Cpf;
	private JTextField Email;
	public Metodo getMetodo() {
		return this.metodo;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
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
	public Register() {
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
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(20, 30, 46, 14);
		panel.add(lblNewLabel);
		
		Nome = new JTextField();
		lblNewLabel.setLabelFor(Nome);
		Nome.setBounds(51, 27, 220, 20);
		panel.add(Nome);
		Nome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(20, 71, 46, 14);
		panel.add(lblNewLabel_1);
		
		Cpf = new JTextField();
		Cpf.setBounds(51, 68, 220, 20);
		panel.add(Cpf);
		Cpf.setColumns(10);
		
		Email = new JTextField();
		Email.setBounds(51, 110, 220, 20);
		panel.add(Email);
		Email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Email");
		lblNewLabel_2.setLabelFor(Email);
		lblNewLabel_2.setBounds(20, 113, 46, 14);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email, cpf, nome;
				nome = Nome.getText();
				email = Email.getText();
				cpf = Cpf.getText();	
				Infos info = new Infos(nome, cpf, email);
				info.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(53, 178, 176, 38);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Validar dados");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email, cpf;
				email = Email.getText();
				cpf = Cpf.getText();
				metodo.getMessageValidacao(cpf, email);
			}
		});
		btnNewButton_1.setBounds(239, 178, 142, 38);
		panel.add(btnNewButton_1);
	}
}
