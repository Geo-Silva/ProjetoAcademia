package projeto.academia2022.repo;

import java.util.HashMap;

import projeto.academia2022.cliente.Cliente;

public class Repositorio {

	public static HashMap<String, String> usuarios = new HashMap<>();
	
	public static HashMap<String, String> clientes = new HashMap<>();
	
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
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Yudi");
		cliente1.setCpf("894.363.610-50");
		cliente1.setIdade("32");
		cliente1.setNumeroCartao("04032000-1254-2234"); //quero ver pegar a referencia aqui
		cliente1.setEndereco("Rua-Playstation"); //nome gringo, juro
		cliente1.setNumeroContato("4002-8922"); //mera coincidencia
		cliente1.setTipoPlano("Anual");
		cliente1.setEquipFav("Halteres");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Adrielle");
		cliente2.setCpf("795.997.400-41");
		cliente2.setIdade("21");
		cliente2.setNumeroCartao("48226565-2561-6353");
		cliente2.setEndereco("Rua-Flores");
		cliente2.setNumeroContato("9512-1562");
		cliente2.setTipoPlano("Teste");
		cliente2.setEquipFav("Esteira");
		
		Cliente cliente3 = new Cliente();
		
		cliente3.setNome("Roberto");
		cliente3.setCpf("798.466.220-74");
		cliente3.setIdade("27");
		cliente3.setNumeroCartao("63647691-5872-6712");
		cliente3.setEndereco("Rua-Cascatas");
		cliente3.setNumeroContato("8334-7334");
		cliente3.setTipoPlano("Mensal");
		cliente3.setEquipFav("Bicicleta");
		
		Cliente cliente4 = new Cliente();
		
		cliente4.setNome("Ana");
		cliente4.setCpf("454.634.380-99");
		cliente4.setIdade("23");
		cliente4.setNumeroCartao("85870162-5376-2721");
		cliente4.setEndereco("Rua-Brom�lia");
		cliente4.setNumeroContato("5174-1523");
		cliente4.setTipoPlano("Mensal");
		cliente4.setEquipFav("Colchonete");
		

	}
	
}
