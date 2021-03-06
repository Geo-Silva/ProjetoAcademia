package projeto.academia2022.logando;

import javax.swing.JOptionPane;

import projeto.academia2022.repo.Repositorio;

public class Login {
	
	private static String chavAutent = "AcademiaPush2005";
	
	public static void logar() {
		
		byte opcao;
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "==Bem vindo ao sistema de academia vers?o 1.0=="
				+ "\nPara continuar, fa?a o login ou seu registro"
				+ "\n0 - Sair"
				+ "\n1 - Logar"
				+ "\n2 - Registar")
				);
		
		switch(opcao) {
		
		case 0:
			
			JOptionPane.showMessageDialog(null, "Saindo");
			
			break;
			
		case 1:
			
			entrar();
			
			break;
			
		case 2:
			
			registrar();
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Op??o inv?lida!");
			logar();
			
			break;
	
		}
		
	}

	private static void registrar() {
		
		String user, pass, chav;
		
		user = JOptionPane.showInputDialog(null, "Crie seu nome de usu?rio:");
		
		if(Repositorio.usuarios.containsKey(user)) {
			
			JOptionPane.showMessageDialog(null, "Usu?rio j? existente! Realize o login ou coloque outro nome!");
			logar();
			
		}
		
		pass = JOptionPane.showInputDialog(null, "Crie sua senha: (Cuidado para n?o esquecer!)");
		
		chav = JOptionPane.showInputDialog(null, "Insira a chave de autentica??o provida pelos gerentes:");
		
		if(chav.equals(chavAutent)) {
			
			JOptionPane.showMessageDialog(null, "Registro realizado com sucesso! Novo usu?rio cadastrado!");
			Repositorio.usuarios.put(user, pass);
			logar();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Chave de autentica??o incorreta!");
			logar();
			
		}
	}

	private static void entrar() {
		
		String user, pass;
		
		user = JOptionPane.showInputDialog(null, "Usu?rio:");
		pass = JOptionPane.showInputDialog(null, "Senha:");
		
		if(Repositorio.usuarios.containsKey(user) && Repositorio.usuarios.containsValue(pass)) {
			
			JOptionPane.showMessageDialog(null, "Bem vindo(a), " + user + "!");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Credenciais incorretas!");
			logar();
			
		}	
		
	}

}
