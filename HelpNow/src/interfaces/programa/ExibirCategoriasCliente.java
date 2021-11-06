package interfaces.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.Inicializador;
import entities.Categoria;
import entities.Prestador;

public class ExibirCategoriasCliente {
	public static int numDigitado = 0;
	public static int cargoSelecionado = 0;
	
	public static void viewCategorias(Scanner sc, List<Categoria> categorias) {
		System.out.println("\nEscolha uma categoria que deseja contratar!");
		System.out.print(Inicializador.exibirCategorias());
		
		while(numDigitado < 1 || numDigitado > 5) {
			System.out.print("Digite: ");
			numDigitado = sc.nextInt();
			if (numDigitado < 1 || numDigitado > 5) {
				System.out.println("Categoria não encontrada!");
			}
		}
		numDigitado -= 1;
		System.out.println("Selecione: ");
		System.out.println(categorias.get(numDigitado));
		int numCargos = categorias.get(numDigitado).getTamanhoLista();
		
		while(cargoSelecionado < 1 || cargoSelecionado > numCargos) {
			System.out.print("Digite: ");
			cargoSelecionado = sc.nextInt();
			if(cargoSelecionado < 1 || cargoSelecionado > numCargos ) {
				System.out.println("Categoria não encontrada!");
			}
		}
		cargoSelecionado -= 1;
	}
	
	public static Prestador viewPrestadores(Scanner sc, List<Prestador> prestadores, List<Categoria> categorias){
		List<Prestador> prestadoresEscolhidos = new ArrayList<>();
		Categoria categoriaSelecionada = categorias.get(numDigitado);
		String cargo = categoriaSelecionada.getCargo(cargoSelecionado);
		for (int i = 0; i < prestadores.size(); i++) {
			if(prestadores.get(i).getCategoria() == categoriaSelecionada
			&& prestadores.get(i).getCargo().equals(cargo)){
				prestadoresEscolhidos.add(prestadores.get(i));
			}
		}
		int escolherPrestador = 0;
		if(prestadoresEscolhidos.size() < 1){
			System.out.println("Nenhum prestador encontrado!");
		}else {
			for (int i = 0; i < prestadoresEscolhidos.size(); i++) {
				System.out.println(i + 1 + ". " +  prestadoresEscolhidos.get(i));
			}
			
			while(escolherPrestador < 1 || escolherPrestador > prestadoresEscolhidos.size()) {
				System.out.print("Digite: ");
				escolherPrestador = sc.nextInt();
				if(escolherPrestador < 1 || escolherPrestador > prestadoresEscolhidos.size()){
					System.out.println("Prestador não encontado!");
				}	
			}
			System.out.println("Prestador selecionado");
			System.out.println(prestadoresEscolhidos.get(escolherPrestador - 1));
		}
		return prestadoresEscolhidos.get(escolherPrestador - 1);
	}
}
