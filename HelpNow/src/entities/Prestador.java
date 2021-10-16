package entities;

import java.util.ArrayList;
import java.util.List;

public class Prestador {

	private List<Pedido> pedidos = new ArrayList<>(); 
	String nome, email;
	int senha;
	Categoria categoria;
	String cargo;
	double valorServico;
	
	public Prestador(String nome, String email, int senha, Categoria categoria, String cargo, double valorServico) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.categoria = categoria;
		this.cargo = cargo;
		this.valorServico = valorServico; 
	}
	
	public List<Pedido> getPedidos (){
		return pedidos;
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
