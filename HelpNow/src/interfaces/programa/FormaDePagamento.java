package interfaces.programa;

import java.util.Scanner;

public class FormaDePagamento {

public static int view(Scanner sc) {
		
		int opcao = 0;
		
		while(opcao < 1 || opcao > 3) {
			System.out.println("\n1. Pix ");
			System.out.println("2. Debito ");
			System.out.println("3. Credito");
			
			System.out.print("Digite:");
			opcao = sc.nextInt();
			
			if(opcao < 1 || opcao > 3) {
				System.out.println("Opção inválida");
			}
		}
		
		return opcao;
	}
	
}
