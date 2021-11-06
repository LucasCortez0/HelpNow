package application;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;

public class Inicializador {
	
	public static List<Categoria> inicia() {
		
		List <Categoria> categorias = new ArrayList<>();
		Categoria reformasReparosDomesticos = new Categoria();
		categorias.add(reformasReparosDomesticos);
		Categoria servicosDomesticos = new Categoria();
		categorias.add(servicosDomesticos);
		Categoria assTecnica = new Categoria();
		categorias.add(assTecnica);
		Categoria eventos = new Categoria();
		categorias.add(eventos);
		Categoria transporte = new Categoria();
		categorias.add(transporte);
		
		categorias.get(0).addCargo("Encanador");
		categorias.get(0).addCargo("Eletricista");
		categorias.get(0).addCargo("Pedreiro");
		categorias.get(0).addCargo("Pintor");
				
		categorias.get(1).addCargo("Diarista");
		categorias.get(1).addCargo("Cozinheira");
		categorias.get(1).addCargo("Babá");
		categorias.get(1).addCargo("Passeador de cães");
		
		categorias.get(2).addCargo("Geladeira");
		categorias.get(2).addCargo("Maquina de lavar roupas");
		categorias.get(2).addCargo("TI - hardware e software");
		categorias.get(2).addCargo("Ar condicionado");
		
		categorias.get(3).addCargo("Buffet");
		categorias.get(3).addCargo("Recepcionista");
		categorias.get(3).addCargo("Segurança");
		categorias.get(3).addCargo("Decoração");
		categorias.get(3).addCargo("Garçom");
		
		categorias.get(4).addCargo("Ônibus");
		categorias.get(4).addCargo("Caminhão");
		
		return categorias;
	}
	
	public static String exibirCategorias() {
		StringBuilder sb = new StringBuilder();
		sb.append("1. Reformas e reparos domesticos\n" + "2. Servicos domesticos\n");
		sb.append("3. Assistencia tecnica\n" + "4. Eventos\n" + "5. Trasportes\n");
		return sb.toString();
	}
}
