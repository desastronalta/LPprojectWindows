package metodo;
import javax.swing.*;
public class Metodo {
	private boolean verificaCpf(String cpf) {
		boolean teste = false;
		if(cpf.length() == 11) {
			teste = true;
		}
		return teste;
	}
	private boolean verificaEmail(String email) {
		boolean teste = false;
		char letra;
		for(int i = 0; i < email.length(); i++) {
			letra = email.charAt(i);
			if(letra == '@') {
				teste = true;
			}
		}
		return teste;
	}
	public void getMessageValidacao(String cpf, String email) {
		if(verificaCpf(cpf)) {
			JOptionPane.showMessageDialog(null, "CPF validado");
		}else {
			JOptionPane.showMessageDialog(null, "CPF invalido, por favor coloque apenas numeros.");
		}
		if(verificaEmail(email)) {
			JOptionPane.showMessageDialog(null, "Email validado");
		}else {
			JOptionPane.showMessageDialog(null, "Email invalido, tente verifica-lo.");
		}
	}
}