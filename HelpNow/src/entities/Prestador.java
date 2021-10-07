package entities;

public class Prestador {

	String nome, email;
	int senha;
	String categoria;
	String cargo;
	
	public Prestador(String nome, String email, int senha, String categoria, String cargo) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.categoria = categoria;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
