package entities;

public class Pedido {
	
	private boolean pendente = true;
	String local;
	Cliente cliente;
	Prestador prestador;
	
	public Pedido(String local, Cliente clinte, Prestador prestador, Cliente cliente) {
		this.local = local;
		this.cliente = cliente;
		this.prestador = prestador;
	}
	
	public boolean getStatusPedido() {
		return pendente;
	}
	
	public String toStringPrestador(){
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do cliente: " + cliente.getNome() + "\n");
		sb.append("Endereço: " + local + "\n");
		 return sb.toString();
	}
	
}
