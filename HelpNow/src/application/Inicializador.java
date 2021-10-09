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
		servicosDomesticos.addCargo("Bab�");
		servicosDomesticos.addCargo("Passeador de c�es");
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
		eventos.addCargo("Seguran�a");
		eventos.addCargo("Decora��o");
		eventos.addCargo("Gar�om");
		categorias.add(eventos);
		
		Categoria transporte = new Categoria();
		transporte.addCargo("�nibus");
		transporte.addCargo("Caminh�o");
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
