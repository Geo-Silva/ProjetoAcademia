package projeto.academia2022;

import javax.swing.JOptionPane;

import projeto.academia2022.cliente.MenuCliente;
import projeto.academia2022.equipamento.MenuEquip;
import projeto.academia2022.funcionario.MenuFunc;
import projeto.academia2022.logando.Login;
import projeto.academia2022.repo.Repositorio;

public class Main {

	private static byte opcao;
	
	public static void main(String[] args) {
		
		Repositorio.carregandoUsuarios();
		Repositorio.carregandoFuncionarios();
		Repositorio.carregandoClientes();
		Repositorio.carregandoEquipamentos();
		Login.logar(); //fazer login != cadastrar cliente
		
		do {
	
			fazerMenu();
			
			switch(opcao) {
			
			case 0:
				
				main(args);
				
				break;
			
			case 1:
				
				MenuCliente.menu();
				
				break;
				
			case 2:
				
				MenuFunc.menu();
				
				break;
				
			case 3:
				
				MenuEquip.menu();
				
				break;
			
			default:
				
				JOptionPane.showMessageDialog(null, "Op??o inv?lida!");
			
				break;
			
			}
			
			
			
			
			
		}while(opcao != 0);
		

	}

	public static void fazerMenu() {
		
		String menu = "Bem vindo ao menu principal!";
		menu += "\nEscolha abaixo qual opera??o voc? deseja fazer";
		menu += "\n0 - Deslogar;";
		menu += "\n1 - Administrar clientes;";
		menu += "\n2 - Administrar funcion?rios;";
		menu += "\n3 - Administrar equipamentos";
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, menu)
				);

	}

}
