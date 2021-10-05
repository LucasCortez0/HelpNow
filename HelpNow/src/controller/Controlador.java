package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Cliente;
import interfaces.iniciais.CadastroCliente;
import interfaces.iniciais.Inicio;
import interfaces.iniciais.Login;
	
public class Controlador {
	public static List<Cliente> clientes = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	
	public void controla() {
		byte clienteOuPrestador = Inicio.view(sc);
		int jaCadastrado = Login.view(sc);
		if(jaCadastrado == 2) {
			cadastrar(clienteOuPrestador);
		}
	}
	
	public static void cadastrar(byte clienteOuPrestador) {
		
		if (clienteOuPrestador == 1) {
				
		}else if(clienteOuPrestador == 2){
			
		clientes.add(CadastroCliente.view(sc, clientes));
			
		}
		
	}
}
