package interfaces.iniciais;

import java.util.Scanner;

public class Inicio {
	
	public static byte view(Scanner sc) {
		
		byte opcao = -1;
				
		System.out.println("|||||||||| HelpNow ||||||||||\n");
		while(opcao < 0 || opcao > 2) {
			System.out.println("\nComo deseja acessar a plataforma: ");
			System.out.println("0. Sair");
			System.out.println("1. Prestar serviço");
			System.out.println("2. Cliente");
			System.out.print("Digite: ");
			opcao = sc.nextByte();
			if(opcao < 0 || opcao > 2) {
				System.out.println("Comando desconhecido!");
			}
		}
		return opcao;
	}
}

