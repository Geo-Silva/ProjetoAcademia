package projeto.academia2022.equipamento;

import javax.swing.JOptionPane;

import projeto.academia2022.repo.Repositorio;

public class MenuEquip {

	public static void menu() {
		
		byte opcao;
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "===Menu de Equipamentos==="
						+ "\nEscolha o que voc? deseja fazer:"
						+ "\n0 - Voltar;"
						+ "\n1 - Adicionar um novo equipamento;"
						+ "\n2 - Adicionar ou remover unidades de um equipamento"
						+ "\n3 - Remover um equipamento;"
						+ "\n4 - Ver lista de equipamentos e quantidades;")
				);
		
		switch(opcao) {
		
		case 0:
			
			
			break;
			
		case 1:
			
			adcEquip();	
			
			break;
			
		case 2:
			
			altQtd();
			
			break;
			
		case 3:
			
			removeEquip();
			
			break;
			
		case 4:
			
			verEquips();
			
			break;

		default:
			
			JOptionPane.showMessageDialog(null, "Op??o inv?lida!");
			menu();
			
			break;
		
		}
		
	}

	private static void removeEquip() {
		
		String nome;
		
		nome = JOptionPane.showInputDialog(null, "Qual o equipamento a ser removido?");
		
		if(Repositorio.equipamento.containsKey(nome)) {
			
			Repositorio.equipamento.remove(nome);
			JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
			menu();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Equipamento n?o encontrado ou inexistente!");
			menu();
			
		}
		
	}

	private static void verEquips() {
		
		JOptionPane.showMessageDialog(null, "Atualmente, esses s?o os equipamentos dispon?veis: " + Repositorio.equipamento.keySet());
		JOptionPane.showMessageDialog(null, "E estas s?o suas respectivas quantidades: " + Repositorio.equipamento.values());
		menu();
		
	}

	private static void altQtd() {
		
		String nome;
		int qtd;
		
		nome = JOptionPane.showInputDialog(null, "Qual o nome do equipamento a ser atualizado?");
		
		if(Repositorio.equipamento.containsKey(nome)) {
			
			qtd = Integer.parseInt(
					JOptionPane.showInputDialog(null, "Qual a nova quantidade do equipamento?")
					);
			
			Repositorio.equipamento.replace(nome, qtd);
			
			JOptionPane.showMessageDialog(null, "Equipamento atualizado!");
			menu();
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Equipamento n?o encontrado ou inexistente!");
			menu();
			
		}
		
	}

	private static void adcEquip() {
		
		String nome;
		int qtd;
		
		nome = JOptionPane.showInputDialog(null, "Qual o nome do novo equipamento?");
		qtd = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Qual a quantidade que chegou?")
				);
		
		Repositorio.equipamento.put(nome, qtd);
		menu();
		
	}
	
}
