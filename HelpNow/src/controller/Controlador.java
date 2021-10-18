package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import application.Inicializador;
import entities.Categoria;
import entities.Cliente;
import entities.Prestador;
import interfaces.iniciais.CadastroCliente;
import interfaces.iniciais.CadastroPrestador;
import interfaces.iniciais.Inicio;
import interfaces.iniciais.Login;
import interfaces.iniciais.LoginCliente;
import interfaces.iniciais.LoginPrestador;
import interfaces.programa.InterfacePrestador;
	
public class Controlador {
	public static List<Cliente> clientes = new ArrayList<>();
	public static List<Prestador> prestadores = new ArrayList<>();
	public static List<Categoria> categorias = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public void controla() {
		categorias = Inicializador.inicia();
		byte clienteOuPrestador = 1;
		while(clienteOuPrestador != 0) {
			clienteOuPrestador = Inicio.view(sc);
			int jaCadastrado = Login.view(sc);
			if(jaCadastrado == 2) {
				cadastrar(clienteOuPrestador);
			}else if(jaCadastrado == 1) {
				login(clienteOuPrestador);
			}
		}
	}
	
	public static void cadastrar(byte clienteOuPrestador) {
		
		if (clienteOuPrestador == 1) {
		
		prestadores.add(CadastroPrestador.view(sc, prestadores, categorias));
		InterfacePrestador.view(prestadores.get(prestadores.size() - 1), sc);
		}else if(clienteOuPrestador == 2){
			
		clientes.add(CadastroCliente.view(sc, clientes));
			
		}
		
	}
	
	public static void login(byte clienteOuPrestador) {
		if(clienteOuPrestador == 1) {
			LoginPrestador.view(prestadores, sc);
		} else if(clienteOuPrestador == 2) {
			LoginCliente.view(clientes, sc);
		}
	}
}
