package interfaces.iniciais;

import java.util.Scanner;

public class JaCadastradoCliente {
	
	public static int view(Scanner sc) {
		
		int opcao = 0;
		
		while(opcao < 1 || opcao > 3) {
			System.out.println("\n1. Login");
			System.out.println("2. Criar conta");
			System.out.println("3. Categorias");
			System.out.print("Digite:");
			opcao = sc.nextInt();
			
			if(opcao < 1 || opcao > 3){
				System.out.println("Opção inválida");
			}
			
		} 
		
		return opcao;
	}
}
