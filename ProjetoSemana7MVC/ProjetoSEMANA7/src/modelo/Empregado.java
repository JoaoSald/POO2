package modelo;

public class Empregado {
	
	private String cpf;
	private String nome;
	private String endereco;
	private double salario;
	
	public Empregado(String cpf, String nome, String endereco, double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.salario = salario;
	}
	
	public Empregado()
	{
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
