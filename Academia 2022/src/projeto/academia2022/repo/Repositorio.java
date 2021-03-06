package projeto.academia2022.repo;

import java.util.HashMap;

import projeto.academia2022.cliente.Cliente;
import projeto.academia2022.funcionario.Funcionario;

public class Repositorio {

	public static HashMap<String, String> usuarios = new HashMap<>();
	public static HashMap<String, String> clientes = new HashMap<>();
	public static HashMap<String, String> funcionario = new HashMap<>();
	public static HashMap<String, Integer> equipamento = new HashMap<>();
	
	public static Cliente cliente1 = new Cliente();
	public static Cliente cliente2 = new Cliente();
	public static Cliente cliente3 = new Cliente();
	public static Cliente cliente4 = new Cliente();
	
	public static void carregandoUsuarios() {
		
		usuarios.put("Geovani", "160702");
		usuarios.put("admin", "admin");
		usuarios.put("Marcos", "theboss1990");
		
	}
	
	public static void carregandoClientes() {
		
		clientes.put("Yudi", "894.363.610-50");
		clientes.put("Adrielle", "795.997.400-41");
		clientes.put("Roberto", "798.466.220-74");
		clientes.put("Ana", "454.634.380-99");
		
		cliente1.setNome("Yudi");
		cliente1.setCpf("894.363.610-50");
		cliente1.setIdade("32");
		cliente1.setNumeroCartao("04032000-4218-0000"); //quero ver pegar a referencia aqui
		cliente1.setEndereco("Rua-Playstation"); //nome gringo, juro
		cliente1.setNumeroContato("4002-8922"); //mera coincidencia
		cliente1.setTipoPlano("Anual");
		cliente1.setEquipFav("Halteres");
		
		cliente2.setNome("Adrielle");
		cliente2.setCpf("795.997.400-41");
		cliente2.setIdade("21");
		cliente2.setNumeroCartao("48226565-2561-6353");
		cliente2.setEndereco("Rua-Flores");
		cliente2.setNumeroContato("9512-1562");
		cliente2.setTipoPlano("Teste");
		cliente2.setEquipFav("Esteira");
		
		cliente3.setNome("Roberto");
		cliente3.setCpf("798.466.220-74");
		cliente3.setIdade("27");
		cliente3.setNumeroCartao("63647691-5872-6712");
		cliente3.setEndereco("Rua-Cascatas");
		cliente3.setNumeroContato("8334-7334");
		cliente3.setTipoPlano("Mensal");
		cliente3.setEquipFav("Bicicleta");
		
		cliente4.setNome("Ana");
		cliente4.setCpf("454.634.380-99");
		cliente4.setIdade("23");
		cliente4.setNumeroCartao("85870162-5376-2721");
		cliente4.setEndereco("Rua-Brom?lia");
		cliente4.setNumeroContato("5174-1523");
		cliente4.setTipoPlano("Mensal");
		cliente4.setEquipFav("Colchonete");
		

	}
	
	public static void carregandoFuncionarios() {
		
		funcionario.put("Eduardo", "Personal-Trainer");
		funcionario.put("Maria", "Recepcionista");
		funcionario.put("Thiago", "Professor-Edf");
		funcionario.put("Rafael", "Limpeza");
		
		Funcionario func1 = new Funcionario();
		
		func1.setNome("Eduardo");
		func1.setCpf("291.951.390-79");
		func1.setIdade("26");
		func1.setSalario(3.500f);
		func1.setEndereco("Rua-Azul");
		func1.setNumeroContato("8764-4712");
		func1.setTurno("Tarde");
		func1.setFuncao("Personal-Trainer");
		
		Funcionario func2 = new Funcionario();
		
		func2.setNome("Maria");
		func2.setCpf("278.934.170-21");
		func2.setIdade("20");
		func2.setSalario(1.740f);
		func2.setEndereco("Rua-Sebastiao");
		func2.setNumeroContato("9999-1111"); //vai que existe
		func2.setTurno("Integral");
		func2.setFuncao("Recepcionista");
		
		Funcionario func3 = new Funcionario();
		
		func3.setNome("Thiago");
		func3.setCpf("173.773.870-84");
		func3.setIdade("30");
		func3.setSalario(2.800f); //prof ainda ganha pouco nesse universo triste que eu criei, srry
		func3.setEndereco("Rua-Maravilha");
		func3.setNumeroContato("3567-1362");
		func3.setTurno("Manha");
		func3.setFuncao("Prof-Edf");
		
		Funcionario func4 = new Funcionario();
		
		func4.setNome("Rafael");
		func4.setCpf("788.003.950-31");
		func4.setIdade("22");
		func4.setSalario(1.500f); //pouca coisa para limpar = menos salario, certo?
		func4.setEndereco("Rua-Colonia");
		func4.setNumeroContato("6426-8463");
		func4.setTurno("Noturno");
		func4.setFuncao("Limpeza");
		
	}
	
	public static void carregandoEquipamentos() {
		
		//academia pobre por enquanto, t? come?ando, d? um cr?dito vai
		
		equipamento.put("Haltere", 5);
		equipamento.put("Colchonete", 20);
		equipamento.put("Bolas", 7);
		equipamento.put("Esteira", 4);
		equipamento.put("Bicicleta", 2);
	
	}
	
}
