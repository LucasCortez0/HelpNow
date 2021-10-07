package interfaces.iniciais;

import java.util.List;
import java.util.Scanner;

import entities.Categoria;
import entities.Prestador;

public class CadastroPrestador {
	
	public static Prestador view(Scanner sc, List<Prestador> prestadores, List<Categoria> categorias) {
		
		String email = null;
		
		System.out.print("\nDigite seu nome: ");
		String nome = sc.next();
			
		System.out.print("Digite seu email: "); 
		email = sc.next();	
			
		boolean emailValido = false;
		while(emailValido == false) {	
			if(prestadores.size() > 0) {
				for (int i = 0; i < prestadores.size(); i++) {
					if (email.equals(prestadores.get(i).getEmail())) {
						System.out.print("Este email já está cadastrado! \nDigite novamente: ");
						email = sc.next();
					}else if(i + 1 == prestadores.size()){
						emailValido = true;
					}
				}
			}else {
				emailValido = true;
			}
		}
			
		int senha1, senha2;
		do {
		System.out.print("Crie uma senha: ");
		senha1 = sc.nextInt();
		System.out.print("Confirme a senha: ");
		senha2 = sc.nextInt();
		if(senha1 != senha2) {
			System.out.println("\nAs senhas estão diferentes, tente novamente.\n");
		}
		}while(senha1 != senha2);
		
		//Fazer a exibição das opções de categorias e cargos!!!!!!!
		
		System.out.println("\nCadastro realizado com sucesso!");
		
		System.out.println("\nNome: " + nome + "\nEmail de acesso: " + email + "\nSenha de acesso: " + senha2);
		
		Prestador prestador = new Prestador(nome, email, senha2, cargo, categoria);	
		return prestador;
		
	}
	
	
}
