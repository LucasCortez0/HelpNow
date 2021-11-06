package interfaces.iniciais;

import java.util.Scanner;

public class JaCadastradoPrestador {
	
	public static int view(Scanner sc) {
		
		int opcao = 0;
		
		while(opcao < 1 || opcao > 2) {
			System.out.println("\n1. Login");
			System.out.println("2. Criar conta");
			System.out.print("Digite:");
			opcao = sc.nextInt();
			
			if(opcao < 1 || opcao > 2) {
				System.out.println("Opção inválida");
			}
		}
		
		return opcao;
	}
}
