package application;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;

public class Inicializador {
	public static List<Categoria> inicia() {
	
		List <Categoria> categorias = new ArrayList<>();
		Categoria reformasReparosDomesticos = new Categoria();
		reformasReparosDomesticos.addCargo("Encanador");
		reformasReparosDomesticos.addCargo("Eletricista");
		reformasReparosDomesticos.addCargo("Pedreiro");
		reformasReparosDomesticos.addCargo("Pintor");
		categorias.add(reformasReparosDomesticos);
		
		Categoria servicosDomesticos = new Categoria();
		servicosDomesticos.addCargo("Diarista");
		servicosDomesticos.addCargo("Cozinheira");
		servicosDomesticos.addCargo("Babá");
		servicosDomesticos.addCargo("Passeador de cães");
		categorias.add(servicosDomesticos);
		
		Categoria assTecnica = new Categoria();
		assTecnica.addCargo("Geladeira");
		assTecnica.addCargo("Maquina de lavar roupas");
		assTecnica.addCargo("TI - hardware e software");
		assTecnica.addCargo("Ar condicionado");
		categorias.add(assTecnica);
		
		Categoria eventos = new Categoria();
		eventos.addCargo("Buffet");
		eventos.addCargo("Recepcionista");
		eventos.addCargo("Segurança");
		eventos.addCargo("Decoração");
		eventos.addCargo("Garçom");
		categorias.add(eventos);
		
		Categoria transporte = new Categoria();
		transporte.addCargo("Ônibus");
		transporte.addCargo("Caminhão");
		categorias.add(transporte);
		return categorias;
	}
	
	public static String exibirCategorias() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. Reformas e reparos domesticos\n" + "2. Servicos domesticos\n");
		sb.append("3. Assistencia tecnica\n" + "4. Eventos\n" + "5. Trasportes\n");
		return sb.toString();
	}
}
