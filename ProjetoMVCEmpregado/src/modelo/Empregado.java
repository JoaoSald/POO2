package modelo;

public class Empregado {
	
private String cpf;
private String endereco;
private String nome;
private double salario;

public Empregado() {
	
}

public Empregado(String cpf, String endereco, String nome, double salario) {
	super();
	this.cpf = cpf;
	this.endereco = endereco;
	this.nome = nome;
	this.salario = salario;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

}
