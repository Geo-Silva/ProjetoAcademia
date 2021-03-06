package projeto.academia2022.cliente;

import javax.swing.JOptionPane;

import projeto.academia2022.repo.OTI;
import projeto.academia2022.repo.OTI.OrdemPrioridade;
import projeto.academia2022.repo.Repositorio;

public class MenuCliente {

	public static void menu() {
		
		byte opcao;
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "===Menu de Clientes==="
				+ "\nEscolha abaixo o que voc? deseja fazer:"
				+ "\n0 - Voltar;"
				+ "\n1 - Cadastrar um cliente;"
				+ "\n2 - Ver lista de clientes;"
				+ "\n3 - Procurar um cliente;"
				+ "\n4 - Ver tipos de planos;")
				);
		
		switch(opcao) {
		
		case 0:
			//o menu principal ? um do-while mesmo...
			break;
		
		case 1:
			
			cadastrar();
			
			break;
			
		case 2:
			
			verClientes();
			
			break;
			
		case 3:
			
			//procurarCliente();
			
			break;
			
		case 4:
			
			deletar();
			
			break;
			
		case 5:
			
			verPlanos();
			
			break;
			
		default:
			
			JOptionPane.showMessageDialog(null, "Op??o inv?lida!");
			menu();
			
			break;
			
		}
		
	}
	
	/*
	 * private static void procurarCliente() {
	 * 
	 * String nome, cpf; byte opcao;
	 * 
	 * opcao = Byte.parseByte( JOptionPane.showInputDialog(null,
	 * "Voc? deseja procurar por CPF ou por nome?" + "\n0 - Voltar;" + "\n1 - Nome;"
	 * + "\n2 - CPF;") );
	 * 
	 * switch(opcao) {
	 * 
	 * case 0:
	 * 
	 * menu();
	 * 
	 * break;
	 * 
	 * case 1:
	 * 
	 * nome = JOptionPane.showInputDialog(null, "Digite o nome:");
	 * 
	 * Repositorio
	 * 
	 * }
	 * 
	 * }
	 */

	private static void deletar() {
		
		//infelizmente n?o sei como fazer para remover da classe "Pessoa" mesmo
		//Remover de um HashMap n?o ? remover completamente
		String nome;
				
		nome = JOptionPane.showInputDialog(null, "Digite o nome para ser removido:");
				
		if(Repositorio.clientes.containsKey(nome)) {
					
			Repositorio.clientes.remove(nome);
					
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
					
		}else {
					
			JOptionPane.showMessageDialog(null, "Nome de funcion?rio inexistente!");
			menu();
					
		}
		
	}
	

	@OTI(ordemPrioridade = OrdemPrioridade.IMPORTANTE, item = "Definir melhor os tipos de planos (valores principalmente) e fazer esse m?todo mais otimizado e eficiente, j? que eu fiz de maneira simples", quemAssume = "Qualquer um")
	
	private static void verPlanos() {
		
		JOptionPane.showMessageDialog(null, "Esses s?o os tipos de planos atuais:"
				+ "\n1? - Anual"
				+ "\nO cliente paga de maneira anual, com possibilidade de parcelemento de 6x. ? caro, mas tem quem pague. Se tem mercado, ? porque tem demanda"
				+ "\n2? - Mensal"
				+ "\nCl?ssico pagamento mensal, o m?todo principal de pagamento"
				+ "\n3? - Teste"
				+ "\nO cliente tem um desconto no pagamento e ter? acesso a academia por completo por 3 meses, ap?s esse per?odo, ele pode"
				+ " alterar o tipo de plano ou cancelar ele.");
		menu();
		
	}
	
	@OTI(ordemPrioridade = OrdemPrioridade.CRITICO, item = "Fazer esse m?todo de maneira mais otimizada (um la?o de for talvez?) usando o JOptionPane", quemAssume = "Qualquer um")
	
	private static void verClientes() {

		//fiz de uma maneira bem simples, n?o fa?o idea de como fazer isso de uma maneira mais otimizada
		//dentro de um "for" por exemplo, que nem o syso ?
		//como ? com o JOptionPane, acho que dificulta as coisas
		//ent?o fiz dessa maneira bem simples que, n?o ? o ideal eu sei, mas d? para o gasto e serve o pr?posito
		//mesmo que meio mal
		//ei, ? por isso que est? com annotation OTI em Cr?tico, isso tem que ser melhorado assim que se tiver conhecimento de uma
		//maneira mais eficiente/otimizada
		//lembrando que TEM QUE SER com o JOptionPane
		
		JOptionPane.showMessageDialog(null, "Ao todo, temos " + Repositorio.clientes.size() + " clientes.");
		JOptionPane.showMessageDialog(null, "Estes sendo: " + Repositorio.clientes.keySet());
		JOptionPane.showMessageDialog(null, "Respectivos CPFs: " + Repositorio.clientes.values());
		menu();
		
	}

	@OTI(ordemPrioridade = OrdemPrioridade.TRIVIAL, item = "Acho bem eficiente esse m?todo, alterar caso tenha uma maneira melhor", quemAssume = "Qualquer um")
	private static void cadastrar() {
		
		String nome, cpf, idade, numeroContato, endereco, numeroCard, tipoPlano;
		
		Cliente novoCliente = new Cliente();
		
		nome = JOptionPane.showInputDialog(null, "Nome:");
		novoCliente.setNome(nome);
		
		cpf = JOptionPane.showInputDialog(null, "CPF:");
		novoCliente.setCpf(cpf);
		
		if(Repositorio.clientes.containsValue(cpf)) {
			
			JOptionPane.showMessageDialog(null, "Este CPF j? est? cadastrado!");
			menu();
			
		}
		
		Repositorio.clientes.put(nome, cpf);
		
		idade = JOptionPane.showInputDialog(null, "Idade:");
		novoCliente.setIdade(idade);
		
		numeroContato = JOptionPane.showInputDialog(null, "N?mero de contato:");
		novoCliente.setNumeroContato(numeroContato);
		
		endereco = JOptionPane.showInputDialog(null, "Endere?o:");
		novoCliente.setEndereco(endereco);
		
		numeroCard = JOptionPane.showInputDialog(null, "N?mero de cart?o:");
		novoCliente.setNumeroCartao(numeroCard);
		
		tipoPlano = JOptionPane.showInputDialog(null, "Tipo de plano:");
		novoCliente.setTipoPlano(tipoPlano);
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		menu();
		
	}

	
	
}
