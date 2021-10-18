package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import entities.Prestador;
import interfaces.programa.InterfacePrestador;

public class LoginPrestador {
	
	public static void view(List<Prestador> prestador, Scanner sc) {
		boolean emailExiste = false;
		sc.nextLine();
		Prestador prestadorSelecionado = null;
		while(emailExiste == false) {
			System.out.print("0 - Sair ");
			System.out.print("\nInforme seu email: ");		
			String email = sc.nextLine();
			if(email.equals("0")) {
				break;
			}
			if(prestador.size() == 0) {
				System.out.println("Email não encontrado");
			}else {
				
				for(int i = 0; i < prestador.size(); i++) {
					if(prestador.get(i).getEmail().equals(email)) {
						emailExiste = true;
						prestadorSelecionado = prestador.get(i);
					}else if(i + 1 == prestador.size()) {
						System.out.println("Email não encontrado");
					}		
				}
			}
		}
		if(emailExiste != false) {
			System.out.print("Informe sua senha: ");
			int senha = sc.nextInt();
			if(senha == prestadorSelecionado.getSenha()) {
				System.out.println("\nOlá " + prestadorSelecionado.getNome());
				InterfacePrestador.view(prestadorSelecionado, sc);
			}else {
				System.out.println("Senha incorreta\n");
			}
		}
	}
}
