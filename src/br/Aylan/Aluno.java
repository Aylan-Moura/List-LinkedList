package br.Aylan;

public class Aluno {

private String nome;
private Double numero;
private Long cpf;
private Double nota;

public Aluno (String nome, Double numero, Long cpf, Double nota) {
	this.nome = nome;
	this.numero = numero;
	this.cpf = cpf;
	this.nota = nota;
}






public String getNome() {
	return nome;
}



public void setNome(String nome) {
	this.nome = nome;
}



public double getNumero() {
	return numero;
}



public void setNumero(Double numero) {
	this.numero = numero;
}



public long getCpf() {
	return cpf;
}



public void setCpf(Long cpf) {
	this.cpf = cpf;
}

public Double getNota() {
	return nota;
}



public void setNota(Double nota) {
	this.nota = nota;
}




@Override
public String toString() {
	return "Aluno [nome=" + nome + ", numero=" + numero + ", cpf=" + cpf + " + nota=" + nota + "]";
}

}
