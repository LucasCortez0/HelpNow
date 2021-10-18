package interfaces.programa;

import java.util.List;
import java.util.Scanner;	

import entities.Pedido;
import entities.Prestador;

public class InterfacePrestador {
	
	public static void view(Prestador prestador, Scanner sc) {
		
		byte opc = -1;
		while(opc != 0) {
			System.out.println("1. Servi�os pendentes");
			System.out.println("2. Servi�os concluidos");
			System.out.println("0. Sair");		
			System.out.print("Selecione: ");		
			opc = sc.nextByte();
			if(opc < 0 || opc > 2) {
				System.out.println("Op��o inv�lida!");
			}
		
			if(opc == 1) {
				servicosPendentes(prestador, sc);
			}else if(opc == 2) {
				servicosConcluidos(prestador, sc);
			}
		}
		
	}
	
	public static void servicosPendentes(Prestador prestador, Scanner sc) {
		List<Pedido> pedidos = prestador.getPedidos();
	
		for(int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).getStatusPedido() == true) {
				System.out.println(pedidos.get(i));
			}
		}		
	}
	
	public static void servicosConcluidos(Prestador prestador, Scanner sc) {
		
		List<Pedido> pedidos = prestador.getPedidos();	
		
		for(int i = 0; i < pedidos.size(); i++) {
			if(pedidos.get(i).getStatusPedido() == false) {
				System.out.println(pedidos.get(i));
			}
		}
	}	
	
}
