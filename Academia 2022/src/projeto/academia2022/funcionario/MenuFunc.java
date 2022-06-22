package projeto.academia2022.funcionario;

import javax.swing.JOptionPane;

import projeto.academia2022.repo.OTI;
import projeto.academia2022.repo.Repositorio;
import projeto.academia2022.repo.OTI.OrdemPrioridade;

public class MenuFunc {

	public static void menu() {
		
		byte opcao;
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "===Menu de Funcion�rios=="
						+ "\nO que voc� deseja fazer?"
						+ "\n0 - Voltar;"
						+ "\n1 - Cadastrar um novo funcion�rio;"
						+ "\n2 - Ver lista de funcion�rios;"
						+ "\n3 - Remover um funcion�rio;")
						);
		
		switch(opcao) {
		
		case 0:
			
			break;
			
		case 1:
			
			cadastrar();
			
			break;
			
		case 2:
			
			verFunc();
			
			break;
			
		case 3:
			
			deletar();
			
			break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			menu();
			
			break;
		
		}
		
		
	}

	private static void deletar() {
		//infelizmente n�o sei como fazer para remover da classe "Pessoa" mesmo
		//Remover de um HashMap n�o � remover completamente
		String nome;
		
		nome = JOptionPane.showInputDialog(null, "Digite o nome para ser removido:");
		
		if(Repositorio.funcionario.containsKey(nome)) {
			
			Repositorio.funcionario.remove(nome);
			
			JOptionPane.showMessageDialog(null, "Removido com sucesso!");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Nome de funcion�rio inexistente!");
			menu();
			
		}
	}

	private static void cadastrar() {
		
		String nome, cpf, idade, numeroContato, endereco, funcao, turno;
		float salario;
		
		Funcionario novoFunc = new Funcionario();
		
		nome = JOptionPane.showInputDialog(null, "Nome:");
		novoFunc.setNome(nome);
		
		cpf = JOptionPane.showInputDialog(null, "CPF:");
		novoFunc.setCpf(cpf);
		
//		if(Pesso(cpf)) {
//			Aqui devia ter um m�todo de pesquisar se j� existe tal cpf, sei fazer isso com o hashmap
//			que foi o caso da classe cliente l�, mas diretamente da classe, no caso Pessoa, n�o sei 
//			ou n�o me lembro
//			JOptionPane.showMessageDialog(null, "Este CPF j� est� cadastrado!");
//			menu();
//			
//		}
		
		idade = JOptionPane.showInputDialog(null, "Idade:");
		novoFunc.setIdade(idade);
		
		numeroContato = JOptionPane.showInputDialog(null, "N�mero de contato:");
		novoFunc.setNumeroContato(numeroContato);
		
		endereco = JOptionPane.showInputDialog(null, "Endere�o:");
		novoFunc.setEndereco(endereco);
		
		funcao = JOptionPane.showInputDialog(null, "Fun��o:");
		novoFunc.setFuncao(funcao);
		
		Repositorio.funcionario.put(nome, funcao);
		
		salario = Float.parseFloat(
				JOptionPane.showInputDialog(null, "Sal�rio:"));
		novoFunc.setSalario(salario);
		
		turno = JOptionPane.showInputDialog(null, "Turno de trabalho:");
		novoFunc.setTurno(turno);
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
		menu();
		
	}
	
	@OTI(ordemPrioridade = OrdemPrioridade.CRITICO, item = "Fazer esse m�todo de maneira mais otimizada (um la�o de for talvez?) usando o JOptionPane", quemAssume = "Qualquer um")
	
	private static void verFunc() {

		//mesma pegada e ideia do MenuCliente, ao m�todo de procurar l�.
		//aberto para melhorias tamb�m :v
		//ctrl+c / ctrl+v da outra classe, eu sei, mas j� expliquei l� na outra classe o porque de ser assim
		
		JOptionPane.showMessageDialog(null, "Ao todo, temos " + Repositorio.funcionario.size() + " funcion�rios.");
		JOptionPane.showMessageDialog(null, "Estes sendo: " + Repositorio.funcionario.keySet());
		JOptionPane.showMessageDialog(null, "Respectivas fun��es: " + Repositorio.funcionario.values());
		menu();
		
	}
	
}
