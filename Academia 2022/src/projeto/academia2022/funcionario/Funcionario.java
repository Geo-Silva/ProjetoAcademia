package projeto.academia2022.funcionario;

import projeto.academia2022.repo.Pessoa;

public class Funcionario extends Pessoa {

	public float salario;
	public String funcao;
	public String turno;
	
	public Funcionario() {
		
	}

	public Funcionario(float salario, String funcao, String turno) {
		super();
		this.salario = salario;
		this.funcao = funcao;
		this.turno = turno;
	}

	public Funcionario(float salario, String funcao, String turno, String nome, String cpf, String idade, String endereco, String numeroContato) {
		super(nome, cpf, idade, endereco, numeroContato);
		this.salario = salario;
		this.funcao = funcao;
		this.turno = turno;
		
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String getNome() {
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		super.setCpf(cpf);
	}

	@Override
	public String getIdade() {
		return super.getIdade();
	}

	@Override
	public void setIdade(String idade) {
		super.setIdade(idade);
	}

	@Override
	public String getEndereco() {
		return super.getEndereco();
	}

	@Override
	public void setEndereco(String endereco) {
		super.setEndereco(endereco);
	}

	@Override
	public String getNumeroContato() {
		return super.getNumeroContato();
	}

	@Override
	public void setNumeroContato(String numeroContato) {
		super.setNumeroContato(numeroContato);
	}
	
	
}
